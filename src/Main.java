
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class Main {


    public static void main(String[] args) throws IOException {

         // Le fichier d'entrée
        Path path = Paths.get("E:/Git/Gosecuri/JenkinsGosecuri/src/","Staff.txt");

        //read lines
        Files.readAllLines(path).forEach(System.out::println);


    }
}
