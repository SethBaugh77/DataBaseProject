import java.util.ArrayList;

public class Criminal extends Person{
    private boolean inJail;
    private String notes;
    private int numCrimes;

    public Criminal(String Name, int Age,int Height,int Weight, String Gender,String Address,
    String Phone, String DateOfBirth,boolean IsAdult,int id, boolean inJail, String notes, int numCrimes){
        super(Name, Age, Height, Weight,  Gender, Address,
        Phone,  DateOfBirth, IsAdult, id);
        this.inJail = inJail;
        this.notes = notes;
        this.numCrimes = numCrimes;
    }

    public boolean getJail(){
        return inJail;
    }

    public void setJail(boolean inJail){
        if(this.inJail == true){ 
            inJail = true; 
        } 
        else{ 
            inJail = false; 
        }
    }

    public String getNotes(){
        return notes;
    }

    public void setNotes(String notes){
        this.notes = notes;
    }

    public int getNumCrimes(){
        return numCrimes;
    }

    public void setNumCrimes(ArrayList<Case> cases){
        for(Case c : cases){
            if(c.getCriminals() != null && c.getCriminals().contains(this.name)){
                numCrimes++;
            }
        }        
    }
}
