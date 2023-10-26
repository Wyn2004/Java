package zip_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class zipDirectory {
	private static void zipFolder(File fileToZip, String fileName, ZipOutputStream zipOut) throws IOException {
		if (fileToZip.isHidden()) {
			return;
		} 
		if (fileToZip.isDirectory()) {
			if (fileName.endsWith("/")) {
				zipOut.putNextEntry(new ZipEntry(fileName));
				zipOut.closeEntry();
			} else {
				zipOut.putNextEntry(new ZipEntry(fileName + "/"));
				zipOut.closeEntry();
			}
			File[] childFiles = fileToZip.listFiles();
			for (File file : childFiles) {
				zipFolder(file, fileName + "/" + file.getName(), zipOut);
			}
			return;
		}
		FileInputStream fis = new FileInputStream(fileToZip);
		ZipEntry zipEntry = new ZipEntry(fileName);
		zipOut.putNextEntry(zipEntry);

		byte[] bytes = new byte[1024];
		int byteRead;
		while ((byteRead = fis.read(bytes)) >= 0) {
			zipOut.write(bytes, 0, byteRead);
		}
		fis.close();
	}

	public static void main(String[] args) throws IOException {
		String sourceFolder = "/Users/trinhquocthang/Documents/Workspace/java/exampleFile/zip_file/testFolder";
		FileOutputStream fos = new FileOutputStream(
				"/Users/trinhquocthang/Documents/Workspace/java/exampleFile/zip_file/compressionFolder.zip");
		ZipOutputStream zipOutput = new ZipOutputStream(fos);

		File fileToZip = new File(sourceFolder);
		zipFolder(fileToZip, fileToZip.getName(), zipOutput);
		zipOutput.close();
		fos.close();
	}
}
