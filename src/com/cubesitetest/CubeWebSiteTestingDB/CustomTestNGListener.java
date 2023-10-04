package com.cubesitetest.CubeWebSiteTestingDB;

//import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomTestNGListener extends TestListenerAdapter implements ITestListener{
    private Connection connection;
    //private Date suiteStartTime;
    //private Date suiteEndTime; 
		
	
    public CustomTestNGListener() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://oktovia.tplinkdns.com:3306/Testreports", "root", "Cube@simple");
            System.out.println("DB connected!");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void onTestSuccess(ITestResult result) {
        logTestResult(result, "SUCCESS");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        logTestResult(result, "FAILURE");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        logTestResult(result, "SKIPPED");
    }
    
    private void logTestResult(ITestResult result, String status) {
        try {
            String sql = "INSERT INTO cubeweb_test_results (test_name, status, duration, last_run_time, execution_date) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, result.getName());
            statement.setString(2, status);
            statement.setLong(3, result.getEndMillis() - result.getStartMillis());
            statement.setString(4, getCurrentTimestamp());
            statement.setString(5, getCurrentDate());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private String getCurrentTimestamp() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(new Date());
    }

    private String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(new Date());
    }

    
}

