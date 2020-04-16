import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

public class ModifyClone
{

    
    public boolean depositClone(String cloneName, int amount)
    {
        CloneCreator clone = new CloneCreator();
        
        try{
                System.out.println("PING1");
                
              File cloneStorage = new File("javarust1\\"+cloneName+".txt"); //Selects file
              
              System.out.println("PING2");
              
              FileWriter fr = new FileWriter(cloneStorage); //Creates FileWriter to write to file
              
              System.out.println("PING3");
              
              //FileWriter fr = new FileWriter(cloneStorage, false);
              if(!cloneStorage.exists()){clone.newEntry(cloneName);System.out.println("NEW");} //creates new clone if one does not exist
              
              
              System.out.println("PING4");
                
                
              Scanner cloneReader = new Scanner(cloneStorage); //creating reader to read from file
              
              
              System.out.println("PING5");
              
              //TRYCATCH FOR DEBUG
              try{
                  
                String temp=cloneReader.nextLine(); //Should read first line but doesn't?
                System.out.println("Amount: "+temp);
                cloneReader.close();
                }catch (Exception e){System.out.println("Could not parse amount from clone...debug readout: ");e.printStackTrace();}
              
              
              int currentAmount=Integer.parseInt(cloneReader.nextLine()); //Should read first line and convert to int but doesn't?
              
              System.out.println("PING6");
              
              int newAmount=currentAmount+amount; //Create newAmount
              
              fr.write(newAmount); //Output new amount to 
              
              fr.close();
               return true;
        }catch (Exception e){System.out.println("An error has occurred NAME, AMOUNT:"+cloneName+" "+amount);return false;}
        
        
        
        
        //return false;
    }
}
