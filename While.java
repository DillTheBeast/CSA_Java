public class While {
    public static void main(String[] args) {
        //For loop works:
        for(int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        //While loop works:
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        //If statement works:
        int j = 0;
        if(j <= 10) {
            System.out.println(j);
            j++;
            System.out.println(j);
        }

    }
}
