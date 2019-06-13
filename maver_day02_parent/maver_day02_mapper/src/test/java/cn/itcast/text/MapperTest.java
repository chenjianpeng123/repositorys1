package cn.itcast.text;

import cn.itcast.domain.Items;
import cn.itcast.mapper.ItemsMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapperTest {

    @Test
    public void test(){
        ApplicationContext app = new ClassPathXmlApplicationContext("/spring/applicationContext-mapper.xml");
        ItemsMapper itemsMapper = app.getBean(ItemsMapper.class);
        Items items = itemsMapper.findById(1);
        System.out.println(items.getName());
    }
}
