package com.breeze.storage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.breeze.storage.domain.Storage;
import com.breeze.storage.mapper.StorageMapper;
import com.breeze.storage.service.StorageService;
import org.springframework.stereotype.Service;

@Service
public class StorageServiceImpl extends ServiceImpl<StorageMapper, Storage> implements StorageService {

    @Override
    public void addStorage() {
        Storage storage = new Storage();
        this.save(storage);
    }

    @Override
    public Storage getStorage() {
        Storage storage = this.getById(1l);
        return storage;
    }
}
