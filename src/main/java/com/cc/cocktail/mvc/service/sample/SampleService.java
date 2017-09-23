package com.cc.cocktail.mvc.service.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	public Object getSampleData() {
		return "sample";
	}
	
	public String getNameById(int id) {
		
		log.warn("根据id：{}，查询姓名", id);
		return dao.getSqlSession().selectOne("testSQL.queryNameById", id);
	}
	
}
