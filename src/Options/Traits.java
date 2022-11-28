package Options;

import java.util.Random;

// Traits represents a Species' innate functions, abilities, and personality.

public enum Traits {
    ADAPTIVE,
    AGRARIAN,
    CHARISMATIC,
    COMMUNAL,
    CONFORMISTS,
    CONSERVATIONISTS,
    DOCILE,
    ENDURING,
    VENERABLE,
    INDUSTRIOUS,
    INGENIOUS,
    INTELLIGENT,
    NATURAL_ENGINEERS,
    NATURAL_PHYSICISTS,
    NATURAL_SOCIOLOGISTS,
    NOMADIC,
    QUICK_LEARNERS,
    RAPID_BREEDERS,
    RESILIENT,
    STRONG,
    TALENTED,
    THRIFTY,
    TRADITIONAL;

    public static final Random traitsGen = new Random();
    private static final Traits[] traits = values();

    public static Traits randomTraits() {
        return traits[traitsGen.nextInt(traits.length)];
    }
}