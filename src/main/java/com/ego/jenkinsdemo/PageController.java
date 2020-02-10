package com.ego.jenkinsdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhoubin
 * @create 2020/1/17
 * @since 1.0.0
 */
@Controller
public class PageController {

	@RequestMapping("/{page}")
	public String page(@PathVariable String page) {
		return page;
	}
}