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

WebUI.click(findTestObject('Object Repository/OrangeHRM Add Account/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/OrangeHRM Add Account/Page_OrangeHRM/button_Add'))

WebUI.click(findTestObject('Object Repository/OrangeHRM Add Account/Page_OrangeHRM/div_-- Select --'))

WebUI.click(findTestObject('OrangeHRM Add Account/Page_OrangeHRM/div_ESS'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM Add Account/Page_OrangeHRM/input'), 'Ahmad Albab')

WebUI.click(findTestObject('OrangeHRM Add Account/Page_OrangeHRM/div_-- Select -- (1)'))

WebUI.click(findTestObject('OrangeHRM Add Account/Page_OrangeHRM/div_Enabled'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM Add Account/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'), 
    'Ahmad_Albab')

WebUI.setEncryptedText(findTestObject('OrangeHRM Add Account/Page_OrangeHRM/input_Password_oxd-input oxd-input--focus (1)'), 
    'oiTN/YluRV1SYNGjXLguDg==')

WebUI.setEncryptedText(findTestObject('OrangeHRM Add Account/Page_OrangeHRM/input_Confirm Password_oxd-input oxd-input--focus'), 
    'oiTN/YluRV1SYNGjXLguDg==')

WebUI.click(findTestObject('Object Repository/OrangeHRM Add Account/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('OrangeHRM Add Account/Page_OrangeHRM/span_Invalid'))

