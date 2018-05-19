package org.example.demo.ticket.webapp.rest.resource;

import org.example.demo.ticket.business.ManagerFactory;

public abstract class AbstractResource {

	private static ManagerFactory managerFactory;
	
	protected ManagerFactory getManagerFactory() {
		return managerFactory;
	}
	
	public static void setManagerFactory(ManagerFactory pManagerFactory) {
		managerFactory = pManagerFactory;
	}
}
