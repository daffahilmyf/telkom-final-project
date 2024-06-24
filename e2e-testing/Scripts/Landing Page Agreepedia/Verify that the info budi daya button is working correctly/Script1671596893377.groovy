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

WebUI.verifyElementClickable(findTestObject('Object Repository/Landing Page Agreepedia/Info Budi Daya/a_Info Budi Daya'))

WebUI.verifyElementPresent(findTestObject('Page_Agreepedia/div_Info Budi DayaBaca berbagai informasi t_455e19'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Agreepedia/span_Info Budi Daya'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Agreepedia/span_Baca berbagai informasi terbaru seputa_06fd24'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Agreepedia/img_Kapulaga_gambar'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Agreepedia/div_Tebu'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Landing Page Agreepedia/Info Budi Daya/svg_Baca berbagai informasi terbaru seputar_b9d7a4'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Landing Page Agreepedia/Info Budi Daya/svg_Baca berbagai informasi terbaru seputar_b4c6e7'))

