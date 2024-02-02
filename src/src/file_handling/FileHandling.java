package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) throws IOException {

        //code to create a new file
//        File myFile= new File("nehaFile.txt");
//        myFile.createNewFile();

        //code to write in the file
//        try {
//            FileWriter fileWriter= new FileWriter("nehaFile.txt");
//            fileWriter.write("This is my new file in java");
//            fileWriter.close();
//        }catch (IOException e){
//            e.printStackTrace();
//        }


        //code to read the new file
//        File file = new File("nehaFile.txt");
//        Scanner scanner= new Scanner(file);
//        while (scanner.hasNextLine()){
//            String line= scanner.nextLine();
//            System.out.println(line);
//        }
//        scanner.close();


        File file= new File("nehaFile.txt");
        if(file.delete()){
            System.out.println("The file has been deleted"+file.getName());
        }
    }
}
