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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('https://webr20accounts.wizards.com/')

WebUI.maximizeWindow()

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://webr20accounts.wizards.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.open('https://webr20accounts.wizards.com/')

WebUI.waitForPageLoad(8)

WebUI.delay(10)

selenium.click('id=join')

WebUI.switchToFrame(findTestObject('AccCreateNonCoppaAccount/iframe_wotcAccountWidgetModalIframe'), 5)

WebUI.switchToWindowIndex(findTestObject('AccCreateNonCoppaAccount/iframe_wotcAccountWidgetModalIframe'), FailureHandling.OPTIONAL)

WebUI.delay(8)

WebUI.waitForPageLoad(3)

selenium.type('id=firstname', 'sdss')

selenium.type('id=lastname', 'test')

selenium.click('id=dob_Year')

selenium.select('id=dob_Year', 'label=2003')

selenium.click('id=dob_Year')

selenium.click('id=dob_Month')

selenium.select('id=dob_Month', 'label=12')

selenium.click('id=dob_Month')

selenium.click('id=dob_Day')

selenium.select('id=dob_Day', 'label=18')

selenium.click('id=dob_Day')

selenium.click('id=email')

selenium.type('id=email', RandomStringUtils.randomNumeric(5) + findTestData('InputData').getValue(2, 1))

selenium.click('id=username')

selenium.type('id=username', RandomStringUtils.randomNumeric(5) + findTestData('InputData').getValue(3, 1))

selenium.type('id=password', 'Password1!')

selenium.type('id=confirmPassword', 'Password1!')

selenium.type('id=joinCaptchaAnswer', 'TEST')

selenium.click('id=next')

WebUI.delay(10)

WebUI.closeBrowser()

