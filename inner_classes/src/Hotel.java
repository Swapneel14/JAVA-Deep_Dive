public class Hotel {

    private int rooms;
    private int reserved;

    public Hotel(String name, int reserved, int rooms) {
        this.reserved = reserved;
        this.rooms = rooms;
    }

    public void reservation(String name,int roomsneeded){
        class Validator{
            public boolean validate(){
                if(name==null||name.isBlank()){
                    System.out.println("Name cannot be empty");
                    return false;
                }
                if(roomsneeded<0){
                    System.out.println("Number of Rooms must be positive");
                    return false;
                }
                if(reserved+roomsneeded>rooms){
                    System.out.println("Not enough rooms availabe");
                    return false;
                }

                return true;
            }
        }

        Validator v1 = new Validator();
        if(v1.validate()){
            System.out.println("Room Booked");
            reserved+=roomsneeded;
        }
        else{
            System.out.println("Room Not Booked");
        }
    }
}
