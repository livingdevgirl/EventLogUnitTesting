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

        if (action.equals("Face2Face") ||
                action.equals("PhoneCall") ||
                action.equals("TextMessaging") ||
                action.equals("Unknown")){

            return action;
    }else{
    return "err";
    }};

    public void setName(String name) {
        this.name = name;
    }

    public void setAction(String action) {
        if (this.action.equals("Face2Face") ||
                this.action.equals("PhoneCall") ||
                this.action.equals("TextMessaging") ||
                this.action.equals("Unknown")){
            this.action = action;
        }
       else{
            this.action.isEmpty();
        }
    }


    public void addEvent() {
    }


}
