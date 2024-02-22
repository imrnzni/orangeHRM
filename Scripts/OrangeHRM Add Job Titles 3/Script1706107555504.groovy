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

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM_Job_Title/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM_Job_Title/Page_OrangeHRM/span_Job'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM_Job_Title/Page_OrangeHRM/li_Job Titles'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM_Job_Title/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM_Job_Title/Page_OrangeHRM/input_Job Title_oxd-input oxd-input--focus'), 
    'Job02')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM_Job_Title/Page_OrangeHRM/textarea_Job Description_oxd-textarea oxd-t_4f7bba'), 
    'Job description 2')

WebUI.uploadFile(findTestObject('Page_OrangeHRM_Job_Title/Page_OrangeHRM/div_BrowseNo file chosen'), 'C:\\Users\\Dell\\Downloads\\1.5MB.pdf')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM_Job_Title/Page_OrangeHRM/textarea_Note_oxd-textarea oxd-textarea--fo_bc10e6'), 
    'Note02')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM_Job_Title/Page_OrangeHRM/button_Save'))

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM_Job_Title/Page_OrangeHRM/span_Attachment Size Exceeded'), 0)

