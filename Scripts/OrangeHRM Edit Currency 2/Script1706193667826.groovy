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

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM_AddCurrency/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM_AddCurrency/Page_OrangeHRM/li_Job'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM_AddCurrency/Page_OrangeHRM/li_Pay Grades'))

WebUI.click(findTestObject('Page_OrangeHRM_AddCurrency/Page_OrangeHRM/button_Utd. Arab Emir. Dirham,Afghanistan Afghani,Australian Dollar,United States Dollar_oxd-icon-button oxd-table-cell-action-space', 
        [('payGrade') : payGrade]))

WebUI.click(findTestObject('Page_OrangeHRM_EditCurrency/Page_OrangeHRM/button_United States Dollar_oxd-icon-button oxd-table-cell-action-space'))

WebUI.sendKeys(findTestObject('Page_OrangeHRM_EditCurrency/Page_OrangeHRM/input_Minimum Salary_oxd-input oxd-input--focus'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_OrangeHRM_EditCurrency/Page_OrangeHRM/input_Minimum Salary_oxd-input oxd-input--focus'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Page_OrangeHRM_EditCurrency/Page_OrangeHRM/input_Minimum Salary_oxd-input oxd-input--focus'), 
    '2')

WebUI.sendKeys(findTestObject('Page_OrangeHRM_EditCurrency/Page_OrangeHRM/input_Maximum Salary_oxd-input oxd-input--active'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_OrangeHRM_EditCurrency/Page_OrangeHRM/input_Maximum Salary_oxd-input oxd-input--active'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Page_OrangeHRM_EditCurrency/Page_OrangeHRM/input_Maximum Salary_oxd-input oxd-input--active'), 
    '1')

WebUI.click(findTestObject('Page_OrangeHRM_EditCurrency/Page_OrangeHRM/button_Save'))

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM_EditCurrency/Page_OrangeHRM/span_Should be higher than Minimum Salary'), 
    0)

