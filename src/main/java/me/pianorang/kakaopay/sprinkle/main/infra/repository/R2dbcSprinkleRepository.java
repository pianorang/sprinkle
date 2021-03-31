package me.pianorang.kakaopay.sprinkle.main.infra.repository;

import io.r2dbc.spi.Connection;
import io.r2dbc.spi.ConnectionFactory;
import me.pianorang.kakaopay.sprinkle.main.domain.Sprinkle;
import me.pianorang.kakaopay.sprinkle.main.domain.SprinkleRepository;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Map;

public class R2dbcSprinkleRepository implements SprinkleRepository {

    private final ConnectionFactory connectionFactory;

    public R2dbcSprinkleRepository(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    @Override
    public <S extends Sprinkle> S save(S entity) {
        return null;


    }
}
