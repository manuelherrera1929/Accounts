package accountclass;

/**
 *
 * @author alejandrocruz
 */
public class Main 
{

    public static void main(String[] args) 
    {   
        Accounts serviceAccount = new Services(40.0, 12.00, 0, "service");
        Supplies suppliesAccount = new Supplies(1, "supplies", 500.00, 300.00, 400.00);
        Paper paperAccount = new Paper(200.00, 12.00, 3, "Paper");
        
        System.out.println(serviceAccount);
        System.out.println(suppliesAccount);
        System.out.println(paperAccount);
        System.out.println(serviceAccount.computeSales());
        System.out.println(suppliesAccount.computeSales());
        System.out.println(paperAccount.computeSales());
        
        
        
        Accounts[] accounts= new Accounts[3];
        accounts[0]= serviceAccount;
        accounts[1]= suppliesAccount;
        accounts[2]= paperAccount;
        for(Accounts a : accounts){
            System.out.println(a);
            System.out.println(a.computeSales());
        }
        
    }
    
    
    
}
