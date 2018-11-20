package mock;

public class App {
    private StockService stockService;

    public App(StockService stockService) {
        this.stockService = stockService;
    }

    public App() {
    }

    public String use(String val) {
        return stockService.getPrice(val) + " ok.";
    }
}
