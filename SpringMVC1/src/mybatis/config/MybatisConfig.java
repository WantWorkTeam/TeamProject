package mybatis.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisConfig {
	private static MybatisConfig instance;
	SqlSessionFactory sqlSessionFactory;
	//싱글톤으로.....
	private MybatisConfig(){
		init();
	}
	
	public static MybatisConfig getInstance() {
		if(instance == null){
			instance= new MybatisConfig();
		}
		return instance;
	}
	public void init(){
		try {
			InputStream is=Resources.getResourceAsStream("mybatis/config/config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public SqlSession getSession(){
		return sqlSessionFactory.openSession();
	}
	
	public void closeSession(SqlSession session){
		session.close();
	}
}










