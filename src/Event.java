public class Event {
    private static String name;
    private static String action;

    boolean b;


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

//
//        action.equals("Face2Face") ||
//                action.equals("PhoneCall") ||
//                action.equals("TextMessaging") ||
//                action.equals("Unknown");





}
