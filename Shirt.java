import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Shirt {
    private String description = "--description required--";
    private char colorCode = 'U';
    private double price = 0.0;

    //"constructor" methods
    public Shirt(char newCode, double price) {
        setColorCode(newCode);
        setPrice(price);
    }

    public Shirt(char newCode, double price, String newDescription) {
        this(colorCode, price); // calls the other constructor without DRY'ing' the tasks
        setDescription(newDescription);
    }

    // "getter" methods allowing access to value of private variable without allowing access to variable
    public char getColorCode(){
        return colorCode;
    }

    // "setter" methods allowing changing value of private variable without allowing access to variable
    public void setColorCode(char newCode){
        if (newCode=='R' || newCode=='G' || newCode=='B'){
            colorCode = newCode;
            return;
        }
        System.out.println("Invalid color code, Use R, G, or B");
    }
    
    public void setDescription(String newDescription){
        description = newDescription;
    }

    public void setPrice(double newPrice){
        if (newPrice < 0.00){
            System.out.println("Price must not be negative");
            return;
        }
        price = newPrice;
    }

    public void display(){
        System.out.println("Shirt: [" + description + ", " + colorCode + ", " + price + "]");
    }

}
