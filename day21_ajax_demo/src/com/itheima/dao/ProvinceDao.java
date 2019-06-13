package com.itheima.dao;

import com.itheima.domain.City;
import com.itheima.domain.Province;

import java.util.List;

/**
 * 省的数据访问接口
 */
public interface ProvinceDao {

    /**
     * 查询所有省份数据
     * @return
     */
    public List<Province> findAll();

    /**
     * 根据省份编号获取省份下的所有城市数据
     * @param pcode
     * @return
     */
    List<City> findAllByPcode(String pcode);
}
