package DesignPatterns.Creational;

public class Singleton {
    private static Singleton returnSingleInstance ;

    private Singleton() {}

    public static  Singleton getInstance(){
        if (returnSingleInstance == null){
            synchronized(Singleton.class){
                returnSingleInstance = new Singleton();
                return returnSingleInstance;
            }
        }
        return returnSingleInstance;
    }

    public static void main(String[] args){
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());

    }

}
