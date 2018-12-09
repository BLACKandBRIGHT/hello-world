class Weapen{
    String name;
    int price;
    public void tell(){
        System.out.println("种类："+name+"，价格"+price);
    }
}




public class leave2 {
    public static void main(String args []){
        Weapen wea1 =new Weapen();
        Weapen wea2 =new Weapen();
        Weapen wea3 =new Weapen();
        Weapen wea4 =new Weapen();
        Weapen wea5 =new Weapen();
        wea1.name = "手枪";
        wea2.name = "冲锋枪";
        wea3.name = "机枪";
        wea4.name = "散弹枪";
        wea5.name = "步枪";
        wea1.price = 50000;
        wea2.price = 110000;
        wea3.price = 220000;
        wea4.price = 66000;
        wea5.price = 77000;
        wea1.tell();
        wea2.tell();
        wea3.tell();
        wea4.tell();
        wea5.tell();
    }
}
