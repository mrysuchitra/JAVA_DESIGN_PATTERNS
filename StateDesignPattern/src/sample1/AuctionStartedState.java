package sample1;

public class AuctionStartedState implements AuctionState{
    @Override
    public void startAuction(Auction auction) {
        System.out.println("Auction is already started.");
    }

    @Override
    public void closeAuction(Auction auction) {
        auction.setState(new AuctionClosedState());
        System.out.println("Auction is closed.");
    }

    @Override
    public void placeBid() {
        System.out.println("Bid placed successfully.");
    }
}
