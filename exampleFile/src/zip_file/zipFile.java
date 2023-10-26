package zip_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


public class zipFile {
	public static void main(String[] args) throws IOException{
		String sourceFile = "/Users/trinhquocthang/Documents/Workspace/java/exampleFile/zip_file/test1.txt";
		FileOutputStream fos = new FileOutputStream("/Users/trinhquocthang/Documents/Workspace/java/exampleFile/zip_file/compression.zip");
		ZipOutputStream zipOut = new ZipOutputStream(fos);
		
		File fileTozip = new File(sourceFile);
		FileInputStream fis = new FileInputStream(fileTozip);
		ZipEntry zipEntry = new ZipEntry(fileTozip.getName());
		
		zipOut.putNextEntry(zipEntry);
		byte[] bytes =new  byte[1024];
		int byteRead;
		while ((byteRead = fis.read(bytes))>=0)	{
			zipOut.write(bytes, 0, byteRead);
		}
		zipOut.close();
		fos.close();
		fis.close();
	}
}
