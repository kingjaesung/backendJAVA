package com.mvc.common.util;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;


// 이 클래스는 ServletContextListener를 구현한 리스너로, 웹 애플리케이션 시작 및 종료 시점에 동작
public class DriverCleanupListener implements ServletContextListener {


    public DriverCleanupListener() {

    }


    public void contexttDestroyed(ServletContextEvent sre)  {
    	//DriverManager,getDrivers()를 통해 등록된 JDBC 드라이버 목록을 가져온다.
    	Enumeration<Driver> drivers = DriverManager.getDrivers();

    	while(drivers.hasMoreElements()) {
    		Driver driver = drivers.nextElement();
    		try {
				// 각 드라이버가 현재 웹 애플리케이션의 클래스 로더에 의해 로드된 것인지 확인
    			if(driver.getClass().getClassLoader() == Thread.currentThread().getContextClassLoader()) {
    				//해당 드라이버를 DriverManager.deregisterDriver()로 해제하여 메모리 누수 방지
    				DriverManager.deregisterDriver(driver);
    				System.out.println("Info JDBC 드라이버 해제딤:" + driver );
    			}
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}

    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */


    @Override
    public void contextInitialized(ServletContextEvent sce) {
    	//필요 시 초기 작업
    }

}
