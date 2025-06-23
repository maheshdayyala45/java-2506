package abstraction;

public class User {
    public static void main(String[] args) {
        Lenovo lenovo=new Lenovo();
        lenovo.usbA();
        lenovo.usbC();
        lenovo.hdmi();


        Dell dell= new Dell();
        dell.usbA();
        dell.usbC();
        dell.hdmi();

        //special methods
        dell.microSDSlot();
        dell.display4K();
        

        HP hp=new HP();
        hp.microSDSlot();
        Laptop.audoJack();
        
    }

}
