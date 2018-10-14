package com.itheima.dao;

import com.itheima.domain.Items;

public interface ItemsDao {
    /**
     * 根据id查询一条记录
     * @param integer
     * @return
     */
  public Items findById(Integer integer);

    /**
     * 保存一条记录
     * @param items
     */
 public void save(Items items);
}
