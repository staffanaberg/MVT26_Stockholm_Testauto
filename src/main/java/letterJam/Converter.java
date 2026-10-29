package letterJam;

public class Converter {


    public String getLetter(int number) {
        if(number==1) {
            return "A";
        } else if(number==2) {
            return "B";
        } else if(number==3) {
            return "C";
        } else if(number==7) {
            return "G";
        } else {
            return "FEL!";
        }

    }
}
