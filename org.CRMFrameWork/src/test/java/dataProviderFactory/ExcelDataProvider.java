/**
 * 
 */
package dataProviderFactory;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author Lenovo
 *
 */
public class ExcelDataProvider {

	FileInputStream fis;

	XSSFWorkbook wb;

	public ExcelDataProvider() {

		String path = System.getProperty("user.dir") + "/TestData/LoginData.xlsx";

		File src = new File(path);

		try {
			fis = new FileInputStream(src);

			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {

			System.out.println("========Unable to load the excel file======");

			System.out.println(e.getMessage());
		}

	}

	public int getRowsCount(String sheetName) {

		int rows = wb.getSheet(sheetName).getPhysicalNumberOfRows();

		return rows;
	}

	public int getColumnsCount(String sheetName) {

		int columns = wb.getSheet(sheetName).getRow(0).getLastCellNum();

		return columns;
	}

	public String getData(String sheetName, int row, int column) {

		XSSFCell cell = wb.getSheet(sheetName).getRow(row).getCell(column);

		DataFormatter df = new DataFormatter();

		String data = df.formatCellValue(cell);

		return data;
	}

}
