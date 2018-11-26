import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.openBrowser('')

WebUI.navigateToUrl('https://webr20accounts.wizards.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('AccLoginValidLoginValidPwd/Page_Create Your Wizards Account/button_Login'))

WebUI.delay(8)

WebUI.waitForPageLoad(3)

WebUI.switchToFrame(findTestObject('AccCreateNonCoppaAccount/iframe_wotcAccountWidgetModalIframe'), 5)

WebUI.switchToWindowIndex(findTestObject('AccCreateNonCoppaAccount/iframe_wotcAccountWidgetModalIframe'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('AccLoginValidLoginValidPwd/Page_Create Your Wizards Account/input_Login ID_username'), 'RafaelTest')

WebUI.setEncryptedText(findTestObject('Object Repository/AccLoginValidLoginValidPwd/Page_Create Your Wizards Account/input_Password_password'), 
    'p4y+y39Ir5PEPmX20UxFKw==')

WebUI.focus(findTestObject('AccLoginValidLoginValidPwd/Page_Create Your Wizards Account/button_Login _LogOut'))

WebUI.click(findTestObject('AccLoginValidLoginValidPwd/Page_Create Your Wizards Account/button_Login _LogOut'))

WebUI.verifyElementVisible(findTestObject('AccLoginValidLoginValidPwd/Page_Account Details/label_Screen Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('AccLogout/Page_Account Details/div_Rafael Test'), 'Rafael Test')

WebUI.delay(10)

WebUI.closeBrowser()

