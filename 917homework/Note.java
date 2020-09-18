package class917;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Note {
      public static void main(String[] args) {
		OutputStream out = System.out;
		BufferedReader br = null; 
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new OutputStreamWriter(out));
			br = new BufferedReader(new FileReader("C:\\GBA\\IO" + File.separator+"note.txt")); 
			String line = null; 
			while ((line = br.readLine()) != null) {
				bw.write(line); 
				bw.newLine(); 
				bw.flush();
			}
		}catch (Exception e){
			e.printStackTrace(); 
		} finally {
			try {
				if(bw != null)
					bw.close();
				if (br != null)
					br.close();
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}
}
