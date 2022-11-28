package Logic;

import Options.Authority;
import Options.Traits;
import Options.Ethics;
import Options.Species;

// An Empire is a group of planets and star systems that are ruled by the same government and controlled by a single player (or AI).

public class Empire {
    
    // Constructor

    public Empire() {
        AuthorityGen();
        EthicsGen();
        SpeciesGen();
        TraitsGen();
    }


    // Methods

    public void AuthorityGen() {
        System.out.println("");
        System.out.println("Authority:");
        System.out.println(Authority.randomAuthority());
        System.out.println("");
    }

    public void EthicsGen() {
        System.out.println("Ethics:");
        System.out.println(Ethics.randomEthics());
        System.out.println(Ethics.randomEthics());
        System.out.println("");
    }

    public void SpeciesGen() {
        System.out.println("Species:");
        System.out.println(Species.randomSpecies());
        System.out.println("");
    }

    public void TraitsGen() {
        System.out.println("Traits:");
        System.out.println(Traits.randomTraits());
        System.out.println(Traits.randomTraits());
        System.out.println(Traits.randomTraits());
        System.out.println("");
    }
}