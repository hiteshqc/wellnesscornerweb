import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'login.test.userLogin'()

WebUI.click(findTestObject('Object Repository/Wellnesscorner_07/Emotional_Therapy/Emotional_Therapy_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Wellnesscorner_07/Emotional_Therapy/Book_Now_Arrow_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Wellnesscorner_07/Emotional_Therapy/Check_Symbol_2nd_Session_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Wellnesscorner_07/Emotional_Therapy/Book_Therapy_appoinment_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Wellnesscorner_07/Emotional_Therapy/Tue,06_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Wellnesscorner_07/Emotional_Therapy/3PM_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Wellnesscorner_07/Emotional_Therapy/Proceed_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Wellnesscorner_07/Emotional_Therapy/Proceed_to_Payment_Tab'))

WebUI.delay(5)

WebUI.back()

WebUI.back()

