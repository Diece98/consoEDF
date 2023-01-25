package Entities;

public class Releve {
    //Membre privee
    private String dateReleve;
    private int Releve;
    private int valeurReleve;


    //Contructeur
    public Releve(String uneDate, int Releve) {
        dateReleve = uneDate;
        valeurReleve = Releve;
    }

    //GETTER + SETTER
    public String getDateReleve()
    {
        return dateReleve;
    }

    public int getValeurReleve()
    {
        return valeurReleve;
    }

}