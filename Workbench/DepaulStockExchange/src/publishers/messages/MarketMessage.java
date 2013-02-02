package publishers.messages;

import constants.GlobalConstants.MarketState;
import publishers.messages.exceptions.InvalidMessageException;

/**
 * The MarketMessage class encapsulates data related to the state of the market.
 *
 * @author Tomislav S. Mitic
 */
public class MarketMessage implements StateOfMarket {

  private StateOfMarket marketMessageImpl;

  public MarketMessage(MarketState state) throws InvalidMessageException {
    marketMessageImpl = MessageFactory.createMarketMessageImpl(state);
  }

  @Override
  public MarketState getState() {
    return marketMessageImpl.getState();
  }
}