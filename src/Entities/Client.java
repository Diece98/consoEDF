package Entities;

import java.util.ArrayList;

public class Client
{
    private int codeClient;
    private String nomClient;
    private ArrayList<Releve> lesReleves;

    public Client(int codeClient, String nomClient) {
        this.codeClient = codeClient;
        this.nomClient = nomClient;
        lesReleves = new ArrayList<>();
    }

    public int getCodeClient() {
        return codeClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public ArrayList<Releve> getLesReleves() {
        return lesReleves;
    }
    //methode 2 plus propre aue methode 1 faire une methode directement dans la classe
    public void AjouterUnReleve(Releve unReleve)
    {
        lesReleves.add(unReleve);

    }
}
