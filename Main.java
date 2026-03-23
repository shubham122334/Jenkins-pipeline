public class Main {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int k=0;k<(n-1-i);k++)
                System.out.print(" ");
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Printng start design");
        System.out.println("we will deploy it on jenkins using pipeline");

    }
}
