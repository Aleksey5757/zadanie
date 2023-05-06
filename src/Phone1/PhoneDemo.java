package Phone1;

public class PhoneDemo {
    public static void main(String[] args){
     Phone phone1=new Phone("1","Apple",10);
     Phone phone2=new Phone("2","Xiaomi");
     Phone phone3=new Phone();



     //phone2.weight = 15;

     System.out.println("Первый");
     System.out.println(phone1.getNumber());
     System.out.println(phone1.model);
     System.out.println(phone1.weight);
     System.out.println();

     System.out.println("Второй");
     System.out.println(phone2.getNumber());
     System.out.println(phone2.model);
     System.out.println(phone2.weight);
     System.out.println();

     System.out.println("Три");
     System.out.println(phone3.getNumber());
     System.out.println(phone3.model);
     System.out.println(phone3.weight);
     System.out.println();

     phone1.receiveCall("Мама");
     phone2.receiveCall("Папа");

    }
}
