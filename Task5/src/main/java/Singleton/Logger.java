package Singleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;
    private FileWriter writer;
    private String fileName;

    private Logger() {
        this.fileName = "Default.txt";
        openWriter();
    }

    public static synchronized Logger getInstance() {
        if(instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void openWriter() {
        try {
            writer = new FileWriter(fileName, true);
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file");
            e.printStackTrace();
        }
    }
    public void setFileName(String name) {
        try {
            if(writer != null) {
                close();
                fileName = name;
                writer = new FileWriter(fileName, true);
            }
        } catch(IOException e) {
            System.out.println("Error changing the file name.");
            e.printStackTrace();
        }
    }

    public synchronized void write(String text) {
        try {
            writer.append(text + "\n");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error occured while writing.");
            e.printStackTrace();
        }
    }
    public void close() {
        try {
            writer.close();
        } catch(IOException e) {
            System.out.println("Error occured while closing");
            e.printStackTrace();
        }
    }
}
