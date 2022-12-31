package com.davidorellana.csv;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileCsv implements ReadFileI {

    @Override
    public void readFile(String pathName) {

        String character = ";";
        try {
            //File file = new File(pathName);
            FileInputStream file = new FileInputStream(pathName);
            Scanner scanner = new Scanner(file);
            scanner.nextLine();
            Integer contRow = 2;
            String name = null, description= null, category= null, label= null, urlPhoto= null;
            double price = 0.0;
            System.out.println("File reading in the traditional way.");

            while (scanner.hasNextLine()) {
                try {
                    String line = scanner.nextLine();
                    String[] fieldsRow = line.split(character);
                    name = fieldsRow[0];
                    description = fieldsRow[1];
                    category = fieldsRow[2];
                    label = fieldsRow[3];
                    price = Double.parseDouble(fieldsRow[4]);
                    urlPhoto = fieldsRow[5];
                    System.out.printf("%d. Name: %s | Description: %s | Category: %s | Label: %s | Price: %s | UrlPhoto: %s\n", contRow, name, description, category, label, price, urlPhoto);
                } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    System.out.println("The row " + contRow + " it does not have an image url for this product.");
                    System.out.printf("%d. Name: %s | Description: %s | Category: %s | Label: %s | Price: %s | UrlPhoto: %s\n", contRow, name, description, category, label, price, urlPhoto = "There is no url for this image.");
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("The row " + contRow + " is missing price.");
                    System.out.printf("%d. Name: %s | Description: %s | Category: %s | Label: %s | Price: %s | UrlPhoto: %s\n", contRow, name, description, category, label, price = 0.0, urlPhoto);

                }
                contRow++;
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File " + pathName + " not found " + fileNotFoundException.getMessage());
        }
    }
}
