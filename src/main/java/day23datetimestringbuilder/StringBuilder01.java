package day23datetimestringbuilder;

public class StringBuilder01 {
    public static void main(String[] args) {
        String s="Java";
        String t=s+"!";
        String w=t+"?";

        StringBuilder sb=new StringBuilder("Python");
        sb.append("!").append("5").append("dfgghjj");
        System.out.println(sb);

    }

}
