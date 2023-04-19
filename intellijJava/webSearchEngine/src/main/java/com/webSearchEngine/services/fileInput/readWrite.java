package com.webSearchEngine.services.fileInput;

import java.io.*;

public class readWrite {
    public static void update() {
        String filePath = "/Users/narenderkumarchoudhary/Public/education/java/intellijJava/webSearchEngine/src/main/java/com/webSearchEngine/services/fileInput/input.txt";
        String newString = "https://www.tutorialspoint.com/";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath + ".temp"));

            String oldString;
            while ((oldString = reader.readLine()) != null) {
                oldString = oldString.replaceAll(oldString, newString);
                System.out.println(oldString);
                writer.write(oldString + System.getProperty("line.separator"));
            }

            reader.close();
            writer.close();

            // delete the original file
            if (!new File(filePath).delete()) {
                System.out.println("Failed to delete the original file.");
                return;
            }

            // rename the temp file to the original file name
            if (!new File(filePath + ".temp").renameTo(new File(filePath))) {
                System.out.println("Failed to rename the temp file.");
                return;
            }

            System.out.println("String replaced successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
