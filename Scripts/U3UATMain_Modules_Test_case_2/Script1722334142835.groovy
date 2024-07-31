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

WebUI.callTestCase(findTestCase('U3UAT_Login_Test_case_1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/U3UAT_Modules_Navigations/Page_Sterna Unigem/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/U3UAT_Modules_Navigations/Page_Sterna Unigem/svg (1)'))

WebUI.click(findTestObject('Object Repository/U3UAT_Modules_Navigations/Page_Sterna Unigem/div_LiveTrips'))

WebUI.click(findTestObject('submenu/Page_Sterna Unigem/tripexception/svg'))

WebUI.mouseOver(findTestObject('submenu/Page_Sterna Unigem/tripexception/span_Terminal Exceptions'))

WebUI.click(findTestObject('submenu/Page_Sterna Unigem/tripexception/span_View All Exceptions'))

WebUI.click(findTestObject('submenu/Page_Sterna Unigem/tripexception/svg'))

WebUI.mouseOver(findTestObject('submenu/terminalexception/Page_Sterna Unigem/span_Trip Exceptions'))

WebUI.click(findTestObject('submenu/terminalexception/Page_Sterna Unigem/span_View All Exceptions'))

WebUI.click(findTestObject('submenu/Page_Sterna Unigem/tripexception/svg'))

WebUI.mouseOver(findTestObject('submenu/terminalexception/Page_Sterna Unigem/span_Trip Exceptions'))

WebUI.click(findTestObject('Object Repository/submenu/terminalexception/Page_Sterna Unigem/span_Replan Trip'))

WebUI.click(findTestObject('submenu/Page_Sterna Unigem/tripexception/svg'))

WebUI.mouseOver(findTestObject('submenu/terminalexception/Page_Sterna Unigem/span_Trip Exceptions'))

WebUI.click(findTestObject('Object Repository/submenu/terminalexception/Page_Sterna Unigem/span_Reopen Closed Trip'))

WebUI.click(findTestObject('submenu/Page_Sterna Unigem/tripexception/svg'))

WebUI.mouseOver(findTestObject('submenu/terminalexception/Page_Sterna Unigem/span_Trip Exceptions'))

WebUI.click(findTestObject('Object Repository/submenu/terminalexception/Page_Sterna Unigem/span_Cancel  Close Trip'))
