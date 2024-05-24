
public interface Talkable {
    default void talk(String msg){ System.out.println(msg);}
    int hashCode();
    String toString();
    boolean equals(Object obj);
}
