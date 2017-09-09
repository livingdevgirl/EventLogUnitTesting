public class Main {
    public static void main(String[] args) {

                Event event = new Event();
        event.setName("Hi");
        event.setAction("PhoneCall");
        event.addEvent();

        System.out.println(event.getAction());
        System.out.println(event);
        System.out.println();
    }
}
