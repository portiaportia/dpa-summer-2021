import java.util.ArrayList;

public abstract class Car {
    private String make;
    private String model;
    protected ArrayList<Accessories> accessories;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        System.out.println("Creating a " + make + " " + model);
        accessories = new ArrayList<>();
    }

    public void assemble() {
        addFrame();
        addWheels();
        addEngine();
        addWindows();
        addAccessories();
        displayAccessories();
    }

    public abstract void addFrame();

    public void addWheels() {
        System.out.println("Adding the Wheels");
    }

    public void addEngine() {
        System.out.println("Adding a Standard Engine");
    }

    public void addWindows() {
        System.out.println("Adding Windows");
    }

    public abstract void addAccessories();

    public void displayAccessories(){
        System.out.println("Accessories: ");
        for(Accessories accessory : accessories){
            System.out.println("- " + accessory.toString());
        }
    }
}
