import java.awt.print.Book;

interface System{}

class Student implements System{
    String Sname ;
    int score;
    public String getSname() {
        return Sname;
    }
    public void setSname(String sname) {
        Sname = sname;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
class Teacher implements System{
    String Tname;
    public String getTname() {
        return Tname;
    }

    public void setTname(String tname) {
        Tname = tname;
    }


    public static void addscore(){

    }
}
class Books implements System {
    String Bname;
    int Bscore;
    public String getBname() {
        return Bname;
    }
    public void setBname(String bname) {
        Bname = bname;
    }
    public int getBscore() {
        return Bscore;
    }
    public void setBscore(int bscore) {
        Bscore = bscore;
    }


}
class Shop implements System{
      public static void Sware(){

      }
}

public class Main {
    public static void main(String [] args){
Student stu1 = new Student();
stu1.Sname = "黎明";
stu1.score = 60;
Teacher tea1 = new Teacher();
tea1.Tname = "刘学长";
        Books bok = new Books();
        bok.Bname = "java实战开发";
        bok.Bscore = 50;
        Shop shop = new Shop();
        if (stu1.score>bok.Bscore){
            java.lang.System.out.println(stu1.Sname+"兑换了"+bok.Bname);
        }
        else{
            java.lang.System.out.println("积分不足！兑换失败！");
        }
    }
}
