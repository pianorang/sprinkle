package me.pianorang.kakaopay.sprinkle.config;

import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;

@Configuration
public class ApplicationConfig extends AbstractR2dbcConfiguration {
    @Override
    @Bean
    public ConnectionFactory connectionFactory() {
        String url = "r2dbc:h2:mem:///testdb";
        ConnectionFactory connectionFactory = ConnectionFactories.get(url);
        return connectionFactory;
    }
}
