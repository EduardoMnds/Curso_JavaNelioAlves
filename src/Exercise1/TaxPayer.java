package Exercise1;

public abstract class TaxPayer {

    private String name;
    private Double anualIncome;

    public TaxPayer() {

    }

    public TaxPayer(String name, Double anualIncome) {
        super();
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract Double tax();

}
