package event.charity.controller;

import event.charity.model.Charity;
import event.charity.service.CharityServiceImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/events")
public class CharityController {

    private final CharityServiceImp charityService;


    private CharityController(CharityServiceImp charityService) {
        this.charityService = charityService;
    }

    @PostMapping()
    public ResponseEntity<Charity> createEvent(@RequestBody Charity event) {
        return ResponseEntity.ok(charityService.createEvent(event));
    }
}
