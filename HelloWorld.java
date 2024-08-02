public class HelloWorld {
    public static Operations op = new Operations();
    public static void main(String[] args) {
        int sum_ = op.sum(45, 34);
        System.out.println("Hello world" + sum_);
    }
}

class Operations {
    public int sum(int a, int b) {
        return a + b;
    }
}