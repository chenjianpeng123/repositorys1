package com.itheima.web.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.domain.City;
import com.itheima.service.ProvinceService;
import com.itheima.service.impl.ProvinceServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/CityServlet")
public class CityServlet extends HttpServlet {

    private ProvinceService provinceService = new ProvinceServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //接收参数：pcode
        String pcode = request.getParameter("pcode");

        //调用service层，获取省份下的城市数据
        List<City> list = provinceService.findAllByPcode(pcode);

        //将list转换成json输出
        response.setContentType("application/json;charset=UTF-8");
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(response.getWriter(), list);

    }
}
