class girl{
    String name;
    int age;
    String gender;
    int height;
    String mind;
    public void tell(){
        System.out.println("姓名："+name+"，年龄："+age+"，性别："+gender+"，身高："+height+",性格:"+mind);
    }
}


public class 女朋友 {
    public static void main(String args []){
        girl gir= new girl();
        gir.name = "张佳乐";
        gir.age = 18;
        gir.gender = "女";
        gir.height = 160;
        gir.mind = "merry";
        gir.tell();
    }
}
