package com.shin1ogawa;


import java.util.logging.Logger;

import org.apache.wicket.Application;
import org.apache.wicket.protocol.http.HttpSessionStore;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.session.ISessionStore;

import com.shin1ogawa.controller.IndexController;

/**
 * @author shin1ogawa
 */
public class WicketApplication extends WebApplication {

	static final Logger LOGGER = Logger.getLogger(WicketApplication.class.getName());



	@Override
	public Class<IndexController> getHomePage() {
		return IndexController.class;
	}

	@Override
	protected void init() {
		super.init();
	}

	@Override
	public String getConfigurationType() {
		return Application.DEPLOYMENT;
	}

	@Override
	protected ISessionStore newSessionStore() {
		return new HttpSessionStore(this);
	}
}
