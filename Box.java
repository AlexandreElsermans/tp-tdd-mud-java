import java.util.ArrayList;

public class Box {
    private ArrayList<Thing> contents = new ArrayList<Thing>();
    private boolean status;
    private int capacity = -1;
    
    Box(boolean status) {
        System.out.println("Box créée");
        this.status = status;
        this.capacity = -1;
    }
    
    Box(boolean status, int capacity) {
        System.out.println("Box créée");
        this.status = status;
        this.capacity = capacity;
    }

    public void add(Thing truc) {
        this.contents.add(truc);
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

  public int getCapacity(){
        return this.capacity;
    }  

    public ArrayList<Thing> getContents(){
        return this.contents;
    }

    public boolean getStatus(){
        return this.status;
    }

    public boolean isOpen(){
        if (this.getStatus() == true){
            System.out.println("La boîte est ouverte.");
            return true;
        } 
        System.out.println("La boîte est fermée.");
        return false;
    }

    public void open(){
        if (!this.status == true){
            this.status = true;
        }
    }

    public void close(){
        if (!this.status == false){
            this.status = false;
        }
    }

    public boolean contains(Thing objet) {
        return this.contents.contains(objet);
    }

    public void remove(Thing objet) throws  RuntimeException{
        if (!this.contents.remove(objet)) {
            throw new RuntimeException("Remove impossible : l'objet n'est pas dans la Box");
        }
    }

    public void actionLook() {
        boolean status = this.getStatus();
        if (status == true) {
            System.out.print("La boîte contient :");
            for (Thing objet : this.contents) {
                System.out.print(" " + objet.getName());
            }
        } else {
            System.out.println("La boîte est fermée.");
        }
    }


}