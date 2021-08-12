package com.af.constants;

public class FrameworkConstants {

private FrameworkConstants(){};
	
	private static final String RESOURCEPATH = System.getProperty("user.dir")+"/src/test/resources";
	private static final String CONFIGFILEPATH = RESOURCEPATH+"/config/config.properties";
	private static final int EXPLICITWAIT=10;
	private static final String EXTENTREPORTPATH = System.getProperty("user.dir")+"/ExtentReport/index.html";
	private static final String EXCELPATH = RESOURCEPATH+"/excel/testdataexecution.xlsx";
	private static final String RUNMANAGERSHEET ="RUNMANAGER";
	private static final String TESTDATA ="DATA";
	
	public static String getConfigFilePath() {
		return CONFIGFILEPATH;
	}
	
	public static int getExplicitWait() {
		return EXPLICITWAIT;
	}
	
	public static String getExtentReportPath() {
		return EXTENTREPORTPATH;
	}
	public static String getExcelPath() {
		return EXCELPATH;
	}
	
	public static String getRunManagerSheet() {
		return RUNMANAGERSHEET;
	}

	public static String getTestDataSheet() {
		return TESTDATA;
	}
}
