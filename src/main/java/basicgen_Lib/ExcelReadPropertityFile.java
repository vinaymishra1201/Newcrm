package basicgen_Lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadPropertityFile {
	  public static String getReadata(int rownum, int coloumn) throws IOException {
	        String value = "";

	        // Use user.dir for more reliable file path handling
	        String filePath = System.getProperty("user.dir") + File.separator + "D:/My personal files/TestData.xlsx";
	        File f = new File(filePath);

	        // Enhanced error handling and user feedback
	        try (FileInputStream fis = new FileInputStream(f); XSSFWorkbook wb = new XSSFWorkbook(fis)) {
	            XSSFSheet sheet = wb.getSheetAt(0);

	            // Handle potential null row or cell gracefully
	            if (sheet.getRow(rownum) != null && sheet.getRow(rownum).getCell(coloumn) != null) {
	                value = sheet.getRow(rownum).getCell(coloumn).getStringCellValue();
	            } else {
	                System.err.println("Row " + (rownum + 1) + " or column " + (coloumn + 1) + " is empty or null.");
	            }
	        }

	        return value;
	    }

	    public static void main(String[] args) {
	        int testRow = 1;  // Replace with desired row to test
	        int testColumn = 0;  // Replace with desired column to test

	        try {
	            String data = getReadata(testRow, testColumn);
	            System.out.println("Successfully read data: " + data);
	        } catch (IOException e) {
	            System.err.println("Error reading Excel file: " + e.getMessage());
	        }
	    }

}
