package com.cc.cocktail.mvc.service.base;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cc.cocktail.mvc.dao.BaseSqlSessionDao;


/**   
* @Type: BaseService.java 
* @Desc: 
* @author bielu  
* @date Jul 11, 2017 12:40:21 PM 
* @version V1.0   
*/
@Service("baseService")
public class BaseService {

	@Resource(name = "sqlSessionDao")
	private BaseSqlSessionDao dao;
	
	public String getNameById(int id) {
		return dao.getSqlSession().selectOne("testSQL.queryNameById", id);
	}
}
