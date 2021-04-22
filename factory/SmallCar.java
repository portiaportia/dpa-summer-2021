public class SmallCar extends Car {

    public SmallCar(String make, String model){
        super(make, model);
    }

    public void addFrame(){
        System.out.println("Adding a small frame");
    }

    public void addAccessories() {
        accessories.add(Accessories.FLOOR_MATTS);
        accessories.add(Accessories.PHONE_CHARGER);
    }
}
