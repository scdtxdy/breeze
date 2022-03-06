package com.breeze.storage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.breeze.storage.domain.Storage;
import com.breeze.storage.mapper.StorageMapper;
import com.breeze.storage.service.StorageService;
import io.seata.core.context.RootContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StorageServiceImpl extends ServiceImpl<StorageMapper, Storage> implements StorageService {

    private static final Logger log = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Override
    @Transactional
    public void addStorage() {
        log.info("=============ACCOUNT storage START=================");
        log.info("当前 XID: {}", RootContext.getXID());
        Storage storage = new Storage();
        storage.setProductName("000");
        this.save(storage);
    }

    @Override
    public Storage getStorage() {
        Storage storage = this.getById(1l);
        return storage;
    }
}
