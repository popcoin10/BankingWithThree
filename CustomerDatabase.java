package bankingapplication1;
import java.util.ArrayList;
/**
 * @author Rich Smith at ZenOfProgramming.com
 */
public class CustomerDatabase
{
   private final ArrayList<Customer> customerList = new ArrayList<>();

   public ArrayList<Customer> getCustomerList ()
   {
      return this.customerList;
   }
}
