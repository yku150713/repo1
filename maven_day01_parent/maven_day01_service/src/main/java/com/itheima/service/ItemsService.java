package com.itheima.service;

import com.itheima.domain.Items;

public interface ItemsService {
    Items findById(Integer integer);

    public void save(Items items);
}
