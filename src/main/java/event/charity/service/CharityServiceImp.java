package event.charity.service;

import event.charity.model.Charity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CharityServiceImp implements CharityService {

    private List<Charity> eventList = new ArrayList<>();

    @Override
    public Charity createEvent(Charity event) {
        eventList.add(event);
        System.out.println("A new event was created");
        return event;
    }
}
