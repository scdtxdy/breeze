package com.breeze.api.storage.factory;

import com.breeze.api.storage.RemoteStorageService;
import com.breeze.api.storage.domain.Storage;
import com.breeze.common.core.domain.R;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;


@Component
public class RemoteStorageFallbackFactory implements FallbackFactory<RemoteStorageService>
{
    private static final Logger log = LoggerFactory.getLogger(RemoteStorageFallbackFactory.class);

    @Override
    public RemoteStorageService create(Throwable throwable)
    {
        log.error("库存服务调用失败:{}", throwable.getMessage());
        return new RemoteStorageService()
        {
            @Override
            public R<String> addStorage() {
                return R.fail("添加库存失败:" + throwable.getMessage());
            }

            @Override
            public R<String> getStorage() {
                return R.fail("获取库存失败:" + throwable.getMessage());
            }
        };
    }
}
