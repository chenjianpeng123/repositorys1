package cn.itcast.service.impl;


import cn.itcast.domain.Items;
import cn.itcast.mapper.ItemsMapper;
import cn.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsMapper itemsMapper;

    public Items findById(Integer id) {
        return itemsMapper.findById(id);
    }
}
