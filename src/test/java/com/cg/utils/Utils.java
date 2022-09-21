package com.cg.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cg.stepdef.LoginStepDef;

public class Utils {
public static void captureScreen()
{
	TakesScreenshot ts=(TakesScreenshot)LoginStepDef.driver;
	File myscreenshot=ts.getScreenshotAs(OutputType.FILE);
	
	try {
		FileUtils.copyFile(myscreenshot, new File("ScreenShots/Screen1.jpeg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
