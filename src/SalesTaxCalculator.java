public class SalesTaxCalculator {
    public static void
    main(String[] args)
    {
        //Declarations
        final double SALES_TAX_RATE =.05;
        double purchasePrice = 0;
        double salesTaxAmount = 0;


        // User Prompt
        System.out.println("Enter the purchase price : ");

        // User Input Simulation
        System.out.println("125.55");
        purchasePrice = 122.55;

        //Calculate Sales Tax Amount
        salesTaxAmount = purchasePrice * SALES_TAX_RATE;

        // Output to User
        System.out.println("The sales tax for the purchase price of $" + purchasePrice + " Is $" + salesTaxAmount);





    }
}