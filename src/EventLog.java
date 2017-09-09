import java.util.ArrayList;
import java.util.List;

public class EventLog extends Event{

    private List<Event> eventList = new ArrayList<>();


    public boolean addEvent(Event event) throws IllegalArgumentException{

            if(event != null && !Event.getName().isEmpty() && !Event.getAction().isEmpty() && !Event.getAction().isEmpty()){
                return true;
            } else{
                return false;
            }
        }

    public List<Event> getEventList() {
        return eventList;
    }

    public int getNumEvents(){
        return eventList.size();
    }
}
