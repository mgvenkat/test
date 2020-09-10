package com.HRMS.Scripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.HRMS.lib.General;
import com.HRMS.utility.Log;

public class TC001 {
	//public static void main(String args[]) throws InterruptedException {
	@Test
	public void tc001() throws InterruptedException {
		DOMConfigurator.configure("Log4j.xml");
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();
		
		
		
	}

}
