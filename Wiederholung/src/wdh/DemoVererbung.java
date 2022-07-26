package wdh;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class DemoVererbung {
	public static void main(String[] args) {
		Date date = new Date();
		GregorianCalendar gc = new GregorianCalendar();
		LocalDate ld = LocalDate.of(0, 0, 0);
		
		File f = new File("");
		Path p = Paths.get("");
		try {
			Files.createDirectories(p, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
