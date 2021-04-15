package lab;

class Landmower {
    private int mowingWidth;
    private int power;
    private int tankCapacity;
    private String model;
    private  int price;
    protected  int year;
    protected int serviceTerm;
    private static String additionalInfo;

    public Landmower(){}

    public Landmower(int mowingWidth, int power, int tankCapacity, String model) {
        this(mowingWidth, power, tankCapacity, model, 0, 0,0);
    }

    public Landmower(int mowingWidth, int power, int tankCapacity, String model,
                     int price, int year, int serviceTerm){
        this.resetValues(mowingWidth, power, tankCapacity, model, price, year, serviceTerm);
    }

    public static void printStaticAdditionalInfo(){
        System.out.println(additionalInfo);
    }

    public void printAdditionalInfo(){
        System.out.println(additionalInfo);
    }

    public void resetValues(int mowingWidth, int power, int tankCapacity, String model,
                            int price, int year, int serviceTerm){
        this.mowingWidth = mowingWidth;
        this.power = power;
        this.tankCapacity = tankCapacity;
        this.model = model;
        this.price = price;
        this.year = year;
        this.serviceTerm = serviceTerm;
    }

    public int getMowingWidth() {
        return mowingWidth;
    }

    public static void setAdditionalInfo(String additionalInfo) {
        Landmower.additionalInfo = additionalInfo;
    }

    public static String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setMowingWidth(int mowingWidth) {
        this.mowingWidth = mowingWidth;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getServiceTerm() {
        return serviceTerm;
    }

    public void setServiceTerm(int serviceTerm) {
        this.serviceTerm = serviceTerm;
    }

    public String toString() {
        return
                "{"+" mowingWidth: '" + getMowingWidth() + "'" +
                ", power: '" + getPower() + "'" +
                ", tank capacity: '" + getTankCapacity() + "'" +
                ", model: '" + getModel() + "'" +
                ", price: '" + getPrice() + "'" +
                ", year: '" + getYear() + "'" +
                ", service term'" + getServiceTerm() + "'" +
                ", additional info: '" + getAdditionalInfo() + "'"+"}";
    }
}
;