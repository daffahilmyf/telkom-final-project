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

WebUI.callTestCase(findTestCase('Automation Testing/Positive test case/Customer able to land in the Profil page'), [:], 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Profil page/Card Profil Page/div_Upload Foto Profile'), 'D:\\GAMBAR\\file upload\\500_95.jpg')

Thread.sleep(10000 //Millisecond 2.5 second delay only if needed
    //Millisecond 2.5 second delay only if needed
    )

WebUI.click(findTestObject('Profil page/Photo Confirmation/button_Simpan'))

WebUI.callTestCase(findTestCase('Open and close browser/Close the browser'), [:], FailureHandling.STOP_ON_FAILURE)

