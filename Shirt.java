public class Shirt {
    private int shirtID = 0;
    private String description = "--description required--";
    private char colorCode = 'U';
    private double price = 0.0;

    // "getter" method allowing access to value of private variable without allowing access to variable
    public char getColorCode(){
        return colorCode;
    }

    // "setter" method allowing changing value of private variable without allowing access to variable
    public void setColorCode(char newCode){
        if (newCode=='R' || newCode=='G' || newCode=='B'){
            colorCode = newCode;
            return;
        }
        System.out.println("Invalid color code, Use R, G, or B");
    }
    
}
