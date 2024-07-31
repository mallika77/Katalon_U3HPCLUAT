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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ttlssternauat.hpcl.co.in/login')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(3000)

WebUI.switchToWindowTitle('Sterna Unigem')

WebUI.click(findTestObject('Object Repository/submenu/terminalexception/Page_Sterna Unigem/tripexception/svg'))

WebUI.click(findTestObject('Object Repository/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/span_Terminal Exceptions'))

WebUI.click(findTestObject('submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/span_View All Exceptions'))

WebUI.waitForPageLoad(3000)

WebUI.click(findTestObject('Object Repository/submenu/terminalexception/Page_Sterna Unigem/tripexception/svg'))

WebUI.mouseOver(findTestObject('Object Repository/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/span_Trip Exceptions'))

WebUI.click(findTestObject('Object Repository/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/span_View All Exceptions'))

WebUI.waitForPageLoad(3000)

WebUI.click(findTestObject('Object Repository/submenu/terminalexception/Page_Sterna Unigem/tripexception/svg'))

WebUI.mouseOver(findTestObject('Object Repository/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/span_Trip Exceptions'))

WebUI.click(findTestObject('Object Repository/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/span_Replan Trip'))

WebUI.waitForPageLoad(3000)

WebUI.click(findTestObject('Object Repository/submenu/terminalexception/Page_Sterna Unigem/tripexception/svg'))

WebUI.mouseOver(findTestObject('Object Repository/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/span_Trip Exceptions'))

WebUI.click(findTestObject('submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/span_Reopen Closed Trip'))

WebUI.waitForPageLoad(3000)

WebUI.click(findTestObject('Object Repository/submenu/terminalexception/Page_Sterna Unigem/tripexception/svg'))

WebUI.mouseOver(findTestObject('Object Repository/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/span_Trip Exceptions'))

WebUI.click(findTestObject('submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/span_Cancel  Close Trip'))

WebUI.click(findTestObject('Object Repository/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/a_TruckStatus'))

WebUI.click(findTestObject('Object Repository/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/a_LiveTrips'))

WebUI.click(findTestObject('Object Repository/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/a_Terminals'))

WebUI.click(findTestObject('Object Repository/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/a_VTS'))

WebUI.click(findTestObject('Object Repository/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/svg'))

WebUI.click(findTestObject('Object Repository/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/span_MP'))

WebUI.click(findTestObject('Object Repository/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/span_Logout'))

WebUI.click(findTestObject('Object Repository/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/span_Yes'))

WebUI.closeBrowser()

