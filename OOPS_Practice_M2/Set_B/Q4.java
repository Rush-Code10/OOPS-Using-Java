public class Q4
{
    public static void main(String [] args)
    {
        StringBuffer sb = new StringBuffer("Programming Language");

        sb.append(" in Java");
        System.out.println(sb);
        sb.replace(12,20, "Concepts");
        System.out.println("Final String: " + sb);
        System.out.println("Length: " + sb.length());
    }
}