package Logic;

import Enumerators.Authority;
import Enumerators.Ethics;
import Enumerators.Species;
import Enumerators.Traits;

// An Empire is a group of planets and star systems that are ruled by the same government and controlled by a single player (or AI).

public class Empire {

    // Attributes

    private Authority authority;
    private Ethics ethics;
    private Species species;
    private Traits traits;


    // Getters and Setters

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

    public Ethics getEthics() {
        return ethics;
    }

    public void setEthics(Ethics ethics) {
        this.ethics = ethics;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public Traits getTraits() {
        return traits;
    }
    
    public void setTraits(Traits traits) {
        this.traits = traits;
    }


    // Methods

}
