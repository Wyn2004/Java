package zip_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipMultiFile {
	public static void main(String[] args) throws IOException{
		List<String> sourceFiles = Arrays.asList("/Users/trinhquocthang/Documents/Workspace/java/exampleFile/zip_file/test1.txt","/Users/trinhquocthang/Documents/Workspace/java/exampleFile/zip_file/test2.txt");
		FileOutputStream fos = new FileOutputStream("/Users/trinhquocthang/Documents/Workspace/java/exampleFile/zip_file/multiCompession.zip");
		ZipOutputStream zipOut = new ZipOutputStream(fos);
		
		for (String childFile : sourceFiles) {
			File childFileToZipFile = new File(childFile);
			FileInputStream fis = new FileInputStream(childFileToZipFile);
			ZipEntry zipEntry = new ZipEntry(childFileToZipFile.getName());
			
			zipOut.putNextEntry(zipEntry);
			byte[] bytes = new byte[1024];
			int byteRead;
			while ((byteRead = fis.read(bytes))>=0)	{
				zipOut.write(bytes,0, byteRead);
			}
			fis.close();
		}
		zipOut.close();
		fos.close();
		
	}
}	
