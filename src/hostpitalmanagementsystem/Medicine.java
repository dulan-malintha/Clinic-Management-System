
package hostpitalmanagementsystem;


public class Medicine {
    private String item;
    private int token_number;
    
    public String getItem(){
        return item;
    }
    public int getToken_number(){
        return token_number;
    }
    public Medicine(String item)
    {
        this.item = item;
    }
}
