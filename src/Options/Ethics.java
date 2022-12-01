package Options;

import java.util.Random;

// Ethics are the guiding principles of an Empire and its people and determine an Empire or population's favored courses of action and responses to situations.

public enum Ethics {
    SPIRITUALIST,
    AUTHORITARIAN,
    XENOPHILE,
    MILITARIST,
    PACIFIST,
    XENOPHOBE,
    EGALITARIAN,
    MATERIALIST;

    public static final Random ethicsGen = new Random();
    private static final Ethics[] ethics = values();

    public static Ethics randomEthics() {
        return ethics[ethicsGen.nextInt(ethics.length)];
    } 
}