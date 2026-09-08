import java.io.FileWriter;
import java.io.PrintWriter;

public class FileOutputStrategy implements OutputStrategy {
    private String filePath;

    public FileOutputStrategy(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void output(String report) throws Exception {
        try (PrintWriter out = new PrintWriter(new FileWriter(filePath))) {
            out.println(report);
        }
    }
}