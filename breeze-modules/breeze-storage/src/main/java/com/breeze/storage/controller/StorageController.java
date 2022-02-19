package com.breeze.storage.controller;

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
    public String addStorage() {
        storageService.addStorage();
        return "ok";
    }

    @GetMapping("/get")
    public String getStorageProductName() {
        Storage storage = storageService.getStorage();
        return storage.getProductName();
    }



}
