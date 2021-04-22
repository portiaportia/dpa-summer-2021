public class CarFactory {
    public static Car createCar(String type, String make, String model) {
        Car car = null;

        if(type.equalsIgnoreCase(CarType.SMALL.toString())) {
            car = new SmallCar(make, model);
        } else if(type.equalsIgnoreCase(CarType.SEDAN.toString())){
            car = new SedanCar(make, model);
        } else if(type.equalsIgnoreCase(CarType.LUXURY.toString())) {
            car = new LuxuryCar(make, model);
        }

        if(car != null){
            car.assemble();
        }

        return car;
    }
}
