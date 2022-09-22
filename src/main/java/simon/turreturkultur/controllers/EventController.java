package simon.turreturkultur.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import simon.turreturkultur.models.Band;
import simon.turreturkultur.models.Event;
import simon.turreturkultur.services.BandService;
import simon.turreturkultur.services.EventService;

import java.util.*;

@RestController
public class EventController {

    @Autowired

    private EventService eventService;
    @Autowired

    private BandService bandService;

    public EventController(EventService eventService, BandService bandService) {
        this.eventService = eventService;
        this.bandService = bandService;
    }

    @PostMapping("/createEvent")
    public ResponseEntity<String> createEvent(@RequestBody Event event,
                                              @RequestParam Long bandID) {
        String msg = "";
        event.setBand(bandService.findById(bandID).orElse(null));
        if (eventService.save(event) != null) {
            msg = "Dit event: " + event.getName() + " blev succesfuldt oprettet!";
        } else {
            msg = "Dit event: " + event.getName() + " blev ikke oprettet, prøv igen!";
        }
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

   @GetMapping("/getAllEvents")
   public ResponseEntity<Set<Event>> getAllEvents(){
       Set<Event> set = new HashSet<Event>(eventService.findAll());
        return new ResponseEntity<>(set,HttpStatus.OK);
   }


}
