package my.learning.designpattern.BehavioralDP.MediatorDP

class BidderImpl(private val name: String, private val mediator: AuctionMediator) : Bidder {

    override fun placeBid(bid: Int) {
        println("$name placed a bid of $bid")
        mediator.placeBid(this, bid)
    }

    override fun receiveBidNotification(bidAmount: Int) {
        println("$name received notification of bid: $bidAmount")
    }

    override fun getName(): String {
        return name
    }
}

interface Bidder {
    fun placeBid(bid: Int)
    fun receiveBidNotification(bidAmount: Int)
    fun getName(): String
}