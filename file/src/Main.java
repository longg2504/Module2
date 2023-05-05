import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public void wirteToFile(List<Student> list) {
        try {
            FileWriter fw = new FileWriter("data.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            //bw.write(txt); //
//           for(String string : arr) {
//               bw.write(string + "\n"); // viết chuoi vao file
//           }

//           bw.write(student.toString()); // viết đối tượng vo file

            for (Student o : list) {
                bw.write(o.toString() + "\n");
            }
            bw.newLine();

            bw.close();
            fw.close();
        } catch (Exception e) {

        }
    }

    public List<Student> readFromFile(){
        List<Student> list = new ArrayList<>();
        try{
            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while(true){
                line = br.readLine();
                if(line == null) {
                    break;
                }
                String txt[] = line.split(",");
                String name = txt[0];
                int age = Integer.parseInt(txt[1]);
                double mark  = Double.parseDouble(txt[2]);
                list.add(new Student(name ,age , mark));
            }

        }catch (Exception e){
            System.out.println("Error");
        }
        return list;
    }

    public static void main(String[] args) {
//       String txt = " Nguỹen Giang Phuong Long";
//       String arr[] = {"Nguyễn Văn A" , "Nguyễn Văn B", "Trần Tuyết C"};
//        Student student = new Student("Nguyễn Văn A", 20, 8.5);
//        Student student1 = new Student("Nguyễn Văn A", 21, 8.5);
//        Student student2 = new Student("Nguyễn Văn A", 22, 8.5);
//        Student student3 = new Student("Nguyễn Văn A", 23, 8.5);
//        Student student4 = new Student("Nguyễn Văn A", 24, 8.5);
//        Student student5 = new Student("Nguyễn Văn A", 25, 8.5);
//

//        list.add(student);
//        list.add(student1);
//        list.add(student2);
//        list.add(student3);
//        list.add(student4);
//        list.add(student5);

        Main m = new Main();
        List<Student> list = m.readFromFile();
        for(Student o :list){
            System.out.println(o);
        }





    }
}