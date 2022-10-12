import java.util.*;
class Mai{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a%2==0  && b%2==0) {
        System.out.println(a+""+"is even num,ber");
        System.out.println(b+"is even");
        }else{
            System.out.println(a+""+"odd" );
            System.out.println(b+""+"odd");
        }
        
    }
}
