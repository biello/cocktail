package com.cc.cocktail.mvc.service.sample;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.cc.cocktail.mvc.dao.BaseSqlSessionDao;
import com.cc.cocktail.mvc.service.base.BaseService;

/**   
* @Type: SampleService.java 
* @Desc: 
* @author bielu  
* @date Jul 11, 2017 12:40:45 PM 
* @version V1.0   
*/
@Service("sampleService")
public class SampleService extends BaseService {
	
	@Resource(name = "SqlSessionTemplate")
	private SqlSessionTemplate dao;
	
	public Object getSampleData() {
		return "sample";
	}
	
	public String getNameById(int id) {
		return dao.selectOne("testSQL.queryNameById", id);
	}
	
}
