package qsp;

import java.io.File;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DemoA {
public static void main(String[] args) {
	Workbook w = WorkbookFactory.create(new File("./data/Book1.xlsx"));
	String s = w.getSheet("Sheet1").getRow(0).getCell(1).toString();
	System.out.println(s);
}
}
