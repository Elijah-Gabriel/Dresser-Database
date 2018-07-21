import java.util.Scanner;
//A class that keeps a clothes of different types of clothes
public class DresserFrontEnd 
{
 //An array of Dressers
 private Dresser[] dresser;
 public static final int MAX_CLOTHES = 100;
 public DresserFrontEnd()
 {
  dresser = new Dresser[MAX_CLOTHES];
 }
 public Dresser[] getdresser()
 {
  return this.dresser;
 }
 //Adds a new vehicle to the first empty spot in the clothes array
 public void addClothes(Dresser aV)
 {
  for(int i=0;i<dresser.length;i++)
  {
   if(dresser[i] == null)
   {
    dresser[i] = aV;
    return;
   }
  }
  //If it reaches here the array is full
  System.out.println("The Drawer is full!");
 }
 //Removes a vehicle.  It searches through the array for a vehicle that is equal to
 //the parameter and once it is found that value is set to null
 public void removeClothes(Dresser aV)
 {
  for(int i=0;i<dresser.length;i++)
  {
   if(dresser[i] != null && dresser[i].equals(aV))
   {
    dresser[i] = null;
    return;
   }
  }
  //If it reaches here then the vehicle was not found
  System.out.println("The item was not found");
 }
 
 //A static keyboard to be used throughout the frontend
 static Scanner keyboard;
 //Entry point of the program
 public static void main(String[] args)
 {
  keyboard = new Scanner(System.in);//Construct the keyboard
  
  System.out.println("Welcome to the clothes manager");
  Dresser C = new Dresser();//Creates a new instance of the Dresser to be used
  
  boolean quit = false;
  while(!quit)//Runs until the user quits
  {
   printOptions();
   int pick = keyboard.nextInt();
   keyboard.nextLine();
   switch(pick)
   {
   case 1: //Add vehicle
    C.addClothes(makeAVehicleDialog());
    break;
   case 2: //Remove vehicle
    C.removeClothes(makeAVehicleDialog());
    break;
   case 9:
    quit = true;
    break;
   default:
    System.out.println("Invalid input");
   }
   System.out.println("The Dresser currently");
   printDresser(C);
  }
  System.out.println("Goodbye");
 }
 //Displays the options to the user
 public static void printOptions()
 {
  System.out.println("Enter 1: to add Clothes\nEnter 2: to remove Clothes\nEnter 9 to quit");
 }
 //Returns an instance of a vehicle based on user input
 public static Dresser makeAClothesDialog()
 {
  int choice = keyboard.nextLine();
      switch(choice) 
      {
        case 1:
          System.out.println("Enter the type of clothes");
          type = keyboard.nextLine();
          System.out.println("Enter the color");
          color = keyboard.nextLine();
          color.toString();
          clothing = new Clothing(type,color);
          clothing[count] = clothing;
          dresser.add(clothing);
          break;
        case 2:
          System.out.println("Enter the the type of clothes");
          type = keyboard.nextLine();
          System.out.println("Enter the color");
          color = keyboard.nextLine();
          clothing = new Clothing(type, color);
          dresser.remove(clothing);
          break;
        case 3:
          dresser.print();
          break;
        case 4:
          cloth = false;
          break;
      }
 }
 public static void printDresser(Dresser CV)
 {
  for(Dresser c : CV.getDresser())
  {
   if(c == null)
    continue;
   System.out.println(c);
   System.out.println();
  }
 }
}
}
      
                          