package login

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class health_care {
	@Keyword
	public static void userLoginTest() 
	{
		WebUI.click(findTestObject('Wellnesscorner_07/My_Health_File/My_Health_File_Tab'))
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Wellnesscorner_07/My_Health_File/Add_Health_Record_Tab'))
		
		WebUI.delay(2)
		
		WebUI.setText(findTestObject('Wellnesscorner_07/My_Health_File/Enter_Name_HealthRecord_Tab'), 'test')
		
		WebUI.uploadFile(findTestObject('Wellnesscorner_07/My_Health_File/Description_Tab'), 'D:\\\\Hitesh Chandankar\\\\Desktop\\\\PNG File (.PNG)')
		
		WebUI.setText(findTestObject('Wellnesscorner_07/My_Health_File/Description_Tab'), 'I submitted my health report.')
		
		WebUI.click(findTestObject('Wellnesscorner_07/My_Health_File/Health_Record_Type_Tab'))
		
		WebUI.click(findTestObject('Wellnesscorner_07/My_Health_File/Submit_Tab'))
		
		WebUI.click(findTestObject('Wellnesscorner_07/My_Health_File/Close_Tab'))
		
		WebUI.back()
	}
}
