

public class Quiz1Review {
    public static void main(String[] args) {
        getInfo(10);
    }
    public static void getInfo(int x) {
        System.out.println(x/2);
        if (x%2 == 0) {
            getInfo(x-1);
        }
    }
}

// class A {
//     private int a;
//     String s;
//     public A(int a1, String str) {
//         a = a1;
//         s = str;
//     }

//     public A(int a1) {
//         a = a1;
//     }
//     public int getInfo() {
//         return a;
//     }
// }

// class B extends A {
//     public B(int b1) {
//         super(b1);
//     }
//     public int getInfo() {
//         return super.getInfo();
//     }
// }

// class A {
//     public String getInfo() {
//         return "ABC";
//     }
// }

// class B extends A {
//     public String B() {
//         super.getInfo();
//         return "XYZ";
//     }
// }