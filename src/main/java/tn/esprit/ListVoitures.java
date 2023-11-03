package tn.esprit;

import java.util.ArrayList;
import java.util.List;

public class ListVoitures {
    private List<Voiture> voitures;

    public ListVoitures(List<Voiture> voitures) {
        this.voitures = new ArrayList<>(voitures);
    }

    public ListVoitures() {
        this.voitures = new ArrayList<>();
    }

    public List<Voiture> getVoitures() {
        return voitures;
    }

    public void setVoitures(List<Voiture> voitures) {
        this.voitures = new ArrayList<>(voitures);
    }

    public void ajoutVoiture(Voiture v) throws VoitureException {
        if (voitures.contains(v)) {
            throw new VoitureException("Voiture déjà présente dans la liste.");
        }
        voitures.add(v);
    }

    public void supprimeVoiture(Voiture v) throws VoitureException {
        if (!voitures.contains(v)) {
            throw new VoitureException("Voiture non trouvée dans la liste.");
        }
        voitures.remove(v);
    }

    public int size() {
        return voitures.size();
    }

    public void affiche() {
        for (Voiture voiture : voitures) {
            System.out.println(voiture.toString());
        }
    }
}
