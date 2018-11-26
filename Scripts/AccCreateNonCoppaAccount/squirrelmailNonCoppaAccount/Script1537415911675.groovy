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

WebUI.openBrowser('http://rntmailtest01/webmail/src/login.php')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'http://rntmailtest01/webmail/src/login.php'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.open('http://rntmailtest01/webmail/src/login.php')

selenium.type('name=login_username', 'loadtest')

selenium.click('//center/table')

selenium.click('name=secretkey')

selenium.type('name=secretkey', 'Wizz0Wizz')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Password:\'])[1]/following::input[4]')

selenium.selectFrame('index=1')

selenium.click('link=Wizards Account Verification')

WebUI.switchToWindowTitle('SquirrelMail 1.4.8-5.el5.centos.10')

WebUI.click(findTestObject('AccCreateNonCoppaAccount/Page_SquirrelMail 1.4.8-5.el5.cento/a_Click here to activate your'))

WebUI.delay(14)

WebUI.closeBrowser()

