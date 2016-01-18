package cn.fengyu.frame.mybatis.mapper;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2016/1/18.
 */
public class UserMapperTest {

    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void setUp() throws IOException {
         InputStream inputStream = Resources.getResourceAsStream("mybatis/SqlMapConfig.xml");
        sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);

    }

   @Test
    public void testFindUserById() throws Exception {

    }
    @Test
    public void testInsertUser() throws Exception {

    }
   @Test
    public void testDeleteUser() throws Exception {
            SqlSession sqlSession= sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
       //userMapper.deleteUser(26);

   }
}