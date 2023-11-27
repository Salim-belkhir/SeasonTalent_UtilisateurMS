package fr.polytech.Utilisateur;


import fr.polytech.Utilisateur.models.kafka.UserKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "topicGatewayToUtilisateur", groupId = "groupId")
    void listen(UserKafka user) {
        System.out.println("Received Messasge in group - group_id: " + user);
    }
}
