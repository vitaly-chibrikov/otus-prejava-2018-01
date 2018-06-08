
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import static util.Log.log;

public class FileTutor1 {

	public void createFile() {
		File dir = new File("test");
		dir.mkdir();
		File f = new File("test/test.txt");
		try {
			log("Файл создан? "+f.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		log(f.getAbsolutePath());
	}
	
	/**
	 * Метод должен удалять папку test и файл test/test.txt
	 */
	public void deleteFile() {
		File f = new File("test/test.txt");
		f.delete();
		File dir = new File("test");
		dir.delete();
	}
	
	
	@Test
	public void testCreateFile() {
		createFile();
		File f = new File("test/test.txt");
		assertTrue(f.exists());
	}
	
	@Test
	public void testDeleteFile() {
		deleteFile();
		File f = new File("test/test.txt");
		assertFalse(f.exists());
		assertFalse(new File("test").exists());
	}

	public static void main(String[] args)
			throws IOException {
		File dir = new File("subfolder/subsub");
		System.out.println(dir.mkdirs());

	}


}
