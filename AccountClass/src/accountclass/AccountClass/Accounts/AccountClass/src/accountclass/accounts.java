package accountclass;

/**
 *
 * @author alejandrocruz
 */
public abstract class accounts 
{
    private int accountID;
    private String accountName;    
    
//getters and setters
    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

//Constructors
    public accounts(int accountID, String accountName) {
        this.accountID = accountID;
        this.accountName = accountName;
    }
//override toString method
@Override
public String toString() {
return "accounts{" + "accountID=" + accountID + ", accountName=" + accountName + '}';
    }
    
    
    
}
