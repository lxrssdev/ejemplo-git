public class newwhile {
    public static void main(String[] args) {
        int i=0;
        int j=20;
        int a=0, b=1;
        while (i<j) {
            i++;
            System.out.println(i);
            a=b;
            b=b+a;
            System.out.println(a);
        }


    }
}
