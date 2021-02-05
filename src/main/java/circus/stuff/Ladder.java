<<<<<<< HEAD:src/main/java/circus/Ladder.java
package circus;

public class Ladder extends Equipment {
=======
package circus.stuff;

import circus.Asset;

public class Ladder extends Equipment implements Asset {
>>>>>>> improved:src/main/java/circus/stuff/Ladder.java

    public Ladder(int purchasePrice) {
        super(purchasePrice);
    }

    @Override
    public int getValue() {
        return purchasePrice / 2;
    }
}
