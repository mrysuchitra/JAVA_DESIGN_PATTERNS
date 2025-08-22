package sample1;

public class MountainBikeFactory implements BikeFactory{
    @Override
    public HandleBars createHandleBars() {
        return new MountainBikeHandleBars();
    }

    @Override
    public Pedals createPedals() {
        return new MountainBikePedals();
    }

    @Override
    public Tire createTire() {
        return new MountainBikeTire();
    }
}
