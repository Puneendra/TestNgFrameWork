package Utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestDataCreation
{
    public static HashMap<String,String> testData = new HashMap<>();
    public static List<HashMap<String,String>>getTestDataObj(String ExcelPath ,String ExcelSheetName) throws IOException {
        List<HashMap<String,String>> testDataList = new ArrayList<>();

        FileInputStream fis = new FileInputStream(ExcelPath);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
       Sheet sheet =  workbook.getSheet(ExcelSheetName);
       Row headerRow=sheet.getRow(0);

       for(int i=1;i<=sheet.getPhysicalNumberOfRows();i++)
       {
          Row rowcount = sheet.getRow(i);
          HashMap<String,String> hashmapaobj = new HashMap<>();

           for(int j=0;j<=rowcount.getPhysicalNumberOfCells();j++)
           {
             Cell cell =  rowcount.getCell(j);
               hashmapaobj.put(headerRow.getCell(j).toString(),cell.toString());

           }
           testDataList.add(hashmapaobj);

       }
       fis.close();


        return testDataList;

    }


}
