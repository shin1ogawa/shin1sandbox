package com.shin1ogawa.controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class IndexController implements Filter {
	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse resp,
			FilterChain arg2) throws IOException, ServletException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		Logger.getLogger(IndexController.class.getName()).info("Initialized IndexController");
	}
}
