package com.cc.cocktail.mvc.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**   
* @Type: BaseSqlSessionDao.java 
* @Desc: 
* @author bielu  
* @date Jul 11, 2017 3:02:24 PM 
* @version V1.0   
*/
public class BaseSqlSessionDao {
	
	protected Logger log = LoggerFactory.getLogger(this.getClass());
	
	private SqlSessionTemplate sqlSession;
	
	/**
	 * 构造方式注入
	 * 
	 * @param sqlSessionFactory
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 */
	public BaseSqlSessionDao(SqlSessionFactory sqlSessionFactory) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		this.sqlSession = new SqlSessionTemplate(sqlSessionFactory);
	}

	public SqlSessionTemplate getSqlSession() {
		return this.sqlSession;
	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
}
