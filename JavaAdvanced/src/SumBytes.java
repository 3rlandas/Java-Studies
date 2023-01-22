import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args) {

        String inputPath = "C:\\Coding\\Java-Studies\\JavaAdvanced\\resources\\04-Java-Advanced-Files-and-Streams-Exercise-Resources\\input.txt";

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath));

            String line = bufferedReader.readLine();

            long count = 0;
            while (line != null) {

                for (char c : line.toCharArray()) {
                    count += c;
                }
                line = bufferedReader.readLine();
            }
            System.out.println(count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
