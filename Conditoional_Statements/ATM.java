public class ATM {
    public static void main(String[] args) {
        int amount=5450;
        int remainder;

        System.out.println("The Total amount is: "+amount);
        int fk_note=amount/5000;
        remainder=amount%5000;

        System.out.println("The total Fk notes are: "+fk_note);
        System.out.println("The remaining amount is: "+remainder);

        int tk_note=remainder/1000;
        remainder=amount%1000;
        if(remainder==0)
        {
            System.out.println("The total Tk notes are: "+tk_note);
            System.out.println("The remaining amount is: "+remainder);
        }

        int hk_note=remainder/100;
        remainder=amount%100;
        if(remainder!=0)
        {
            System.out.println("The total Hk notes are: "+hk_note);
            System.out.println("The remaining amount is: "+remainder);
        }

        int fifk_note=remainder/50;
        remainder=amount%50;

        if(remainder==0)
        {
            System.out.println("The total Fifk notes are: "+ fifk_note);
            System.out.println("The reamaining amount is: "+remainder);
        }
    }
}