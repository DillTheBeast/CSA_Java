public class Practicing {
    public static void main(String[] args) {
        int[][] test = {{00, 01, 02}, {10, 11, 12}, {20, 21, 22}};
        for(int x = 0; x < test.length; x++) {
            for(int y = test[x].length - 1; y >= 0; y--) {
                if(2 - x == y)
                    System.out.println(test[x][y]);
            }
        }
    }
    
}
