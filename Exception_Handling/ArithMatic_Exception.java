public class ArithMatic_Exception {
    public static void main(String[] args) {
        int a[]= {50,40,70,80};
        int b[]= {50,2,0,4};

        int n = a.length;

        for(int i=0;i<n;i++){
            System.out.println(divide(a[i],b[i]));
        }
        System.out.println("Good Job:)");
    }

    public static int divide(int a,int b){
       try{
           return a/b;
       }
       catch (ArithmeticException e){
           System.out.println(e);
           return -1;
       }
    }
}
