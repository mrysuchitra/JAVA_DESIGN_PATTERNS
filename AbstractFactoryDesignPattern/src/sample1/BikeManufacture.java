package sample1;

public class BikeManufacture {

    public static void main(String[] args){

        var mountainBike = buildBike("Mountain");
        var roadBike = buildBike("Road");

        System.out.println("Mountain Bike: " + mountainBike);
        System.out.println("Road Bike: " + roadBike);
    }

    private static Bike buildBike(String bikeType){
        var bikeFactory = FactoryMaker.getBikeFactory(bikeType);
        var handlebars = bikeFactory.createHandleBars();
        var pedals = bikeFactory.createPedals();
        var frontTire = bikeFactory.createTire();
        var backTire = bikeFactory.createTire();
        return new Bike(handlebars, pedals, frontTire, backTire);
    }
}
