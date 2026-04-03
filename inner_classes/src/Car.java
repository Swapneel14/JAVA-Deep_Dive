public class Car {
    private String model;
    private boolean isEngineon;
    public Car(String model){
        this.model=model;
        this.isEngineon=false;
    }
    //Member inner Class
    class Engine{
        //Behaving as Member
        void start(){
            if(!isEngineon){
                isEngineon=true;
                System.out.println("Car started "+model);
            }
            else{
                System.out.println("Car is already running");
            }
        }

        void stop(){
            if(isEngineon){
                isEngineon=false;
                System.out.println("Car stopped "+model);
            }
            else{
                System.out.println("Car is already stopped");
            }
        }
    }
}
