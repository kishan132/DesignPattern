package my.learning.designpattern.BehavioralDP.MediatorDP

class AuctionMediatorImpl : AuctionMediator {

    private val bidders = mutableListOf<Bidder>()

    override fun addBidder(bidder: Bidder) {
        bidders.add(bidder)
    }

    override fun placeBid(bidder: Bidder, bid: Int) {
        bidders.forEach {
            if (it != bidder) {
                it.receiveBidNotification(bid)
            }
        }
    }
}

interface AuctionMediator {
    fun addBidder(bidder: Bidder)
    fun placeBid(bidder: Bidder, bid: Int)
}