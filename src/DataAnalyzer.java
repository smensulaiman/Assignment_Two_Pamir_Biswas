
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DataAnalyzer {

    public static void main(String[] args) {
        String[][] values;
        ReadFiles readFiles = new ReadFiles();
        File file;
        Path filePath = Paths.get("C:\\temp\\newMSC.csv");
        int row = 0, col = 0;

        if (readFiles.checkFile(filePath)) {
            file = filePath.toFile();
            row = readFiles.numberOfRow(file);
            col = readFiles.numberOfCol(file);

            values = new String[row][col];
            values = readFiles.getArray(file, values);
            readFiles.printArray(values);
        }
    }
}
