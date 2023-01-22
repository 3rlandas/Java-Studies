import java.io.*;
import java.util.Locale;

public class CapitalLetters {
    public static void main(String[] args) {

        String inputPath = "C:\\Coding\\Java-Studies\\JavaAdvanced\\resources\\04-Java-Advanced-Files-and-Streams-Exercise-Resources\\input.txt";
        String outputPath = "C:\\Coding\\Java-Studies\\JavaAdvanced\\resources\\04-Java-Advanced-Files-and-Streams-Exercise-Resources\\output.txt";

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath));
            PrintWriter printWriter = new PrintWriter(new FileWriter(outputPath));

            String line = bufferedReader.readLine();

            while (line != null){

                printWriter.write(line.toUpperCase());

                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}