package com.itheima.dao.impl;

import com.itheima.dao.ProvinceDao;
import com.itheima.domain.City;
import com.itheima.domain.Province;
import com.itheima.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * 省的数据访问实现类
 */
public class ProvinceDaoImpl implements ProvinceDao {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<Province> findAll() {
        return jdbcTemplate.query("select * from t_province order by id ",
                new BeanPropertyRowMapper<Province>(Province.class));
    }

    @Override
    public List<City> findAllByPcode(String pcode) {
        return jdbcTemplate.query("select * from t_city where pcode = ? order by id",
                new BeanPropertyRowMapper<City>(City.class), pcode);
    }

    public static void main(String[] args) {
        /*List<Province> list = new ProvinceDaoImpl().findAll();
        for (Province province : list) {
            System.out.println(province);
        }*/

        List<City> list = new ProvinceDaoImpl().findAllByPcode("610000");
        for (City city : list) {
            System.out.println(city);
        }
    }
}
