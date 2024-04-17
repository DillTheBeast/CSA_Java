public class idk {
    public static void main(String[] args) {
        Meal meal = new Meal("Entree", 5.0);
        meal.toStrings();
        DeluxeMeal deluxeMeal = new DeluxeMeal("Entree", "Side", "Drink", 5.0);
        deluxeMeal.toStrings();
    }
}

class Pet
{
    private String name;
    private String species;
    public Pet(String n, String s)
    {
        name = n;
        species = s;
    }
    public String getName()
    {
        return name;
    }
    public void printPetInfo()
    {
        System.out.print(name + " is a " + species);
    }
}

class PetOwner {
    private Pet thePet;
    private String owner;
    public PetOwner(Pet t, String o) {
        thePet = t;
        owner = o;
    }

    public void printPetInfo() {
        thePet.printPetInfo();
        System.out.println(" owned by " + owner);
    }
}