package groupproj;

public class Criminal extends Suspect {
    private boolean inJail;
    private String notes;
    private int numCrimes;
    

    public Criminal(boolean inJail, boolean access, String notes, int numCrimes,
    String bodyType, boolean isCriminal, String[] relatives)
    {
        super(bodyType, isCriminal, relatives);
        this.notes = notes;
    }
    public void setJail()
    {
        /*
        if(this.Criminal.inJail == true)
        {
            inJail = true;
        }
        else
        {
            inJail = false;
        }
        */
    }
    public void setNumCrimes()
    {
        /*
        for(int i=0;i<cases.length;i++)
        {
            if(criminal.getCrimes[i] != null)
            {
                numCrimes++;
            }
        }
        */
    }
    //set crimeTypes 
    //get crimeTypes String[]
    public boolean getJail()
    {
        return inJail;
    }
    public int getNumCrimes()
    {
        return numCrimes;
    }
    public String getNotes()
    {
        return notes;
    }
   

}