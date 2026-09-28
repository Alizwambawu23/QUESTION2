public class ConsoleSales extends Console{
    public ConsoleSales(ConsoleModel model){super(model);}

    public void Console(){
        System.out.println("Select the beverage Type");
        System.out.println("1)  PS5");
        System.out.println("2)  XBOX");
        System.out.println("2)  SWITCH");

        System.out.println("1");
        System.out.println("Enter the store:"+getStore());
        System.out.println("Enter the total Sales of the Console for Number 1 Electronics Store:"+getTotalSales());
        System.out.println("Console Sales Report");
        System.out.println("*********************");
        System.out.println("Console Type"+getConsoleType());
        System.out.println("Store:"+getStore());
        System.out.println("Total Sales:"+getTotalSales());
    }
}
