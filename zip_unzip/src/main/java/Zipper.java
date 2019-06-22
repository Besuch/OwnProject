import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zipper {
    private static String separator = File.separator;
    private static String file;
    private static String zipFile;

    public static void main(String[] args) {
        //TODO Put YOUR filePath (what do you want to zip)
        file = "filePath";

        //TODO Put YOUR zipFile (filePath.zip)
        zipFile = "zipFile";

        Zipper zipper = new Zipper();
        if (isZipFileExist(zipFile)) {
            return;
        }

        try (FileOutputStream fileOS = new FileOutputStream(zipFile);
             ZipOutputStream zipOS = new ZipOutputStream(fileOS)) {
            File fileToZip = new File(file);

            zipper.zip(fileToZip, fileToZip.getName(), zipOS);

        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
    }

    public void zip(File fileToZip, String fileName, ZipOutputStream zipOS) throws IOException {
        if (fileToZip.isDirectory()) {
            checkFileSeparator(fileName, zipOS);
            File[] listFiles = fileToZip.listFiles();
            for (File eachFiles : listFiles) {
                zip(eachFiles, fileName + separator + eachFiles.getName(), zipOS);
            }
            return;
        }
        try (FileInputStream fileIS = new FileInputStream(fileToZip)) {
            ZipEntry zipEntry = new ZipEntry(fileName);
            zipOS.putNextEntry(zipEntry);

            byte[] bytes = new byte[fileIS.available()];
            int length;
            while ((length = fileIS.read(bytes)) >= 0) {
                zipOS.write(bytes, 0, length);
            }
        }
    }

    private static boolean isZipFileExist(String zipFile) {
        File checkFile = new File(zipFile);
        if (checkFile.exists()) {
            System.out.println("ZIP file is already exist");
        }
        return checkFile.exists();
    }

    private void checkFileSeparator(String fileName, ZipOutputStream zipOS) throws IOException {
        if (fileName.endsWith(separator)) {
            ZipEntry zipEntry = new ZipEntry(fileName);
            zipOS.putNextEntry(zipEntry);
            zipOS.closeEntry();
        } else {
            ZipEntry zipEntry = new ZipEntry(fileName + separator);
            zipOS.putNextEntry(zipEntry);
            zipOS.closeEntry();
        }
    }
}