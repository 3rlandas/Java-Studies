import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class WordCount {
    public static void main(String[] args) {

        String path = "C:\\Coding\\Java-Studies\\JavaAdvanced\\resources\\04-Java-Advanced-Files-and-Streams-Exercise-Resources\\text.txt";
        String searchedWords = "C:\\Coding\\Java-Studies\\JavaAdvanced\\resources\\04-Java-Advanced-Files-and-Streams-Exercise-Resources\\words.txt";
        String outputPath = "C:\\Coding\\Java-Studies\\JavaAdvanced\\resources\\04-Java-Advanced-Files-and-Streams-Exercise-Resources\\WordCountOutput";

        LinkedHashMap<String, Integer> wordCount = new LinkedHashMap<>();

        try {
            List<String> lines = Files.readAllLines(Path.of(searchedWords));

            for (String line : lines) {

                if()

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
