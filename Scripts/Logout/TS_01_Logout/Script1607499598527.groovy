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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://test-st-wl-envoy.aw.atos.net/WorldlineSTConsole/')

WebUI.setText(findTestObject('Login_Object_Repo/Page_Worldline Console/input__LogonId'), 'Asnow')

WebUI.setEncryptedText(findTestObject('Login_Object_Repo/Page_Worldline Console/input__LoginPasscode'), 'r5Nf3+Bz/4JsLvW20B+BDw==')

WebUI.click(findTestObject('Login_Object_Repo/Page_Worldline Console/button_Login'))

WebUI.waitForElementClickable(findTestObject('Logout_Object_Repo/Page_DashBoard/a_Al Snow'), 5)

WebUI.click(findTestObject('Logout_Object_Repo/Page_DashBoard/a_Al Snow'))

WebUI.click(findTestObject('Logout_Object_Repo/Page_DashBoard/a_Logout'))

WebUI.closeBrowser()

