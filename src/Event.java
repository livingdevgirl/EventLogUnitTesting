public class Event {
    private static String name;
    private static String action;

    boolean actionValue;


    Event(){


    }


    public static String getName() {
        return name;
    }

    public static String getAction() {
        return action;
    }



    public void setName(String name) {
        this.name = name;
    }


    public static void setAction(String action) {
        Event.action = action;
    }

    public void addEvent() {

    }

 public static boolean actionValue() {

        if (Event.action.equals("Face2Face") ||
                Event.action.equals("PhoneCall") ||
                Event.action.equals("TextMessaging") ||
                Event.action.equals("Unknown")){
            return true;
        }
        return false;

    }



}
