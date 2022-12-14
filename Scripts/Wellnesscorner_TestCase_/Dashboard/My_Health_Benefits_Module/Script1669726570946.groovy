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

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/ViewAll_Aeeow'))

if (WebUI.verifyTextPresent('My Health Benefits', false)) {
    System.out.println('Test case Pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Sponsored_Health_Cheack'))

WebUI.scrollToElement(findTestObject('Wellnesscorner_07/My_Health_Benefits/Scroll'), 2)

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Book'))

WebUI.scrollToElement(findTestObject('Wellnesscorner_07/My_Health_Benefits/Scroll_Test_Inculde'), 5)

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Live_Function_Test'))

WebUI.delay(3)

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Live_Function_Test'))

WebUI.scrollToElement(findTestObject('Wellnesscorner_07/My_Health_Benefits/Scroll_Truworth_Sponsred_CheckUp'), 5)

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Book_Now'))

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Select_Patient_Tab'))

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Select_Patient_Next'))

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Select_Address1'))

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Select _Address'))

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Proceed_Address'))

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Select_Address_Next'))

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Select_Time_Slot'))

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Date_3'))

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Bet_1_5'))

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Proceed'))

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Next_Date_Time'))

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/DashBoard'))

WebUI.closeBrowser()

