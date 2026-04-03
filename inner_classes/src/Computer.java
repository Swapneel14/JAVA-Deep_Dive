public class Computer {
    private String brand;
    private String model;

    public OperatingSystem getOs() {
        return os;
    }

    private OperatingSystem os;

    public Computer(String model,String brand,String osname) {
        this.model = model;
        this.brand = brand;
        this.os = new OperatingSystem(osname);
    }


    static class USB{
        String type;

        public USB(String type) {
            this.type = type;
        }
    }

    class OperatingSystem{
        String osname;

        public OperatingSystem(String osname) {
            this.osname = osname;
        }

        public void display(){
            System.out.println("Model:- "+model+"OS:- "+osname);
        }
    }


}
