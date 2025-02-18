import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class DataSource {
  public void add() {
    try {
      tryAdd();
    } catch (IOException e) {
      System.err.println("Hiba! A fájl írása sikertelen!");
      System.err.println(e.getMessage());
    }
  }
  public void tryAdd() throws IOException {
    System.out.println("add");
    String hun = input("hun: ");
    String eng = input("eng: ");
    FileOutputStream fos = new FileOutputStream("words.txt", true);
    OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
    BufferedWriter bw = new BufferedWriter(osw);
    bw.write(hun + ":" + eng);
    bw.newLine();
    bw.close();
  }

  private String input(String msg) {
    System.out.print(msg);
    return System.console().readLine();
  }
}
