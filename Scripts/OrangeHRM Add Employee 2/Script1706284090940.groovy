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

WebUI.callTestCase(findTestCase('OrangeHRM Login Successful'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM_AddEmployee/Page_OrangeHRM/a_PIM'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM_AddEmployee/Page_OrangeHRM/li_Add Employee'))

WebUI.setText(findTestObject('Page_OrangeHRM_AddEmployee/Page_OrangeHRM/input_Employee Full Name_firstName'), 'Ali')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM_AddEmployee/Page_OrangeHRM/input_Employee Full Name_lastName'), 
    'Ahmad')

WebUI.sendKeys(findTestObject('Page_OrangeHRM_AddEmployee/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_OrangeHRM_AddEmployee/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Page_OrangeHRM_AddEmployee/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'), 
    '0234')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM_AddEmployee/Page_OrangeHRM/span_Employee Id_oxd-switch-input oxd-switc_efe210'))

WebUI.click(findTestObject('Page_OrangeHRM_AddEmployee/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus o_d4f516'))

WebUI.setText(findTestObject('Page_OrangeHRM_AddEmployee/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus o_d4f516'), 
    'Ali.Ahmad')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM_AddEmployee/Page_OrangeHRM/input_Password_oxd-input oxd-input--focus'), 
    '2/Io5keYEIg=')

WebUI.setEncryptedText(findTestObject('Page_OrangeHRM_AddEmployee/Page_OrangeHRM/input_Confirm Password_oxd-input oxd-input--focus'), 
    '2/Io5keYEIg=')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM_AddEmployee/Page_OrangeHRM/button_Save'))

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM_AddEmployee/Page_OrangeHRM/span_Employee Id already exists'), 
    0)

