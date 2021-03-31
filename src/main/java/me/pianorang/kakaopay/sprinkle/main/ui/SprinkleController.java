package me.pianorang.kakaopay.sprinkle.main.ui;

import me.pianorang.kakaopay.sprinkle.main.application.SprinkleService;
import me.pianorang.kakaopay.sprinkle.util.TokenGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequestMapping("/api")
@RestController
public class SprinkleController {

    SprinkleService sprinkleService;

    @Autowired
    public SprinkleController(SprinkleService sprinkleService) {
        this.sprinkleService = sprinkleService;
    }

    @GetMapping("/sprinkle")
    public Mono<SprinkleResponse> sprinkle(SprinkleRequest request){

        String token = sprinkleService.sprinkle(request.getAmount(), request.getCount());

        SprinkleResponse response = new SprinkleResponse(token);
        return Mono.just(response);
    }
}
