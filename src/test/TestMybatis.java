package test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import entity.Classes;
import util.MybatisUtils;

public class TestMybatis {

	@Test
	public void selectClass(){
		SqlSession session = MybatisUtils.getSession();
		String str = "mapper.classMapper.getClass2";
		Classes cla = session.selectOne(str, 1);
		System.out.println(cla);
		session.close();
	}
}	
