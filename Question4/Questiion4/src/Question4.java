public class Question4 {
    public static void main(String [] args){
        int a,b,c,d;
        String str = "{test:[{test:sdf},{test:sdf},{test:sdf}]}";
        a = str.indexOf("{");
        b = str.indexOf("}");
        c = str.indexOf("[");
        d = str.indexOf("]");
        System.out.print(str.charAt(a));
        System.out.print(str.charAt(c));
        System.out.print(str.charAt(a));
        System.out.print(str.charAt(b));
        System.out.print(str.charAt(a));
        System.out.print(str.charAt(b));
        System.out.print(str.charAt(a));
        System.out.print(str.charAt(b));
        System.out.print(str.charAt(d));
        System.out.print(str.charAt(b));
    }
}
