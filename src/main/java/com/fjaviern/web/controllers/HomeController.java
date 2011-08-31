package com.fjaviern.web.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.fjaviern.web.apps.HomeApp;

/**
 * @author fjaviern
 *
 */
public class HomeController implements Controller {
	private HomeApp homeApp;
	public HomeApp getHomeApp() { return homeApp; }
	public void setHomeApp(HomeApp homeApp) { this.homeApp = homeApp; }
	
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		return new ModelAndView("home/index");
	}
	
	
}
