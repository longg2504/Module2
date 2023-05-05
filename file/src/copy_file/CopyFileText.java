package copy_file;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public List<String> readFile(String filePath){
        List<String> list = new ArrayList<>();
        try{
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str = "";
            while ((str = br.readLine()) != null){
                list.add(str);
            }
            br.close();

        }catch(Exception e){
            System.out.println("Error");
        }
        return list;
    }

    public void writeFile(String filePath , List<String> list ){
        try{
            FileWriter fw = new FileWriter(filePath);
            BufferedWriter br = new BufferedWriter(fw);
            for(String o :list) {
                br.write(o.toString() + "\n");
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        List<String> strings = copyFileText.readFile("D:\\CodeG\\Module2\\file\\src\\copy_file\\Text.txt");
        copyFileText.writeFile("D:\\CodeG\\Module2\\file\\src\\copy_file\\coppyText.txt", strings);
    }
}
