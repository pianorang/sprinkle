package me.pianorang.kakaopay.sprinkle.main.application;

import me.pianorang.kakaopay.sprinkle.util.TokenGenerator;
import org.springframework.stereotype.Service;

@Service
public class SprinkleService {


    public String sprinkle(Long amount, int count) {



        String token = TokenGenerator.generate();
        return token;
    }
}
