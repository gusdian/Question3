package traveloka

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Question_3 {
	@Keyword
	def RentalMobil(String LocationPickUp, String LocationPickUpDrpDwn, String StartDate, String EndDate, String StartTime, String EndTime, String TypeCar, String ProvideCar, String TypeLokasiPengambilan,
			String SelectLokasiPengambilan, String TypeLokasiPengembalian, String LokasiPengembalian, String SelectLokasiPengembalian, String CatatanOpsional, String NamaLengkapPemesan, String PhoneNumberPemesan,
			String EmailPemesan, String Title, String NamaLengkapPengemudi, String PhoneNumberPengemudi) {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.url)
		WebUI.click(findTestObject('Object Repository/Question_3/01_BtnRentalMobil'), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/Question_3/02_BtnTanpaSopir'), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/Question_3/03_InputLocationPickUp'), FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(findTestObject('Object Repository/Question_3/03_InputLocationPickUp'), LocationPickUp, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/Question_3/04_DrpDwnPickUpLocation', [('LocationPickUpDrpDwn') : LocationPickUpDrpDwn]), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/Question_3/05_BtnStartDate'), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/Question_3/07_SelectStartDate', [('StartDate') : StartDate]), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/Question_3/06_BtnEndDate'), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/Question_3/08_SelectEndDate', [('EndDate') : EndDate]), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/Question_3/09_BtnJamMulai'), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/Question_3/11_SelectStartTime', [('StartTime') : StartTime]), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/Question_3/38_BtnSelesai'), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/Question_3/10_BtnJamSelesai'), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/Question_3/12_SelectEndTime', [('EndTime') : EndTime]), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/Question_3/38_BtnSelesai'), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/Question_3/13_BtnCariMobil'), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/Question_3/14_SelectCar', [('TypeCar') : TypeCar]), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/Question_3/15_SelectProvideCar', [('ProvideCar') : ProvideCar]), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/Question_3/16_SelectLokasiPengambilan', [('TypeLokasiPengambilan') : TypeLokasiPengambilan]), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/Question_3/17_ClickDrpDwnSelectLokasiPengambilan'), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/Question_3/18_SelectDrpDwnLokasiPengambilan', [('SelectLokasiPengambilan') : SelectLokasiPengambilan]), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/Question_3/19_SelectLokasiPengembalian', [('TypeLokasiPengembalian') : TypeLokasiPengembalian]), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/Question_3/20_ClickDrpDwnSelectLokasiPengembalian'), FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(findTestObject('Object Repository/Question_3/21_InputLokasiPengembalian'), LokasiPengembalian, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/Question_3/22_SelectDrpDwnLokasiPengembalian', [('SelectLokasiPengembalian') : SelectLokasiPengembalian]), FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(findTestObject('Object Repository/Question_3/23_InputCatatanOpsional'), CatatanOpsional, FailureHandling.STOP_ON_FAILURE)
		//		WebUI.click(findTestObject('Object Repository/Question_3/24_BtnLanjutkan'), FailureHandling.STOP_ON_FAILURE)
		//		WebUI.setText(findTestObject('Object Repository/Question_3/25_InputNamaLengkapPemesan'), NamaLengkapPemesan, FailureHandling.STOP_ON_FAILURE)
		//		WebUI.setText(findTestObject('Object Repository/Question_3/26_InputPhoneNumberPemesan'), PhoneNumberPemesan, FailureHandling.STOP_ON_FAILURE)
		//		WebUI.setText(findTestObject('Object Repository/Question_3/27_InputEmailPemesan'), EmailPemesan, FailureHandling.STOP_ON_FAILURE)
		////		WebUI.click(findTestObject('Object Repository/Question_3/28_SelectTitle'), FailureHandling.STOP_ON_FAILURE)
		//		WebUI.selectOptionByLabel(findTestObject('Object Repository/Question_3/28_SelectTitle'), Title, false)
		//		WebUI.setText(findTestObject('Object Repository/Question_3/29_InputNamaLengkapPengemudi'), NamaLengkapPengemudi, FailureHandling.STOP_ON_FAILURE)
		//		WebUI.setText(findTestObject('Object Repository/Question_3/30_InputPhoneNumberPengemudi'), PhoneNumberPengemudi, FailureHandling.STOP_ON_FAILURE)
		//		WebUI.click(findTestObject('Object Repository/Question_3/24_BtnLanjutkan'), FailureHandling.STOP_ON_FAILURE)
		//		WebUI.setText(findTestObject('Object Repository/Question_3/31_InputCatatanOpsional'), CatatanOpsional, FailureHandling.STOP_ON_FAILURE)
		//		WebUI.click(findTestObject('Object Repository/Question_3/32_BtnSyaratRental'), FailureHandling.STOP_ON_FAILURE)
		//		WebUI.click(findTestObject('Object Repository/Question_3/33_SelectPilihSemua'), FailureHandling.STOP_ON_FAILURE)
		//		WebUI.click(findTestObject('Object Repository/Question_3/34_BtnSimpan'), FailureHandling.STOP_ON_FAILURE)
		//		WebUI.click(findTestObject('Object Repository/Question_3/35_BtnLanjutKePembayaran'), FailureHandling.STOP_ON_FAILURE)
		//		WebUI.click(findTestObject('Object Repository/Question_3/24_BtnLanjutkan'), FailureHandling.STOP_ON_FAILURE)
	}
}
