public class Interface {
    
}

interface a {
    public void PrintUserInfo();
}

interface b {
    public boolean UserSubScription();
}

class c implements a, b {
    public void PrintUserInfo() {
        System.out.println("Test");
    }
}