public class RecursionQuestion {
    public static void main(String[] args) {
        System.out.println("method1601:");
        method1601(2, 7);
        System.out.println("method1602:");
        method1602(2, 7);
        System.out.println("method1603: (crahes)");
        // method1603(2, 7);
        System.out.println("method1604:");
        System.out.println(method1604(10));
        System.out.println("method1605:");
        System.out.println(method1605(5,3));

    }
    public static void method1601(int x, int y) {  //ANSWER IS C
        if(x<y){
            System.out.println(x + " ");
            method1601(x + 1, y);
        }
    }
    public static void method1602(int x, int y){ //ANSWER IS B
        if(x<=y){
            method1602(x + 1, y);
            System.out.println(x + " ");
        }
    }
    public static void method1603(int x, int y){ //ANSWER IS E
        if(x<=y){
            method1603(x-1, y);
            System.out.println(x + " ");
        }
    }
    public static int method1604(int n){ //ANSWER IS B
        if (Math.sqrt(n) > n/2){
            return n;
        } else{
            return method1604(n-1);
        }
    }
    public static int method1605 (int x, int y){ //ANSWER IS D
        if(x == 0){return y;} else{return y + method1605(x-1, y);}
    }
}