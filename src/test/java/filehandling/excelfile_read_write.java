package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelfile_read_write {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("./TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String text = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(text);
        fis.close();
		//write data

		wb.getSheet("Sheet1").createRow(9).createCell(8).setCellValue("dsf");
		FileOutputStream fos=new FileOutputStream("./TestData.xlsx");
		wb.write(fos);


        fos.close();
        wb.close();
	}

}
