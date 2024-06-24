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

WebUI.verifyElementClickable(findTestObject('Object Repository/Landing Page Agreepedia/Artikel/a_Artikel'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Landing Page Agreepedia/Artikel/span_Artikel Agreepedia'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Landing Page Agreepedia/Artikel/span_Baca berbagai informasi terbaru seputa_06fd24'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Landing Page Agreepedia/Artikel/img_Lihat Semua_gambar'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Landing Page Agreepedia/Artikel/img_Mikhael Suherman_gambar'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Landing Page Agreepedia/Artikel/span_Tren Minyak Atsiri Organik di Pasar Eropa'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Landing Page Agreepedia/Artikel/span_Peningkatan permintaan produk organik _a0aa2c'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Landing Page Agreepedia/Artikel/span_Komoditas'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Landing Page Agreepedia/Artikel/div_Mikhael Suherman18 April 2022'))

