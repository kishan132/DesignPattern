package my.learning.designpattern.BehavioralDP.MediatorDP

/**
 * **Behavioral Design Pattern guides how different objects communicate with each other efficiently and distribute tasks efficiently,
 * making software system flexible and easy to maintain**
 *
 * Mediator Design Pattern encourages loose coupling among classes and allow them to communicate through a mediator object.
 * Two object should not communicate directly with each other, but through a mediator object.
 */

fun main() {

    val mediator: AuctionMediator = AuctionMediatorImpl()

    val bidder1: Bidder = BidderImpl("Bidder 1", mediator)
    val bidder2: Bidder = BidderImpl("Bidder 2", mediator)
    val bidder3: Bidder = BidderImpl("Bidder 3", mediator)

    mediator.addBidder(bidder1)
    mediator.addBidder(bidder2)
    mediator.addBidder(bidder3)

    bidder1.placeBid(1000)  // it will notify only bidder2 and bidder3 via mediator
    bidder2.placeBid(2000)  // it will notify only bidder1 and bidder3 via mediator
    bidder3.placeBid(3000)  // it will notify only bidder1 and bidder2 via mediator

}
