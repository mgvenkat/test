package com.HRMS.Scripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.HRMS.lib.General;

public class TC002 {
	//public static void main(String args[]) throws InterruptedException {
	@Test
	public void tc002() throws InterruptedException {
		DOMConfigurator.configure("Log4j.xml");
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.addEmp();
		obj.delEmp();
		obj.logout();
		obj.closeApplication();

}
}