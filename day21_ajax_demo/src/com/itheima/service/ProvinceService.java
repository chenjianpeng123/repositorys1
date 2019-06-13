package com.itheima.service;

import com.itheima.domain.City;
import com.itheima.domain.Province;

import java.util.List;

/**
 * 省的业务接口
 */
public interface ProvinceService {

    /**
     * 查询所有省份数据
     * @return
     */
    public List<Province> findAll();

    /**
     * 根据省份编号，查询省下的所有城市
     * @param pcode
     * @return
     */
    List<City> findAllByPcode(String pcode);
}
