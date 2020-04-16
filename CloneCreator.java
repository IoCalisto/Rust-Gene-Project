import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class CloneCreator
{
    //THIS WILL RUN IF CLONE IS NOT FOUND

    public CloneCreator()
    {
    }

    public boolean newEntry(String cloneName)
    {

        try
        {

            File cloneStorage = new File("javarust1\\"+cloneName+".txt");

            if(!cloneStorage.exists()){
                FileWriter fr = new FileWriter(cloneStorage, true);
                fr.write("0");
                fr.close();
                System.out.println("New Clone: "+cloneName+" was added to the database with an amount of 0");

            }else{
                System.out.println("Clone: "+cloneName+" already exists, new file was NOT added");
                
                
            }

            return true;
        }catch (Exception e){
            System.out.println("An error has occurred");
            return false;
        }

    }
}
