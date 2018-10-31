package accountclass;

/**
 *
 * @author alejandrocruz
 */
public class Services extends Accounts{  
    private double numofHours;
    private double rateperHour;

    @Override
    public double computeSales() {
        return numofHours * rateperHour;}
    
// Calculate number of hours work times rate per hour
    public double calculatePerHour(double numofHours, double rateperHour) {
        return numofHours * rateperHour; 
    }
//getters and setters
    public double getNumofHours() {
        return numofHours;
    }

    public void setNumofHours(double numofHours) {
        this.numofHours = numofHours;
    }

    public double getRateperHour() {
        return rateperHour;
    }

    public void setRateperHour(double rateperHour) {
        this.rateperHour = rateperHour;
    }  
    @Override
    public String toString() {
        return "Services{" + "numofHours=" + numofHours + ", rateperHour=" + rateperHour + '}';
    }  
//constructor
    public Services(double numofHours, double rateperHour, int accountID, String accountName) {
        super(accountID, accountName);
        this.numofHours = numofHours;
        this.rateperHour = rateperHour;
    }
    
}
