package YAGNI;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class FileReader {

    public String readFile(String filePath) throws IOException {
        return Files.readString(Path.of(filePath));
    }
}