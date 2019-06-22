import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnZipper {

    private String separator = File.separator;
    private static String zipFile;
    private static String outputFolder;

    public static void main(String[] args) {
        //TODO Put YOUR zipFile (what do you want to unZip)
        zipFile = "zipFile";

        //TODO Put YOUR outputFolder (folder in which you want to put the file)
        outputFolder = "outputFolder";

        UnZipper unZipper = new UnZipper();
        unZipper.unZip(zipFile, outputFolder);
    }

    public void unZip(String zipFile, String outputFolder) {

        try (ZipInputStream zipIS = new ZipInputStream(new FileInputStream(zipFile))) {
            ZipEntry zipEntry = zipIS.getNextEntry();

            while (zipEntry != null) {
                String newFile = outputFolder + separator + zipEntry.getName();

                if (zipEntry.getName().endsWith(separator)) {
                    File folder = new File(newFile);
                    if (folder.exists())
                        return;
                    folder.mkdir();
                } else {
                    File file = new File(newFile);
                    if (file.exists())
                        return;
                    file.getParentFile().mkdirs();
                    extractFile(zipIS, newFile);
                }
                zipIS.closeEntry();
                zipEntry = zipIS.getNextEntry();
            }
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
    }

    private void extractFile(ZipInputStream zipIS, String newFile) throws IOException {
        try (BufferedOutputStream bufOS = new BufferedOutputStream(new FileOutputStream(newFile))) {
            byte[] bytes = new byte[4096];
            int length = 0;
            while ((length = zipIS.read(bytes)) != -1) {
                bufOS.write(bytes, 0, length);
            }
        }
    }
}