import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumLines {
    public static void main(String[] args) {

        String inputPath = "C:\\Coding\\Java-Studies\\JavaAdvanced\\resources\\04-Java-Advanced-Files-and-Streams-Exercise-Resources\\input.txt";

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath));

            String line = bufferedReader.readLine();
            while (line != null) {

                int lines = 0;

                for (char c : line.toCharArray()) {

                    lines += c;
                }

                System.out.println(lines);
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
