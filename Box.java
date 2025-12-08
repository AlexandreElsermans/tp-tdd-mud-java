import java.util.ArrayList;

public class Box {
    private ArrayList<Thing> contents = new ArrayList<Thing>();
    
    Box() {System.out.println("Box créée");}

    public void add(Thing truc) {
        this.contents.add(truc);
    }

    public ArrayList<Thing> getContents(){
        return this.contents;
    }

    public boolean contains(Thing objet) {
        return this.contents.contains(objet);
    }

    public void remove(Thing objet) throws  RuntimeException{
        if (!this.contents.remove(objet)) {
            throw new RuntimeException("Remove impossible : l'objet n'est pas dans la Box");
        }
    }
}