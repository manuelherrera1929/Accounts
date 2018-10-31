package accountclass;

/**
 *
 * @author alejandrocruz
 */
public class Paper extends Accounts
{
    protected double numberofPounds;
    protected double priceperPound;

    @Override
    public double computeSales() {
        return numberofPounds * priceperPound;
    }

    public double getNumberofPounds() {
        return numberofPounds;
    }

    public void setNumberofPounds(double numberofPounds) {
        this.numberofPounds = numberofPounds;
    }

    public double getPriceperPound() {
        return priceperPound;
    }

    public void setPriceperPound(double priceperPound) {
        this.priceperPound = priceperPound;
    }
//costructor
    public Paper(double numberofPounds, double priceperPound, int accountID, String accountName) {
        super(accountID, accountName);
        this.numberofPounds = numberofPounds;
        this.priceperPound = priceperPound;
    }

    @Override
    public String toString() {
        return "Paper{" + "numberofPounds=" + numberofPounds + ", priceperPound=" + priceperPound + '}';
    }
    
}
