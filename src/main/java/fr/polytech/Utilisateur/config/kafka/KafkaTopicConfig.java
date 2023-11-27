package fr.polytech.Utilisateur.config.kafka;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic topicGatewayToUtilisateur() {
        return new NewTopic("topicGatewayToUtilisateur", 1, (short) 1);
    }

}
