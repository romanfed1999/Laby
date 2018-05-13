package lab;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class LawyerToFileWriter {
	public final void writeToFile(final List<Lawyer> lawyers) {
        try (PrintWriter writer = new PrintWriter("file.csv")) {
        	writer.println(Lawyer.getHeaders());
            for (Lawyer lawyer: lawyers) {
                writer.println(lawyer.toCSV(lawyer));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
