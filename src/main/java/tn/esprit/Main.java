package tn.esprit;

public class Main {
    public static void main(String[] args) {

        Agence agence = new Agence("Agence1");
        Voiture v1 = new Voiture(1, "v1", 100);
        Voiture v2 = new Voiture(2, "v2", 200);
        Voiture v3 = new Voiture(3, "v3", 300);
        Voiture v4 = new Voiture(4, "v4", 400);
        Voiture v5 = new Voiture(5, "v5", 500);
        Voiture v6 = new Voiture(6, "v6", 600);
        Voiture v7 = new Voiture(7, "v7", 700);
        Voiture v8 = new Voiture(8, "v8", 800);

        Client c1 = new Client(1, "c1", "c1");
        Client c2 = new Client(2, "c2", "c2");
        Client c3 = new Client(3, "c3", "c3");

        try {
            agence.ajoutVoiture(v1);
        } catch (VoitureException e) {
            System.out.println(e.getMessage());
        }

        try {
            agence.ajoutVoiture(v2);
        } catch (VoitureException e) {
            System.out.println(e.getMessage());
        }

        try {
            agence.ajoutVoiture(v3);
        } catch (VoitureException e) {
            System.out.println(e.getMessage());
        }

        try {
            agence.ajoutVoiture(v4);
        } catch (VoitureException e) {
            System.out.println(e.getMessage());
        }

        try {
            agence.ajoutVoiture(v5);
        } catch (VoitureException e) {
            System.out.println(e.getMessage());
        }

        try {
            agence.ajoutVoiture(v6);
        } catch (VoitureException e) {
            System.out.println(e.getMessage());
        }

        try {
            agence.ajoutVoiture(v7);
        } catch (VoitureException e) {
            System.out.println(e.getMessage());
        }

        try {
            agence.ajoutVoiture(v8);
        } catch (VoitureException e) {
            System.out.println(e.getMessage());
        }

        try{
            agence.loueClientVoiture(c1, v1);
        } catch (VoitureException e) {
            System.out.println(e.getMessage());
        }

        try{
            agence.loueClientVoiture(c1, v2);
        } catch (VoitureException e) {
            System.out.println(e.getMessage());
        }

        try{
            agence.loueClientVoiture(c1, v3);
        } catch (VoitureException e) {
            System.out.println(e.getMessage());
        }

        try{
            agence.loueClientVoiture(c2, v4);
        } catch (VoitureException e) {
            System.out.println(e.getMessage());
        }

        try{
            agence.loueClientVoiture(c2, v5);
        } catch (VoitureException e) {
            System.out.println(e.getMessage());
        }

        try{
            agence.loueClientVoiture(c2, v6);
        } catch (VoitureException e) {
            System.out.println(e.getMessage());
        }

        agence.afficheLesClientsEtLeursListesVoitures();
    }
}