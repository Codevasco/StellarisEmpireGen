package Logic;

public class Main {

    public static void main(String[] args) {
        
        Empire empire = new Empire();

        System.out.println("");
        System.out.println("---------------");
        System.out.println("");
        System.out.println("Stellaris Empire Generator v1");
        System.out.println("");

        empire.AuthorityGen();
        empire.EthicsGen();
        empire.SpeciesGen();
        empire.TraitsGen();

        System.out.println("---------------");
    }
}