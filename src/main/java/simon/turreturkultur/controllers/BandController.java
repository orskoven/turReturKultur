package simon.turreturkultur.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import simon.turreturkultur.models.Band;
import simon.turreturkultur.services.BandService;

@RestController
public class BandController {

    @Autowired

    private BandService bandService;

    public BandController(BandService bandService) {
        this.bandService = bandService;
    }

    @PostMapping("/createBand")
    public ResponseEntity<String> createBand(@RequestBody Band band) {
        String msg = "";
        if (bandService.save(band) != null) {
            msg = "Dit band: " + band.getName() + " blev succesfuldt oprettet!";
        } else {
        msg = "Dit band: " + band.getName() + " blev ikke oprettet, prøv igen!";
        }
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
