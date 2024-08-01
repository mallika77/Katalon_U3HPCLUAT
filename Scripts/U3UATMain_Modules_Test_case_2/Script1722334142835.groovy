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

WebUI.click(findTestObject('Object Repository/U3_UAT_Smoke Test cases Objects/submenu/terminalexception/Page_Sterna Unigem/tripexception/svg'))

WebUI.click(findTestObject('Object Repository/U3_UAT_Smoke Test cases Objects/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/span_Terminal Exceptions'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/span_View All Exceptions'))

WebUI.waitForPageLoad(3000)

WebUI.click(findTestObject('Object Repository/U3_UAT_Smoke Test cases Objects/submenu/terminalexception/Page_Sterna Unigem/tripexception/svg'))

WebUI.mouseOver(findTestObject('Object Repository/U3_UAT_Smoke Test cases Objects/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/span_Trip Exceptions'))

WebUI.click(findTestObject('Object Repository/U3_UAT_Smoke Test cases Objects/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/span_View All Exceptions'))

WebUI.waitForPageLoad(3000)

WebUI.click(findTestObject('Object Repository/U3_UAT_Smoke Test cases Objects/submenu/terminalexception/Page_Sterna Unigem/tripexception/svg'))

WebUI.mouseOver(findTestObject('Object Repository/U3_UAT_Smoke Test cases Objects/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/span_Trip Exceptions'))

WebUI.click(findTestObject('Object Repository/U3_UAT_Smoke Test cases Objects/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/span_Replan Trip'))

WebUI.waitForPageLoad(3000)

WebUI.click(findTestObject('Object Repository/U3_UAT_Smoke Test cases Objects/submenu/terminalexception/Page_Sterna Unigem/tripexception/svg'))

WebUI.mouseOver(findTestObject('Object Repository/U3_UAT_Smoke Test cases Objects/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/span_Trip Exceptions'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/span_Reopen Closed Trip'))

WebUI.waitForPageLoad(3000)

WebUI.click(findTestObject('Object Repository/U3_UAT_Smoke Test cases Objects/submenu/terminalexception/Page_Sterna Unigem/tripexception/svg'))

WebUI.mouseOver(findTestObject('Object Repository/U3_UAT_Smoke Test cases Objects/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/span_Trip Exceptions'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/span_Cancel  Close Trip'))

WebUI.click(findTestObject('Object Repository/U3_UAT_Smoke Test cases Objects/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/a_TruckStatus'))

WebUI.click(findTestObject('Object Repository/U3_UAT_Smoke Test cases Objects/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/a_LiveTrips'))

WebUI.click(findTestObject('Object Repository/U3_UAT_Smoke Test cases Objects/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/a_Terminals'))

WebUI.click(findTestObject('Object Repository/U3_UAT_Smoke Test cases Objects/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/a_VTS'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/terminalexception/Page_Sterna Unigem/div_Users'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/terminalexception/Page_Sterna Unigem/span_Manage Users'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/terminalexception/Page_Sterna Unigem/div_Users'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/terminalexception/Page_Sterna Unigem/span_Manage Roles'))

WebUI.click(findTestObject('Object Repository/U3_UAT_Smoke Test cases Objects/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/Page_Sterna Unigem/svg'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Settings/Page_Sterna Unigem/span_Configurations'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Settings/Page_Sterna Unigem/span_Countries'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Settings/Page_Sterna Unigem/span_Customers'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Settings/Page_Sterna Unigem/span_Returns'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Settings/Page_Sterna Unigem/span_SMS Providers'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Settings/Page_Sterna Unigem/span_States'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Settings/Page_Sterna Unigem/span_Stocks'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Settings/Page_Sterna Unigem/span_Terminals'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Settings/Page_Sterna Unigem/span_Truck VTS'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Settings/Page_Sterna Unigem/span_Trucks'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Settings/Page_Sterna Unigem/span_Zones'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/div_Reports'))

WebUI.mouseOver(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/span_Audit Log Report'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/span_KMS Activity Report'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/span_Lock Activity Report'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/span_KMS Activity Report'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/span_Otp Activity Report'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/div_Reports'))

WebUI.mouseOver(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/span_Dormant Report'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/span_Key Report'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/div_Reports'))

WebUI.mouseOver(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/span_Driver Report'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/span_Face Registration Report'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/div_Reports'))

WebUI.mouseOver(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/span_Driver Report'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/span_Trip Mapping Report'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/div_Reports'))

WebUI.mouseOver(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/span_Driver Report'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/span_Face Verification Report'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/div_Reports'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/span_Exception Report'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/div_Reports'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/span_Ro Report'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/div_Reports'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/span_Truck Report'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/div_Reports'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/span_Trip Report'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/div_Reports'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/span_Truck Maintenance Window Report'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/div_Reports'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/span_Billing Report'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/div_Reports'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/span_Auto Debit Summary Report'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/div_Reports'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/span_Inventory Report'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/div_Reports'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/span_Programming Key Report'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/div_Reports'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/Reports/Page_Sterna Unigem/span_Fan Report'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/span_MP'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/span_Logout'))

WebUI.click(findTestObject('U3_UAT_Smoke Test cases Objects/submenu/terminalexception/Page_Sterna Unigem/Page_Sterna Unigem/span_Yes'))

