package accountclass;

/**
 *
 * @author alejandrocruz
 */
public class Supplies extends Accounts{
    protected double officeSupSold;
    protected double booksSold;
    protected double apparelSold;

    @Override
    public double computeSales() {
        double totalSold= officeSupSold + booksSold + apparelSold; 
        return totalSold;
    }
    
    
    // Calculate total supplies sold
    public double calcTotal(double officeSupSold, double booksSold, double apparelSold, double totalSold)
    {
        totalSold= officeSupSold + booksSold + apparelSold; 
        return totalSold;
    }

    public double getOfficeSupSold() {
        return officeSupSold;
    }

    public void setOfficeSupSold(double officeSupSold) {
        this.officeSupSold = officeSupSold;
    }

    public double getBooksSold() {
        return booksSold;
    }

    public void setBooksSold(double booksSold) {
        this.booksSold = booksSold;
    }

    public double getApparelSold() {
        return apparelSold;
    }

    public void setApparelSold(double apparelSold) {
        this.apparelSold = apparelSold;
    }  
//constructor
    public Supplies(int accountID, String accountName, double officeSupSold, double booksSold, double apparelSold) {
        super(accountID, accountName);
        this.officeSupSold = officeSupSold;
        this.booksSold = booksSold;
        this.apparelSold = apparelSold;
    } 

    @Override
    public String toString() {
        return "Supplies{" + "officeSupSold=" + officeSupSold + ", booksSold=" + booksSold + ", apparelSold=" + apparelSold + '}';
    }

    
}
