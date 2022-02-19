package com.breeze.breezegateway.filter;

import com.breeze.breezegateway.IgnoreWhiteProperties;
import com.breeze.breezegateway.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

/**
 * 全局过滤器
 *
 * @author pupil
 */
@Component
public class AuthFilter implements GlobalFilter, Ordered {

    // 排除过滤的 uri 地址，nacos自行添加
    @Autowired
    private IgnoreWhiteProperties ignoreWhite;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        ServerHttpRequest.Builder mutate = request.mutate();
        String url = request.getURI().getPath();
        // 跳过不需要验证的路径
        List<String> whites = ignoreWhite.getWhites();
        if (StringUtils.matches(url, whites)){
            return chain.filter(exchange);
        }
        String token = exchange.getRequest().getQueryParams().getFirst("token");
        if (null == token){
            ServerHttpResponse response = exchange.getResponse();
            response.getHeaders().add("Content-Type", "application/json; charset=utf-8");
            String message = "{\"message\":\"请求token信息不能为空\"}";
            DataBuffer buffer = response.bufferFactory().wrap(message.getBytes());
            return response.writeWith(Mono.just(buffer));
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder()
    {
        return 0;
    }
}