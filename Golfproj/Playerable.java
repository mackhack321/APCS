
import java.util.*;

public interface Playerable
{
   public void addCardToHand( Card temp );

   public void resetHand();

   public void setWinCount( int numWins );

   public int getWinCount();
   
   public int swapCards();

   public int getHandSize();

   public int getHandValue();
   
   public List<Card> getHand();
}
