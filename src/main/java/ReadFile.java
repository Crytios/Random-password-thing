import java.util.*;
import java.io.*;
public class ReadFile {
    static String[] append(String[] array, String x) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = x;
        return array;
    }

    ArrayList<String> passwords = new ArrayList<String>();

    public ReadFile()  {

    try {
           BufferedReader fr = new BufferedReader(new FileReader("D:\\Code\\InstagramPasswordCrack\\src\\main\\java\\pass.txt"));
            String pass = "";
            for(int i = 0;(pass = fr.readLine()) != null;i++) {

                passwords.add(pass);

            }
            fr.close();

        } catch (Exception e) {
           e.printStackTrace();
        }


    }


}
