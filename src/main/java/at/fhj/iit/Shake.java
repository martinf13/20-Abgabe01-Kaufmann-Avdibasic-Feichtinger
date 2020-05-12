package at.fhj.iit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shake extends Drink {

    private static List<ShakeNutritionTable> nutritionalTable = new ArrayList<ShakeNutritionTable>();
    private static String path = "Shake.xlsx";
    private static  File m;
    /**
     * Creates a Drink object with given name
     *
     * @param name name of the drink
     */
    public Shake(String name) {
        super(name);
    }

    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    @Override
    public double getVolume() {
        return 0;
    }

    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    @Override
    public double getAlcoholPercent() {
        return 0;
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        return false;
    }

    private static void excelReader(){

        m = new File(path);
        XSSFWorkbook workbook;

        try{
            workbook = new XSSFWorkbook(m);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            int x = 0;

            while(rowIterator.hasNext()){
                Row row = rowIterator.next();
                if(x > 0) {
                    String shakename = row.getCell(0).getStringCellValue();
                    String shakecal = row.getCell(1).getStringCellValue();
                    String shakecarb = row.getCell(2).getStringCellValue();
                    String shakefat = row.getCell(3).getStringCellValue();
                    String shakeprotein = row.getCell(4).getStringCellValue();
                    nutritionalTable.add(new ShakeNutritionTable(shakename,shakecal,shakecarb,shakefat,shakeprotein));
                }
                x++;
                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                }
            }
        }catch (IOException | InvalidFormatException e){
            System.out.println("Fail");
        }
    }

    public static String getShakeNutritionalTable(String name) {
        for (int i = 0; i < nutritionalTable.size(); i++) {
            if (nutritionalTable.get(i).getName().contains(name)) return nutritionalTable.get(i).toString();
            else return "Couldn't find Shake please try again \n";
        }
        return "";
    }


}
