package day22staticblocksconstructors;

public class CarRunner {
    public static void main(String[] args) {

        //default consructor kırmızı yandı
        //Car c1=new Car();


        Car c1=new Car("bnm","mj",23,false);
        Car c2=new Car("er","gf",24,true);
        Car c3=new Car("bg","bg",56,false);


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        Car c4=new Car("yu",34);
        System.out.println(c4);


    }
}
