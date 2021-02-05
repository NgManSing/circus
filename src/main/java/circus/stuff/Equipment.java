<<<<<<< HEAD:src/main/java/circus/Equipment.java
package circus;
=======
package circus.stuff;

import circus.Asset;
>>>>>>> improved:src/main/java/circus/stuff/Equipment.java

public abstract class Equipment implements Asset {
    protected int purchasePrice;

    public Equipment(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}
