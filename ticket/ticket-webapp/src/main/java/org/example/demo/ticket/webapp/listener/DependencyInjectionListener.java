package org.example.demo.ticket.webapp.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.example.demo.ticket.business.ManagerFactory;
import org.example.demo.ticket.webapp.rest.resource.AbstractResource;

public class DependencyInjectionListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// Création de l'instance ManagerFactory
		ManagerFactory vManagerFactory= new ManagerFactory();
		
		// Injection de l'instance ManagerFactory dans la classe AbstractResource
		AbstractResource.setManagerFactory(vManagerFactory);
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}



}
