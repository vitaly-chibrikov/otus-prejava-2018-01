
import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Test;

public class PrintWriterTutor {

	private static final String FILE_OUT = "files/std.out";
	PrintStream out;

	public void redirectOut() {
		try {
			out = new PrintStream(FILE_OUT);
			System.setOut(out);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void printlnData() {
		System.out.println("output test");		
	}
	
	@Test
	public void testOutToFile() {
		redirectOut();
		printlnData();
		
		BufferedReader stdOut;
		try {
			stdOut = new BufferedReader(new FileReader(FILE_OUT));
			String line = stdOut.readLine();
			assertEquals("output test", line);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
