package java;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import com.itheima.service.impl.ItemsServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {
    @Test
    public void show(){
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("classpath:spring-service.xml");
        ItemsService itemsService = ((ItemsServiceImpl) applicationContext.getBean("itemsServiceImpl"));
        Items items = new Items();
        items.setName("测试事务");
        itemsService.save(items);
    }
}