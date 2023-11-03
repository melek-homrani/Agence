package tn.esprit;

import java.util.*;

public class Agence {
    private String nom;
    private ListVoitures vs;
    private Map<Client, ListVoitures> ClientVoitureLoue;

    public Agence(String nom) {
        this.nom = nom;
        this.vs = new ListVoitures();
        this.ClientVoitureLoue = new HashMap<>();
    }

    public void ajoutVoiture(Voiture v) throws VoitureException {
        vs.ajoutVoiture(v);
    }

    public void suppVoiture(Voiture v) throws VoitureException {
        vs.supprimeVoiture(v);
        for (ListVoitures listVoitures : ClientVoitureLoue.values()) {
            listVoitures.getVoitures().remove(v);
        }
    }

    public void loueClientVoiture(Client cl, Voiture v) throws VoitureException {
        if (!ClientVoitureLoue.containsKey(cl)) {
            ClientVoitureLoue.put(cl, new ListVoitures());
        }
        ClientVoitureLoue.get(cl).ajoutVoiture(v);
    }

    public void retourClientVoiture(Client cl, Voiture v) throws VoitureException {
        if (ClientVoitureLoue.containsKey(cl)) {
            ClientVoitureLoue.get(cl).supprimeVoiture(v);
        }
    }

    public List<Voiture> selectVoitureSelonCritere(Critere c) {
        List<Voiture> result = new ArrayList<>();
        for (Voiture voiture : vs.getVoitures()) {
            if (c.estSatisfaitPar(voiture)) {
                result.add(voiture);
            }
        }
        return result;
    }

    public Set<Client> ensembleClientsLoueurs() {
        return ClientVoitureLoue.keySet();
    }

    public Collection<ListVoitures> collectionVoituresLouees() {
        return ClientVoitureLoue.values();
    }

    public void afficheLesClientsEtLeursListesVoitures() {
        for (Map.Entry<Client, ListVoitures> entry : ClientVoitureLoue.entrySet()) {
            System.out.println("Client: " + entry.getKey().getNom() + " " + entry.getKey().getPrenom());
            System.out.println("Voitures louées: ");
            for (Voiture voiture : entry.getValue().getVoitures()) {
                System.out.println(voiture.getImmatriculation() + " - " + voiture.getMarque());
            }
        }
    }

    public Map<Client, ListVoitures> triCodeCroissant() {
        return new TreeMap<>(ClientVoitureLoue);
    }

    public Map<Client, ListVoitures> triNomCroissant() {
        Map<Client, ListVoitures> sortedMap = new TreeMap<>(
                (client1, client2) -> client1.getNom().compareTo(client2.getNom())
        );
        sortedMap.putAll(ClientVoitureLoue);
        return sortedMap;
    }
}
