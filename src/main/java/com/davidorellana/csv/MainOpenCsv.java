package com.davidorellana.csv;

public class MainOpenCsv {

    public static void main(String[] args) {
        ReadFileOpenCsvImpl readFileOpenCsv = new ReadFileOpenCsvImpl();
        readFileOpenCsv.readFile("src/main/resources/inventory.csv");

        /*ReadFileCsv readFileCsv = new ReadFileCsv();
        readFileCsv.readFile("src/main/resources/inventory.csv");*/
    }
}
