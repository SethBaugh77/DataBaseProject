import java.util.ArrayList;

public class Criminal extends Person{
    private boolean inJail;
    private String notes;
    private long numCrimes;

    public Criminal(String fName,String lname ,long Age,double Height,double Weight, String Gender,String Address,
    String Phone, String DateOfBirth,boolean IsAdult,long id, boolean inJail, String notes, long numCrimes){
        super(fName,lname ,Age, Height, Weight,  Gender, Address,
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

    // public void setNumCrimes(ArrayList<Case> cases){
    //     for(int i=0;i<cases.size();i++){ 
    //         if(cases.get(i) != null && this.name.equals(cases.get(i).getCriminals().name)){
    //             numCrimes++; 
    //         }
    //     }        
    // }
}
