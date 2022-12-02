package Logic;

import Options.Authority;
import Options.Civics;
import Options.Traits;
import Options.Ethics;
import Options.Species;

// An Empire is a group of planets and star systems that are ruled by the same government and controlled by a single player (or AI).

public class Empire {

    // Attributes 

    private Authority authority;
    private Civics civics;
    private Ethics ethics;
    private Species species;
    private Traits traits;
    

    // Constructor

    public Empire() {
        authority = Authority.randomAuthority();
        civics = Civics.randomCivics();
        ethics = Ethics.randomEthics();
        species = Species.randomSpecies();
        traits = Traits.randomTraits();
    }

    
    // Methods

    public void EmpireGen() {
        System.out.println(authority);
        System.out.println(civics);
        System.out.println(ethics);
        System.out.println(species);
        System.out.println(traits);
    }
 }