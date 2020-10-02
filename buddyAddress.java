import java.util.ArrayList;
import java.util.Iterator;

public class buddyAddress {
    private ArrayList<Buddy> buddies;

    public buddyAddress() {
        this.buddies = new ArrayList<Buddy>();
    }

    public void addBuddy(Buddy buddy) {
        buddies.add(buddy);
    }

    public boolean removeBuddy(Buddy buddyToRemove) {
        Iterator<Buddy> buddiesItr = buddies.iterator();
        while (buddiesItr.hasNext()) {
            if (buddiesItr.next().equals(buddyToRemove)) {
                buddiesItr.remove();
                return true;
            }
        }
        return false;
    }
    // test comment as part of step 16 of lab instructions
}
