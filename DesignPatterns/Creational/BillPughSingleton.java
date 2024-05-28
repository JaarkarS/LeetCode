package DesignPatterns.Creational;

public class BillPughSingleton {

    private BillPughSingleton() {}

    private static class SingletonHelper {
        private static final BillPughSingleton returnSingleInstance = new BillPughSingleton();
    }

    public static  BillPughSingleton getInstance(){
           return SingletonHelper.returnSingleInstance;
    }

    public static void main(String[] args){
        System.out.println(BillPughSingleton.getInstance());
        System.out.println(BillPughSingleton.getInstance());
        System.out.println(BillPughSingleton.getInstance());

    }
}
