package day22staticblocksconstructors;

public class Car {
    String make="Honda";
    String model="Accord";
    int year=2023;
    boolean hybrid= true;

    //consructor oluştururken parametrelerini yazdığımızda
    //butun ozelliklerine biz karar vermis oluruz
    //default consructor yazdigimizda sadece ayni objeleri uretmis oluruz
     Car(String make, String model, int year, boolean hybrid){

        //this.make demek bu class'daki make demeek
        //bu class'daki make'i benim verdigim make yap
        this.make=make;
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;
    }



    Car(String make, String model ){
        this.model=model;
        this.make=make;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
    Car(String model,int year){
        this.model=model;
        this.year=year;


    }

    public Car(String make) {
        this.make = make;
    }
}
