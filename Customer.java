package bankingapplication1;
/**
 * @author Rich Smith at ZenOfProgramming.com
 */
public class Customer
{
   private String firstName;
   private String lastName;
   private String homeAddress;
   private int userID;
//   private boolean isMarried;

   public Customer (String firstName, String lastName, String homeAddress)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.homeAddress = homeAddress;
      this.userID = userID;
//   this.isMarried=isMarried;
   }

   /**
    * @return the firstName
    */
   public String getFirstName ()
   {
      return firstName;
   }

   /**
    * @param firstName the firstName to set
    */
   public void setFirstName (String firstName)
   {
      this.firstName = firstName;
   }

   /**
    * @return the lastName
    */
   public String getLastName ()
   {
      return lastName;
   }

   /**
    * @param lastName the lastName to set
    */
   public void setLastName (String lastName)
   {
      this.lastName = lastName;
   }

   /**
    * @return the homeAddress
    */
   public String getHomeAddress ()
   {
      return homeAddress;
   }

   /**
    * @param homeAddress the homeAddress to set
    */
   public void setHomeAddress (String homeAddress)
   {
      this.homeAddress = homeAddress;
   }

   /**
    * @return the userID
    */
//   public int getUserID ()
//   {
//      return userID;
//   }
//
//   /**
//    * @param userID the userID to set
//    */
//   public void setUserID (int userID)
//   {
//      this.userID = userID;
//   }

   /**
    * @return the isMarried
    */
//   public boolean isIsMarried ()
//   {
//      return isMarried;
//   }
//
//   /**
//    * @param isMarried the isMarried to set
//    */
//   public void setIsMarried (boolean isMarried)
//   {
//      this.isMarried = isMarried;
//   }

}
