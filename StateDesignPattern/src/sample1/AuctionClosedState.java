package sample1;

public class AuctionClosedState implements AuctionState{
    @Override
    public void startAuction(Auction auction) {
        auction.setState(new AuctionStartedState());
        System.out.println("Auction is started.");
    }

    @Override
    public void closeAuction(Auction auction) {
        System.out.println("Auction is already closed.");
    }

    @Override
    public void placeBid() {
        System.out.println("Cannot place bid. Auction is closed.");
    }
}
