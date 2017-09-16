package com.cc.cocktail.mvc.service.base;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;


/**   
* @Type: BaseService.java 
* @Desc: 
* @author bielu  
* @date Jul 11, 2017 12:40:21 PM 
* @version V1.0   
*/
@Service("baseService")
public class BaseService {

	@Resource(name = "SqlSessionTemplate")
	protected SqlSessionTemplate dao;
	
	
}
