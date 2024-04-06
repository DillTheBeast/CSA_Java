import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        Random f = new Random();
        int[] Sort = new int[10];
        System.out.println("Random numbers generated: ");
        for(int d = 0; d < 10; d++) {
            int rnum = f.nextInt(100);
            System.out.print(" ");
            System.out.println(rnum);
            Sort[d] = rnum;    
        }
        System.out.println("Sorted numbers: ");
        int[] x = bubbleSort(Sort);
        for(int y = 0; y < Sort.length; y++) {
            System.out.println(x[y]);
        }
    }
    public static int[] selectionSort(int[] Sort) {
        for(int z = 0; z < Sort.length; z++) {
            int temp = z;
            int y = 0;
            for(int n = z; n < Sort.length; n++) {
                
                if(Sort[temp] > Sort[n]) {
                    temp = n;
                }  
            }

            y = Sort[temp];
            Sort[temp] = Sort[z];
            Sort[z] = y;
        }
        return Sort;
    }

    public static int[] bubbleSort(int[] Sort) {
        for(int i = 0; i < Sort.length; i++) {
            for(int j = 0; j < Sort.length - 1; j++) {
                if(Sort[j] > Sort[j + 1]) {
                    int temp = Sort[j];
                    Sort[j] = Sort[j + 1];
                    Sort[j + 1] = temp;
                }
            }
        }
        return Sort;
    }
}
