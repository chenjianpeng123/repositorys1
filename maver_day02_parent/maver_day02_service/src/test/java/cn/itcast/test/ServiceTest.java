package cn.itcast.test;

import cn.itcast.domain.Items;
import cn.itcast.mapper.ItemsMapper;
import cn.itcast.service.ItemsService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {

    @Test
    public void test() {
        ApplicationContext app = new ClassPathXmlApplicationContext("classpath*:/spring/applicationContext*.xml");
        ItemsService bean = app.getBean(ItemsService.class);
        Items byId = bean.findById(1);
        System.out.println(byId.getName());

    }
}
