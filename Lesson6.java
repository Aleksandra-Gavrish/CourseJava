package Homework6;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class Lesson6 {
    public static String file = "text";
    public static Random random = new Random();
    public static int MAX_LENGTH = 100;
    public static int MIN_LENGTH = 50;

    public static void main(String[] args) {
        createFile("1.txt",createString(random.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH));
        createFile("2.txt",createString(random.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH));
        glueFiles (new String[]{"1.txt","2.txt"},"3.txt");
    }

    public static String createString(int len){
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++){
            sb.append(file.charAt(random.nextInt(file.length())));
        }
        return sb.toString();
    }

    public static void createFile(String fileName, String text){
        try{
            PrintWriter pw = new PrintWriter(fileName);
            pw.write(text);
            pw.flush();
            pw.close();

        } catch (FileNotFoundException e){
            System.err.println(" Ошибки в "  + fileName + e.getCause());
        }
    }
    public static void glueFiles(String[] names, String fileName){
        try{
            FileOutputStream fos = new FileOutputStream(fileName);
            for (String name: names){
                FileInputStream fis = new FileInputStream(name);
                int i;
                do {
                    i = fis.read();
                    if(i != -1){
                        fos.write(i);
                    }
                }while (i != -1);
            }
        } catch (Exception e){
            System.err.println(" Ошибки в "  + fileName + e.getCause());
        }
    }
}


