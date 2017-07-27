package com.cc.cocktail.mvc.controller.sample;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cc.cocktail.mvc.controller.base.BaseController;
import com.cc.cocktail.mvc.service.sample.SampleService;

/**   
* @Type: sampleController.java 
* @Desc: 
* @author bielu  
* @date Jul 11, 2017 11:07:58 AM 
* @version V1.0   
*/
@RestController
@RequestMapping("/sample")
public class SampleController extends BaseController{
	
	@Resource(name = "sampleService")
	SampleService sampleService;
	
	@RequestMapping("/sample")
	public Object sample() {
		ModelAndView view = new ModelAndView("sample/sample");
		Object data = sampleService.getNameById(1);
		view.addObject("data", data);
		return view;
	}
}
