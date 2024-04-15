package org.example;

import java.io.*;

public class FileIOExample {
    public static void main(String args[])
    {
        String fileName="example.txt";
        // Write to a file
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println("Hello, this is an example of file I/O in Java.");
            writer.println("We are writing to a file named example.txt.");
            writer.println("This file will be created if it doesn't exist.");
            writer.append("appended");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }

        // Read from a file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Contents of " + fileName + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }


    }
}
