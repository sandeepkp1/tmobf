package com.example.demo.controller;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Employee;
import com.example.demo.service.ProducerService;

@RestController
public class ProducerController {

	@Autowired
	private ProducerService producerService;

	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public String m1(@RequestBody Employee emp) {
		producerService.add(emp);
		return "Employee added";

	}

	
	@RequestMapping(value = "/addFromFile")
	public String m2() {

		try {
			FileInputStream file = new FileInputStream(new File("C:\\Users\\sakumarp\\Documents\\Book1.xlsx"));

			// Create Workbook instance holding reference to .xlsx file
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			// Get first/desired sheet from the workbook
			XSSFSheet sheet = workbook.getSheetAt(0);

			ArrayList<Employee> employeeList = new ArrayList<>();
			// I've Header and I'm ignoring header for that I've +1 in loop
			for (int i = sheet.getFirstRowNum() + 1; i <= sheet.getLastRowNum(); i++) {
				Employee e = new Employee();
				Row ro = sheet.getRow(i);
				for (int j = ro.getFirstCellNum(); j <= ro.getLastCellNum(); j++) {
					Cell ce = ro.getCell(j);
					if (j == 0) {
						// If you have Header in text It'll throw exception because it won't get
						// NumericValue
						e.setId(ce.getStringCellValue());
					}
					if (j == 1) {
						e.setName(ce.getStringCellValue());
					}
					if (j == 2) {
						e.setSal((int) ce.getNumericCellValue());
					}
					if (j == 3) {
						e.setDept(ce.getStringCellValue());
					}

				}
				employeeList.add(e);
			}
			for (Employee emp : employeeList) {

				producerService.add(emp);
			}
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "File is added";
	}

}
