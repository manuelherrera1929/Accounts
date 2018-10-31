package accountclass;

/**
 *
 * @author alejandrocruz
 */
// Create abstract class
public abstract class Accounts 
{
    protected int accountID;
    private String accountName; 
    
    public abstract double computeSales();
    
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

//constructor
    public Accounts(int accountID, String accountName) {
        this.accountID = accountID;
        this.accountName = accountName;
    }
//toString    
@Override
public String toString() {
return "accounts{" + "accountID=" + accountID + ", accountName=" + accountName + '}';
    }
       
}
