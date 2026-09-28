
void main() {

    ConsoleModel model=new ConsoleModel();
    model.deviceType="PS5";
    model.storeName="Number 1 Electronics Store";
    model.totalSales=500;

    ConsoleSales consoleSales=new ConsoleSales(model);
    consoleSales.Console();
}
