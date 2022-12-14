package Options;

import java.util.Random;

/* Every habitable planet has the potential of developing different populations of intelligent beings that may, naturally or not, develop technologically. 
 * Sometimes, such beings reach a crucial point in their development that allows them access to FTL technology and, as a consequence, the ability to become full-fledged interstellar empires. */

public enum Species {
    HUMANOID,
    MAMMALIAN,
    REPTILIAN,
    AVIAN,
    ARHTROPOID,
    MOLLUSCOID,
    FUNGOID,
    PLANTOID,
    LITHOID,
    NECROID,
    AQUATIC,
    TOXOID;

    public static final Random speciesGen = new Random();
    private static final Species[] species = values();

    public static Species randomSpecies() {
        return species[speciesGen.nextInt(species.length)];
    }
}