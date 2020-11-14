package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.Scanner;

public final class GraphDataParser {
    public static final String PRODUCTION_COUNT = "ProductionCount";

    public static Production[] parseProductionData(File productionFile) throws FileNotFoundException {
        Scanner scanner = new Scanner(productionFile);
        int productionCount = getProductionCount(scanner);
        return null;
    }

    private static int getProductionCount(Scanner scanner){
        while(scanner.hasNextLine()){
            String s = scanner.nextLine();
            if(s.contains(PRODUCTION_COUNT)){
                s = s.replaceAll("[^\\d]", " ");
                return Integer.getInteger(s);
            }
        }
        throw new RuntimeException("There is a problem with given file at ProductionCount ");
    }
}
