
public class FindClone
{


    public FindClone()
    {

    }

    public String locateClone (String cloneName)
    {

        if(cloneName.length()!=6)
            return("INVALID CLONE LENGTH");

        //GHWYX
        //GGXYWH
        String address="";
        char tempChar=cloneName.charAt(0);

        switch(tempChar){
            case 71: //G
            address+="ISLE 1"+"\n";
            break;
            case 72: //H
            address+="ISLE 2"+"\n";
            break;
            case 87: //W
            address+="ISLE 3"+"\n";
            break;
            case 88: //X
            address+="ISLE 4"+"\n";
            break;
            case 89: //Y
            address+="ISLE 5"+"\n";
            break;
            default:
            return("INVALID 1ST CLONE CHARACTER");
        }
        
        tempChar=cloneName.charAt(1);
        switch(tempChar){
            case 71: //G
            address+="LEVEL 1"+"\n";
            break;
            case 72: //H
            address+="LEVEL 2"+"\n";
            break;
            case 87: //W
            address+="LEVEL 3"+"\n";
            break;
            case 88: //X
            address+="LEVEL 4"+"\n";
            break;
            case 89: //Y
            address+="LEVEL 5"+"\n";
            break;
            default:
            return("INVALID 2ND CLONE CHARACTER");
        }
        
        tempChar=cloneName.charAt(2);
        switch(tempChar){
            case 71: //G
            address+="GROUP 1"+"\n";
            break;
            case 72: //H
            address+="GROUP 2"+"\n";
            break;
            case 87: //W
            address+="GROUP 3"+"\n";
            break;
            case 88: //X
            address+="GROUP 4"+"\n";
            break;
            case 89: //Y
            address+="GROUP 5"+"\n";
            break;
            default:
            return("INVALID 3RD CLONE CHARACTER");
        }
        
        tempChar=cloneName.charAt(3);
        switch(tempChar){
            case 71: //G
            address+="BOX 1"+"\n";
            break;
            case 72: //H
            address+="BOX 2"+"\n";
            break;
            case 87: //W
            address+="BOX 3"+"\n";
            break;
            case 88: //X
            address+="BOX 4"+"\n";
            break;
            case 89: //Y
            address+="BOX 5"+"\n";
            break;
            default:
            return("INVALID 4TH CLONE CHARACTER");
        }
        
        tempChar=cloneName.charAt(4);
        switch(tempChar){
            case 71: //G
            address+="ROW 1"+"\n";
            break;
            case 72: //H
            address+="ROW 2"+"\n";
            break;
            case 87: //W
            address+="ROW 3"+"\n";
            break;
            case 88: //X
            address+="ROW 4"+"\n";
            break;
            case 89: //Y
            address+="ROW 5"+"\n";
            break;
            default:
            return("INVALID 5TH CLONE CHARACTER");
        }
        
        tempChar=cloneName.charAt(5);
        switch(tempChar){
            case 71: //G
            address+="COLUMN 1"+"\n";
            break;
            case 72: //H
            address+="COLUMN 2"+"\n";
            break;
            case 87: //W
            address+="COLUMN 3"+"\n";
            break;
            case 88: //X
            address+="COLUMN 4"+"\n";
            break;
            case 89: //Y
            address+="COLUMN 5"+"\n";
            break;
            default:
            return("INVALID 6TH CLONE CHARACTER");
        }
        
        return address;
    }
}
