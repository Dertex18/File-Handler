package app;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {


    public String writeFile(String path, String fileContent) {
        try(FileWriter fw = new FileWriter( path )) {
            fw.write(fileContent);
            return "Success.";
        } catch (Exception e) {
            System.out.println("Error writing content to file by path: " + path);
            throw new RuntimeException(e);
        }
    }

    public String readFile(String path) {
        try (FileReader reader = new FileReader(path)) {
            int sym;

            StringBuilder stringBuilder = new StringBuilder();
            while ((sym = reader.read()) != -1) {
                stringBuilder.append((char) sym);
            }
            return  stringBuilder.toString();
        } catch (IOException ex) {
            System.out.println("Error reading file by path: " + path);
            throw new RuntimeException(ex);
        }
    }
}
