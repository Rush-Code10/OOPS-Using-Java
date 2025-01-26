class q6 {

    public void myMethod() {
        System.out.println("This is a public myMethod.");
    }

    private void myMethod(int x) {
        System.out.println("This is a private myMethod with parameter: " + x);
    }

    protected void myMethod(String s) {
        System.out.println("This is a protected myMethod with parameter: " + s);
    }

    void myMethod(double d) {
        System.out.println("This is a default (package-private) myMethod with parameter: " + d);
    }

    public static void main(String[] args) {
        q6 obj = new q6();
        
        obj.myMethod();          
        obj.myMethod(10);       
        obj.myMethod("Hello");   
        obj.myMethod(3.14);
    }
}
