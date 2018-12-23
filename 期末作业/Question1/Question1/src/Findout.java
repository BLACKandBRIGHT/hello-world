

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

 class FileUtil {

    public static Student[] parseStudents(String filePath) throws IOException {

        Student[] stus = new Student[18826];

        File file = new File(filePath);
        BufferedReader reader = new BufferedReader(
                new FileReader(file)
        );

        int i = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            String[] info = line.split(",");
            Student student = new Student(info[0], info[1]);
            stus[i++]=student;
        }
        return stus;
    }

}

 class Student {

    private String stuid;
    private String name;

    public Student(String stuid,String name){
        this.stuid=stuid;
        this.name=name;
    }

    public String getStuid() {
        return stuid;
    }

    public String getName() {
        return name;
    }
}


public class Findout {
    public static void main(String args[]){
System.out.println();
try {
    System.out.println());
}catch (IOException e) {
}}
}
