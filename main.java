public class main
{

    public static void main (String args[])
    {
        CloneCreator clone = new CloneCreator();
        ModifyClone mod = new ModifyClone();
        clone.newEntry("test1");
        clone.newEntry("test2");
        clone.newEntry("test3");
        clone.newEntry("test4");
        
        mod.depositClone("test4",12);
        

    }
}
