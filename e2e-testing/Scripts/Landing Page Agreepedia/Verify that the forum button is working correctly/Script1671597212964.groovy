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

WebUI.navigateToUrl('http://localhost:3001/agreepedia')

WebUI.verifyElementClickable(findTestObject('Object Repository/Landing Page Agreepedia/Forum/a_Forum'))

WebUI.verifyElementPresent(findTestObject('Page_Agreepedia/div_Forum AgreepediaDiskusikan dan tanyakan_dd6b2e'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Agreepedia/span_Forum Agreepedia'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Agreepedia/span_Diskusikan dan tanyakan permasalahan a_84ce75'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Agreepedia/div_Perluas Jaringan Bersama Pengguna Lainn_95fcba'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Landing Page Agreepedia/Forum/div_Fitur Forum akan segera hadir, tunggu ya'), 
    0)

