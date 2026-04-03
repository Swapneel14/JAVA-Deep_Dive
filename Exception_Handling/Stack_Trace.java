public class Stack_Trace {
    public static void main(String[] args) {
        try{
            level1();
        }catch (Exception e){
           StackTraceElement[]stackTrace= e.getStackTrace();
            System.out.println(stackTrace.length);
           for(int i=0;i<stackTrace.length;i++){
               System.out.println(stackTrace[i]);
           }
            System.out.println("Sorry :(");
        }
    }

    public static void level3(){
        int[]arr = new int[5];
        arr[5]=9;
    }
    public static void level2(){
        level3();
    }
    public static void level1(){
        level2();
    }
}
