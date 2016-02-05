package timeCalcImpl;

import interf.Calculator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CalculatorImpl extends Calculator {


    public static void main(String[] args) {
        openFile("D:\\Education\\TimeCalculator\\src\\sourceData.xlsx");
        parseFile();

    }

    private static void openFile(String fileName) {
        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader( fileName);
            try {
                //В цикле построчно считываем файл
                String s;
                while ((s = in.readLine()) != null) {
                    
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                //Также не забываем закрыть файл
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected static void parseFile() {

    }
}
