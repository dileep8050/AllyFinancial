package com.af.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.af.reports.ExtentLogger;
import com.af.reports.ExtentReport;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class ListenerClass implements ITestListener, ISuiteListener {

	public void onStart(ISuite suite) {
		ExtentReport.initExtentReport();
	}

	public void onFinish(ISuite suite) {
		ExtentReport.flushReports();
	}

	public void onTestStart(ITestResult result) {
		ExtentReport.createTest(result.getMethod().getMethodName());
		String description=result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class).description();
		
		if(!description.isEmpty()) {
			ExtentLogger.info(MarkupHelper.createLabel("<p style='color:black'><strong>Test case Description :</strong></p> "+description, ExtentColor.GREEN));
		}
		
		ExtentReport.addgroups(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class).groups());
	}

	public void onTestSuccess(ITestResult result) {
		ExtentLogger.pass(result.getMethod().getMethodName()+" : is passed", true);
	}

	public void onTestFailure(ITestResult result) {
		ExtentLogger.fail(result.getThrowable(),true);
	}

	public void onTestSkipped(ITestResult result) {
		ExtentLogger.skip(result.getThrowable(), result.getMethod().getMethodName()+" : is skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	}

	public void onStart(ITestContext context) {
	}

	public void onFinish(ITestContext context) {
	}
}

