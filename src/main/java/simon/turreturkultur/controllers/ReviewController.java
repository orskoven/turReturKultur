package simon.turreturkultur.controllers;


import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import simon.turreturkultur.models.Event;
import simon.turreturkultur.models.Review;
import simon.turreturkultur.models.User;
import simon.turreturkultur.services.ReviewService;

import java.util.HashSet;
import java.util.Set;

@RestController
public class ReviewController {

    @Autowired

    private ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping("/createReview")
    public ResponseEntity<String> createReview(@RequestBody Review review){
        String msg = "";
        if (reviewService.save(review) != null) {
            msg = "Dit review af: " + review.getEvent().getName() + " blev succesfuldt oprettet!";
        } else {
            msg = "Dit review: " + review.getEvent().getName() + " blev ikke oprettet, prøv igen!";
        }
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

    @GetMapping("/getReview")
    public ResponseEntity<Set<Review>> getReview(@RequestParam long eventId){
        Set<Review> set = new HashSet<Review>(reviewService.findAll());
        return new ResponseEntity<>(set,HttpStatus.OK);
    }
}
