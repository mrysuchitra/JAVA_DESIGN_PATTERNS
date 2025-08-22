package sample1;

public class Auction {
    private AuctionState state;

    public Auction() {
        this.state = new AuctionClosedState();
    }

    public void setState(AuctionState state) {
        this.state = state;
    }

    public void startAuction() {
        state.startAuction(this);
    }

    public void closeAuction() {
        state.closeAuction(this);
    }

    public void placeBid() {
        state.placeBid();
    }


}
