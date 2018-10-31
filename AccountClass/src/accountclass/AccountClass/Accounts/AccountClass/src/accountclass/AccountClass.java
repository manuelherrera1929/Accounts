package accountclass;

/**
 *
 * @author alejandrocruz
 */
public class AccountClass 
{

    public static void main(String[] args) 
    {
        accounts Services = new Services();
        Services.setAccountID(0);
        Services.setAccountName("Services");
        accounts Supplies = new Supplies();
        Supplies.setAccountID(0);
        Supplies.setAccountName("Supplies");
        accounts Paper = new Paper();
        Paper.setAccountID(0);
        Paper.setAccountName("Paper");
        
 
        
        System.out.println(Services);
        System.out.println(Supplies);
        System.out.println(Paper);
        
    }
    
}
