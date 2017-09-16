package com.cc.cocktail.mvc.service.sample;

import org.springframework.stereotype.Service;

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
	
	
	public Object getSampleData() {
		return "sample";
	}
	
	public String getNameById(int id) {
		return dao.selectOne("testSQL.queryNameById", id);
	}
	
}
