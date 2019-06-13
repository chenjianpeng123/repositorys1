package com.itheima.service.impl;

import com.itheima.dao.ProvinceDao;
import com.itheima.dao.impl.ProvinceDaoImpl;
import com.itheima.domain.City;
import com.itheima.domain.Province;
import com.itheima.service.ProvinceService;

import java.util.List;

/**
 * 省的业务实现
 */
public class ProvinceServiceImpl implements ProvinceService {

    private ProvinceDao provinceDao = new ProvinceDaoImpl();

    @Override
    public List<Province> findAll() {
        return provinceDao.findAll();
    }

    @Override
    public List<City> findAllByPcode(String pcode) {
        return provinceDao.findAllByPcode(pcode);
    }
}
