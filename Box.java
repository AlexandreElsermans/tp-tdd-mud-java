import java.util.ArrayList;

public class Box {
    ArrayList<Thing> contents = new ArrayList<Thing>();
    
    Box() {System.out.println("Box créée");}

    public void add(Thing truc) {
        this.contents.add(truc);
    }
}