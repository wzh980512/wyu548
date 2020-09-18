package class917;

import java.io.IOException;

public class Myfile {
      public static void main(String[] args) throws IOException {
    	  String path = "C:/JMPX";
    	  String oldName = "myfile.txt";
    	  String newName = "myfile_cp2.txt";
    	  renameFile(path,oldName,newName);
    	  System.out.println("已成功将C：/JMPX文件夹下myfile.txt文件复制为myfile_cp2.txt");
		
	}

	private static void renameFile(String path, String oldName, String newName) {
		// TODO Auto-generated method stub
		
	}
	}

