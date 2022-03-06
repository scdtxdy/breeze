package com.breeze.api.storage;

import com.breeze.api.storage.domain.Storage;
import com.breeze.api.storage.factory.RemoteStorageFallbackFactory;
import com.breeze.common.core.constant.ServiceNameConstants;
import com.breeze.common.core.domain.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 文件服务
 * 
 * @author ruoyi
 */
@FeignClient(contextId = "remoteStorageService", value = ServiceNameConstants.STORAGE_SERVICE, fallbackFactory = RemoteStorageFallbackFactory.class)
public interface RemoteStorageService
{
    /**
     * 添加库存
     */
    @PostMapping(value = "/storage/add")
    R<String> addStorage();

    /**
     * 获取库存数据
     */
    @GetMapping("/storage/get")
    R<String> getStorage();
}
