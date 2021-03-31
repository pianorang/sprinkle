package me.pianorang.kakaopay.sprinkle.main.ui;

import lombok.Value;

@Value
public class SprinkleRequest {
    private Long amount;
    private int count;
}
