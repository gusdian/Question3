import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.time.LocalDate
import java.time.format.DateTimeFormatter

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

 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd");
  LocalDate localDateStart = LocalDate.now().plusDays(2);
  System.out.println(dtf.format(localDateStart));
  
  LocalDate localDateEnd = LocalDate.now().plusDays(5);
  System.out.println(dtf.format(localDateEnd));
  
  String LocationPickUp = 'Jakarta'
  String LocationPickUpDrpDwn = 'Jakarta Timur'
  String StartDate = dtf.format(localDateStart)
  String EndDate = dtf.format(localDateEnd)
  String StartTime = 9
  String EndTime = 11
  String TypeCar = 'Toyota Agya'
  String ProvideCar = 'Moovby Driverless Jakarta'
  String TypeLokasiPengambilan = 'Kantor Rental'
  String SelectLokasiPengambilan = 'Pool Moovby'
  String TypeLokasiPengembalian = 'Lokasi Lainnya'
  String LokasiPengembalian = 'CGK'
  String SelectLokasiPengembalian = 'CGK'
  String CatatanOpsional = 'Testing'
  String NamaLengkapPemesan = 'Testing Automation'
  String PhoneNumberPemesan = '812345678912'
  String EmailPemesan = 'Testing@gmail.com'
  String Title = 'Tuan'
  String NamaLengkapPengemudi = 'Testing Automation'
  String PhoneNumberPengemudi = '812345678912'
  
  CustomKeywords.'traveloka.Question_3.RentalMobil'(LocationPickUp, LocationPickUpDrpDwn, StartDate, EndDate, StartTime, 
	  EndTime, TypeCar, ProvideCar, TypeLokasiPengambilan, SelectLokasiPengambilan, TypeLokasiPengembalian, 
	  LokasiPengembalian, SelectLokasiPengembalian, CatatanOpsional, NamaLengkapPemesan, PhoneNumberPemesan, EmailPemesan, Title, NamaLengkapPengemudi, PhoneNumberPengemudi) 