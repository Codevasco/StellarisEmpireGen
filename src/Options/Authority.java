package Options;

import java.util.Random;

// An Empire's Authority determines how power is transferred in the government.

public enum Authority {
    DEMOCRATIC,
    OLIGARCHIC,
    DICTATORIAL,
    IMPERIAL;

    public static final Random authGen = new Random();
    private static final Authority[] auth = values();

    public static Authority randomAuthority() {
        return auth[authGen.nextInt(auth.length)];
    }
}