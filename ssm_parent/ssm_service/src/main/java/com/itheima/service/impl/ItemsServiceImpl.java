package com.itheima.service.impl;

import com.itheima.dao.ItemsMapper;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {


    @Autowired
    private ItemsMapper itemsMapper;

    public Items findById(int id) {

        return  itemsMapper.findById(id);
    }

}
