package mybatis;

import mybatis.dao.ArticleTypeMapper;
import mybatis.entity.ArticleType;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 创建时间2022/3/1
 * 创建作者杨启
 **/
public class TestMybatis {
    @Test
    public void testConn() throws IOException {
        // 1. 核心配置文件的位置
        String confPath = "mybatis-config.xml";
        // 2. 通过流的方式去读取这个配置文件
        // Unhandled exception: java.io.IOException
        InputStream inputStream = Resources.getResourceAsStream(confPath);
        // 3. 通过会话工厂构建器（SqlSessionFactoryBuilder）来构建一个会话工厂（SqlSessionFactory）
        // 设计模式23-工厂模式
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 4. 通过会话工厂（SqlSessionFactory）的到一个会话（SqlSession）
        // 设计模式23种-单例模式
        SqlSession session = sessionFactory.openSession();

        // 5. 通过会话（SqlSession）获取Dao层接口的对象/实例
        // 装饰模式
        ArticleTypeMapper articleTypeMapper = session.getMapper(ArticleTypeMapper.class);
        // 6. 通过接口的实例化对象调用方法
        List<ArticleType> list = articleTypeMapper.getArticleTypeAll();
        list.forEach(System.out::println);

    }
}
