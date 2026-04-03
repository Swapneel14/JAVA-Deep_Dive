public class Test {
    public static void main(String[] args) {
        System.out.println(Day.SATURDAY);
        Day monday = Day.MONDAY;
        Day mondaynew = Day.MONDAY("monday");
        System.out.println(mondaynew.ordinal());
        int ordinal = monday.ordinal();
        System.out.println(ordinal);
        System.out.println(monday.name().toLowerCase());

        for (Day value : Day.values()) {
            System.out.println(value);
            value.display();
        }

        switch (monday){
            case FRIDAY -> {
                System.out.println("Today is Shukravar");
            }
        }

        String res = switch (monday){
            case MONDAY -> "M";
            case TUESDAY -> "T";
            case THURSDAY -> "TU";
            case FRIDAY -> null;
            case SATURDAY -> "SW";
        };


    }
}
