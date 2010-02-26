package com.shin1ogawa.controller;

import java.io.IOException;

import javax.servlet.ServletException;

import org.t2framework.t2.annotation.core.Default;
import org.t2framework.t2.annotation.core.Page;
import org.t2framework.t2.navigation.SimpleText;
import org.t2framework.t2.spi.Navigation;

@Page("/")
public class IndexPage {
	@Default
	public Navigation doFilter() throws IOException, ServletException {
		return new SimpleText("Hello, world");
	}
}
