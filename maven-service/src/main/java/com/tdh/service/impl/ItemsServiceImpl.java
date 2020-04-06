package com.tdh.service.impl;

import com.tdh.dao.ItemsDao;
import com.tdh.domain.Items;
import com.tdh.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    @Override
    public Items findById(int id) {
        return itemsDao.findById(id);
    }
}
