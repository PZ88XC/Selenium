package com.seleniumbootcampframework.dataobjects;

import java.io.IOException;

import com.seleniumbootcampframework.core.DataTable;

import jxl.read.biff.BiffException;

public class TestData {
	public static class Urls {

		public static String tricentrisVehicleInsuranceUrl() throws BiffException, IOException {
			return DataTable.getCellValue("URL", 1);
		}

		public static class Credentials {
			// Create method to store data here..
		}

	}

	public static class Data {
		public static class EngineVehicleData {

			public static String Make() throws BiffException, IOException {
				return DataTable.getCellValue("Make", 1);
			}

			public static String Engine() throws BiffException, IOException {
				return DataTable.getCellValue("Engine Performance", 1);
			}

			public static String Date() throws BiffException, IOException {
				return DataTable.getCellValue("Date of Manufacture", 1);
			}

			public static String Seats() throws BiffException, IOException {
				return DataTable.getCellValue("Number of Seats", 1);
			}

			public static String Fuel() throws BiffException, IOException {
				return DataTable.getCellValue("Fuel Type", 1);
			}

			public static String Price() throws BiffException, IOException {
				return DataTable.getCellValue("List Price", 1);
			}

			public static String License() throws BiffException, IOException {
				return DataTable.getCellValue("License Plate Number", 1);
			}

			public static String Mileage() throws BiffException, IOException {
				return DataTable.getCellValue("Annual Mileage", 1);
			}

		}

		public static class InsurantData {
			public static String Firstname() throws BiffException, IOException {
				return DataTable.getCellValue("Firstname", 1);
			}

			public static String Lastname() throws BiffException, IOException {
				return DataTable.getCellValue("Lastname", 1);
			}

			public static String DOB() throws BiffException, IOException {
				return DataTable.getCellValue("Date of Birth", 1);
			}

			public static String Gender() throws BiffException, IOException {
				return DataTable.getCellValue("Gender", 1);
			}

			public static String StreetAddress() throws BiffException, IOException {
				return DataTable.getCellValue("Street Address", 1);
			}

			public static String Country() throws BiffException, IOException {
				return DataTable.getCellValue("Country", 1);
			}

			public static String ZipCode() throws BiffException, IOException {
				return DataTable.getCellValue("Zip Code", 1);
			}

			public static String City() throws BiffException, IOException {
				return DataTable.getCellValue("City", 1);
			}

			public static String Occupation() throws BiffException, IOException {
				return DataTable.getCellValue("Occupation", 1);
			}

			public static String Hobbies() throws BiffException, IOException {
				return DataTable.getCellValue("Hobbies", 1);
			}


		}

		public static class ProductData {
			public static String StartDate() throws BiffException, IOException {
				return DataTable.getCellValue("Start Date", 1);
			}

			public static String InsuranceSum() throws BiffException, IOException {
				return DataTable.getCellValue("Insurance Sum", 1);
			}

			public static String MeritRating() throws BiffException, IOException {
				return DataTable.getCellValue("Merit Rating", 1);
			}

			public static String DamageInsurance() throws BiffException, IOException {
				return DataTable.getCellValue("Damage Insurance", 1);
			}

			public static String OptionalProducts() throws BiffException, IOException {
				return DataTable.getCellValue("Optional Products", 1);
			}

			public static String CourtesyCar() throws BiffException, IOException {
				return DataTable.getCellValue("Courtesy Car", 1);
			}
		}
		
		public static class QuotaData {
			public static String Email() throws BiffException, IOException {
				return DataTable.getCellValue("Email", 1);
			}
			public static String Username() throws BiffException, IOException {
				return DataTable.getCellValue("Username", 1);
			}
			public static String Password() throws BiffException, IOException {
				return DataTable.getCellValue("Password", 1);
			}
		}
	}
}