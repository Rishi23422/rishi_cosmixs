package BasicUtilities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class WriteExcelFile {
    public static void main(String[] args) {
        
        //Blank Workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        //Create Excel Sheet
        XSSFSheet sampleSheet = workbook.createSheet("sampleSheet");

        //Creating the Data
        Map<String, Object[]> dataSet =  new TreeMap<String, Object[]>();
        dataSet.put("1", new Object[] {"S.No", "ID", "Name", "Company"});
        dataSet.put("2", new Object[] {"1", "2354673", "Rishi", "Cognizant"});
        dataSet.put("3", new Object[] {"2", "2454673", "Harshda", "Capgemini"});
        dataSet.put("4", new Object[] {"3", "2554673", "Padma", "Cognizant"});
        dataSet.put("5", new Object[] {"4", "2654673", "Snehal", "TCS"});
        dataSet.put("6", new Object[] {"5", "2754673", "Akshata", "Accenture"});
        dataSet.put("7", new Object[] {"6", "2854673", "Shashank", "Cognizant"});
        dataSet.put("8", new Object[] {"7", "2954673", "Piyush", "Cognizant"});
        dataSet.put("9", new Object[] {"8", "2654673", "Sarthak", "Accenture"});

        //Iterate over the data
        Set<String> set = dataSet.keySet();
        int rownum = 0;
        for(String key : set){
            Row row = sampleSheet.createRow(rownum++);
            Object[] data = dataSet.get(key);

            int cellnum = 0;
            for(Object value : data){
                Cell cell = row.createCell(cellnum++);

                if(value instanceof String){
                    cell.setCellValue((String)value);
                }else if (value instanceof Integer) {
                    cell.setCellValue((Integer)value);
                }
            }
        }

        //Write down the file on hardDisk
        try {
            FileOutputStream writeFile = new FileOutputStream("SampleTest.xlsx");
            workbook.write(writeFile);
            writeFile.close();
            System.out.println("Sample Excel file is created");
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        

    }
}
