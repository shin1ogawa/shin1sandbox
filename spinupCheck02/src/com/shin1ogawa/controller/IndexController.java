package com.shin1ogawa.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class IndexController extends Controller {

	@Override
	protected Navigation run() {
		try {
			response.setContentType("text/plain");
			response.getWriter().println("Hello, world");
		} catch (Throwable th) {
			Logger.getLogger(IndexController.class.getName()).log(
					Level.WARNING, "error.", th);
		}
		return null;
	}
}
