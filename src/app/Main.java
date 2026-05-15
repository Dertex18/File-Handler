package app;


public class Main {

    private final static String BASE_PATH = "files/";

    public static void main(String[] args) {
        FileHandler handler = new FileHandler();
        String fileName = "myfile.txt";
        String path = BASE_PATH + fileName;
        String fileContent = "My very important information.";

        String result = handler.writeFile(path, fileContent);
        String content = handler.readFile(path);

        getOutput("RESULT: " + result);
        getOutput("FILE CONTENT: " + content);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
