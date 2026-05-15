package app;


import java.io.IOException;

public class Main {

    private final static String BASE_PATH = "files/";

    public static void main(String[] args) {
        FileHandler handler = new FileHandler();
        String fileName = "myfile.txt";
        String path = BASE_PATH + fileName;
        String fileContent = "My very important information.";
        String result;
        String content;
        try {
            result = handler.writeFile(path, fileContent);
            getOutput("RESULT: " + result);
        }catch (RuntimeException e) {


        }
        try {
             content = handler.readFile(path);
            getOutput("FILE CONTENT: " + content);
        }catch (RuntimeException ex) {


        }



    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
