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

WebUI.verifyElementVisible(findTestObject('Landing Page/Navbar/div_Entry'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Landing Page/Navbar/div_Menu Navbar'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Landing Page/Navbar/img_Tentang Kami_image'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Landing Page/Navbar/a_Berita dan Kegiatan Agree'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Landing Page/Navbar/a_Daftar'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Landing Page/Navbar/a_Masuk'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Landing Page/Navbar/a_Tentang Kami'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Landing Page/Navbar/span_Daftar'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Landing Page/Navbar/span_Layanan'), FailureHandling.STOP_ON_FAILURE)

