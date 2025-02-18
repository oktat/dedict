import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class DataSource {
  public void add(String hun, String eng) {
    try {
      tryAdd(hun, eng);
    } catch (IOException e) {
      System.err.println("Hiba! A fájl írása sikertelen!");
      System.err.println(e.getMessage());
    }
  }
  public void tryAdd(String hun, String eng) throws IOException {
    System.out.println("add");
    FileOutputStream fos = new FileOutputStream("words.txt", true);
    OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
    BufferedWriter bw = new BufferedWriter(osw);
    bw.write(hun + ":" + eng);
    bw.newLine();
    bw.close();
  }


}
