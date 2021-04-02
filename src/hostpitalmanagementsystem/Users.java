
package hostpitalmanagementsystem;



public class Users {
    private String nic;
    private String name;
    private String account_type;
    private String gender;
    
    public String getNIC(){
        return nic;
    }
    public String getName(){
        return name;
    }
    public String getAccountType(){
        return account_type;
    }
    public String getGender(){
        return gender;
    }
    public Users(String NIC,String Name,String AccountType,String gender){
        this.nic = NIC;
        this.name = Name;
        this.account_type =  AccountType;
        this.gender = gender;
    }
    public Users(String NIC,String Name,String AccountType){
        nic = NIC;
        name = Name;
        account_type =  AccountType;
    }
}
