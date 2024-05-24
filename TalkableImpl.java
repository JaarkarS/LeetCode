public class TalkableImpl implements Sayable {
    public void say(String msg){
        System.out.println(msg);

    }
    public static void main(String args[]){
        TalkableImpl timpl = new TalkableImpl();
        timpl.talk("hi how are you");
    }
}
@FunctionalInterface
interface Sayable extends Talkable{
    void say(String msg);   // abstract method
}

