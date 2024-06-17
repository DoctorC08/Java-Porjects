package CardTrading;

import java.util.List;
import java.util.Set;
import java.util.HashSet; 

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> new_collection = new HashSet<>();
        for (String card : cards) {
            new_collection.add(card);
        }
        return new_collection;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if (myCollection.size() == 0 || theirCollection.size() == 0) {
            return false;
        } else if (myCollection != theirCollection) {
            return true;
        } else {
            return false;
        }
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        ;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        ;
    }
}
