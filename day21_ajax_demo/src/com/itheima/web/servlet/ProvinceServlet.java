package com.itheima.web.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.domain.Province;
import com.itheima.service.ProvinceService;
import com.itheima.service.impl.ProvinceServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ProvinceServlet")
public class ProvinceServlet extends HttpServlet {

    private ProvinceService provinceService = new ProvinceServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //调用业务方法查询所有省份数据
        List<Province> list = provinceService.findAll();

        //设置响应输出流的编码
        response.setContentType("text/html;charset=UTF-8");

        //将list转换为json字符串输出
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(response.getWriter(), list);
    }
}
