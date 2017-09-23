package com.cc.cocktail.mvc.service.base;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
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
	protected BaseSqlSessionDao dao;
	
	
}
