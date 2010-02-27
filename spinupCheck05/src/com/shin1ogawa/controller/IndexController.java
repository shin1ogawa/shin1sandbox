package com.shin1ogawa.controller;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class IndexController extends WebPage {

	public IndexController() {
		add(new Label("message", "Hello, world."));
	}
}
