package com.breeze.storage.mapper;

import com.breeze.commom.datasource.config.BreezeBaseMapper;
import com.breeze.storage.domain.Storage;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StorageMapper extends BreezeBaseMapper<Storage> {

    Storage getById(Long id);
}
