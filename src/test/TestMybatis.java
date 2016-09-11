package test;

import java.util.Date;
import java.util.List;

import mapper.UserMapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("../beans.xml")
public class TestMybatis {

	@Autowired
	UserMapper userMapper;
	@Test
	public void addUser(){
		userMapper.save(new User(-1, "Èöµ©", new Date(), 40000f));
	}
	
	@Test
	public void selectUser(){
		List<User> list= userMapper.findAll();
		System.out.println(list);
	}
}	
