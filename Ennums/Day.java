public enum Day {
    //All are instances of Day
    MONDAY("monday"),
    TUESDAY("tuesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday");
    //super(name,ordinal)
    //extends Enum class internally

    private String lower;

    /**
     * @param lower
     */
    Day(String lower){
        System.out.println("Custom Constructor 1 called");
        this.lower=lower;
    }

    //Custom Constructor

    Day() {

    }

    public static Day MONDAY(String monday) {

        return THURSDAY;
    }

    public void display(){
        System.out.println("Today is "+this.name());
    }
}
