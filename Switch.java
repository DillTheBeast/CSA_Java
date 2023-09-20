public class Switch {
    public static void main(String[] args) {
        String animal = "cat";
        String result;
        //If and or statement
        if(animal.equals("cat") || animal.equals("dog") || animal.equals("tiger")) {
            result = "animal";
        }

        //Swtich case statement
        switch (animal) {
            case "dog":
                result = "pet";
                break;
            case "cat":
                result = "domestic animal";
                break;
            case "tiger":
                result = "wild animal";
                break;
            default:
                result = "unknown animal";
                break;
        }
        System.out.println(result);
    }
}
