public abstract class Console implements IConsole{
     String deviceType;
     String storeName;
     int totalSales;

     public Console(ConsoleModel model){
         this.deviceType=model.deviceType;
         this.storeName=model.storeName;
         this.totalSales=model.totalSales;
     }
     public  String getConsoleType(){return deviceType;}
     public String getStore(){return storeName;}
     public int getTotalSales(){return totalSales;}
}
