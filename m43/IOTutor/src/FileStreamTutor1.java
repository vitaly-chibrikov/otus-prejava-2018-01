
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import static util.Log.log;

public class FileStreamTutor1 {
	private static final String FILES_TEST_PATH = "files/test.txt";
	private static final String TEST_LINE = "test line";

	/**
	 * Записывает в файл FILES_TEST_PATH строку TEST_LINE,  
	 * преобразуя строку в массив байтов.
	 * Для записи используйте класс FileOutputStream.
	 */
	public void writeToFile() {
		try {
			FileOutputStream fileOutputStream =
					new FileOutputStream(
							FILES_TEST_PATH);
			fileOutputStream.write(TEST_LINE.length());
			byte[] s = TEST_LINE.getBytes();
			fileOutputStream.write(s);
			fileOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Считывает строку из файла и возвращает ее, используя FileInputStream.
	 * @return
	 */
	public String readFromFile() {
		try {
			FileInputStream fileInputStream =
					new FileInputStream(FILES_TEST_PATH);
			int i = fileInputStream.read();
			byte[] s = new byte[i];
			fileInputStream.read(s, 0, i);
			String str = new String(s);
			return str;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Test
	public void testFileStream() {
		writeToFile();
		String s = readFromFile();
		assertEquals(TEST_LINE, s);
	}
	
	@Before
	public void createFile() {
		File f1 = new File(FILES_TEST_PATH);
		try {
			f1.delete();
			f1.createNewFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
}
