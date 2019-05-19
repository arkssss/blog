package com.along.blog;

import com.along.blog.entity.Emp;
import com.along.blog.service.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 你好，我是老齐，在学习过程中遇到任何问题可以加我的QQ群722570599
 在这里老齐将给你直接提供帮助与支持，只为你可以学的更轻松。
 群里还有更多干货等你来学习。
 */
@RunWith(SpringRunner.class)
@SpringBootTest //SpringBootTest的作用就是在Junit启动的时候自动初始化SpringBoot的IOC容器
public class Ch14SpringcacheApplicationTests {

	@Resource
	private EmpService empService ;

	@Autowired
	private RedisTemplate redisTemplate;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testFindById(){

		//stringRedisTemplate.opsForValue().set("test", "100",60*10,TimeUnit.SECONDS);//向redis里存入数据和设置缓存时间

		redisTemplate.opsForValue().set("along"  , "this igggs along" ,20 , TimeUnit.SECONDS);
		System.out.println( redisTemplate.opsForValue().get("along") ) ;

		empService.findById(1000);
		empService.findById(1000);
		empService.findById(1000);
		empService.findById(1000);
		empService.findById(1000);
		Emp emp = empService.findById(1000);
        System.out.println(emp.getName());
	}

    @Test
    public void testEmpRank() {
        List<Emp> list = empService.getEmpRank();
        System.out.println(list.get(list.size() - 1).getName());
	}
	@Test
    public void testCreate(){
	    empService.create(new Emp(1002 , "emp" + new Date().getTime() , new Date() , 1234f , "MARKET"));
    }

    @Test
    public void testUpdate(){
        empService.update(new Emp(1002 , "u-emp" + new Date().getTime() , new Date() , 1234f , "MARKET"));
    }
    @Test
    public void testDelete(){
	    empService.delete(1002);
    }
}
