package me.pianorang.kakaopay.sprinkle.main.domain;

import org.springframework.data.repository.Repository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface SprinkleRepository extends Repository<Sprinkle, Long> {
    <S extends Sprinkle> S save(S entity);
}
