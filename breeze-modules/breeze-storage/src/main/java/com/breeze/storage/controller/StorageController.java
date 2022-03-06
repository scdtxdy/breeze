package com.breeze.storage.controller;

import com.breeze.common.core.domain.R;
import com.breeze.storage.domain.Storage;
import com.breeze.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/storage")
public class StorageController {
    
    @Autowired
    private StorageService storageService;

    @PostMapping("/add")
    public R<String> addStorage() {
        storageService.addStorage();
        return R.ok("ok");
    }

    @GetMapping("/get")
    public R<String> getStorageProductName() {
        Storage storage = storageService.getStorage();
        return R.ok(storage.getProductName());
    }



}
