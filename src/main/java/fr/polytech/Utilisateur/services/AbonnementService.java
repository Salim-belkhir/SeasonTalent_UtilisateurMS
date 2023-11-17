package fr.polytech.Utilisateur.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.polytech.Utilisateur.models.Abonnement;
import fr.polytech.Utilisateur.repositories.AbonnementRepository;



@Service
public class AbonnementService {
    @Autowired
    private AbonnementRepository abonnementRepository;

    public List<Abonnement> getAllAbonnements() {
        return abonnementRepository.findAll();
    }

    public Abonnement getAbonnementById(Long id) {
        return abonnementRepository.findById(id).orElse(null);
    }

    public boolean deleteAbonnementById(Long id) {
        Abonnement abonnement = getAbonnementById(id);
        if(abonnement != null) {
            abonnementRepository.delete(abonnement);
            return true;
        }
        return false;
    }

    public Abonnement createAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }


    public Abonnement updateAbonnement(Long id, Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    public Abonnement updateAbonnement(Long id, Map<String, Object> fields) {
        // Abonnement abonnement = getAbonnementById(id);
        // if(abonnement == null) {
        //     return null;
        // }
        // for(String field : fields.keySet()) {
        //     switch(field) {
        //         case "typeAbonnement":
        //             abonnement((TypeAbonnement) fields.get(field));
        //             break;
        //         case "duree":
        //             abonnement.setDuree((String) fields.get(field));
        //             break;
        //         default:
        //             break;
        //     }
        // }

        // return abonnementRepository.save();
        return null;
    }
    
}
