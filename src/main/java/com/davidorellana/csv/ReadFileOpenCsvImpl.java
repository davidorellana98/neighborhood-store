package com.davidorellana.csv;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileOpenCsvImpl implements ReadFileI {

    @Override
    public void readFile(String pathName) {
        try {
            FileReader file = new FileReader(pathName);
            CSVReader csvReader =  new CSVReader(file);
            String[] lines = csvReader.readNext();
            Integer count = 1;
            System.out.println("Reading files with the OpenCsv library.");

            while (lines != null) {
                System.out.print(count + ".- ");
                for (String field: lines) {
                    System.out.print(field + " ** ");
                }
                lines = csvReader.readNext();
                System.out.println();
                count++;
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File " + pathName + " not found " + fileNotFoundException.getMessage());
        } catch (CsvValidationException csvValidationException) {
            System.out.println("File " + pathName + " not found " + csvValidationException.getMessage());
        } catch (IOException ioException) {
            System.out.println("File " + pathName + " not found " + ioException.getMessage());
        }
    }
}
