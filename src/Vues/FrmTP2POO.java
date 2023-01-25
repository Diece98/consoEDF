package Vues;

import Entities.Agent;
import Entities.Client;
import Entities.Releve;
import Tools.ModelJTable;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class FrmTP2POO extends JFrame {
    private JPanel pnlRoot;
    private JLabel lblTitre;
    private JTable tblAgents;
    private JTable tblClients;
    private JTable tblReleves;
    private JLabel lblReleve;
    private JLabel lblClients;
    private JLabel lblAgents;
    private JLabel lblConsommation;
    private JTextField txtConsommation;
    private JTextField txtNouveauReleve;
    private JLabel lblNouveauReleve;
    private JLabel lblDate;
    private JPanel pnlDate;
    private JButton btnInserer;

    private JDateChooser dteReleve;


    ArrayList<Agent> mesAgents;
    ModelJTable mdlAgents;
    ModelJTable mdlClients;
    ModelJTable mdlReleves;

    public FrmTP2POO() {
        this.setTitle("TP2 - POO");
        this.setContentPane(pnlRoot);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);

        // Gestion de la date dans le JPANEL
        dteReleve = new JDateChooser();
        dteReleve.setDateFormatString("yyyy-MM-dd");
        pnlDate.add(dteReleve);

        mesAgents = new ArrayList<>();

        //Jeu d'essais
        RemplirDatas();

        mdlAgents = new ModelJTable();

        mdlAgents.LoadDataAgent(mesAgents);

        tblAgents.setModel(mdlAgents);


        tblAgents.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);


            }
        });

        tblClients.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);


            }
        });

        btnInserer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
    }

    public void RemplirDatas() {
        Agent agt1 = new Agent(1, "Enzo");
        Agent agt2 = new Agent(2, "Paul");
        Agent agt3 = new Agent(3, "Radahn");

        Client clt1 = new Client(1, "Zizou");
        Client clt2 = new Client(2, "Zani");
        Client clt3 = new Client(3, "Mohg");
        Client clt4 = new Client(4, "Lucius");
        Client clt5 = new Client(5, "Tifou");
        Client clt6 = new Client(6, "Lambert");

        Releve rel1 = new Releve("24/01/2022", 456);
        Releve rel2 = new Releve("12/03/2022", 902);

        Releve rel3 = new Releve("25/05/2022", 123);

        Releve rel4 = new Releve("09/07/2022", 789);
        Releve rel5 = new Releve("17/09/2022", 1056);

        Releve rel6 = new Releve("20/11/2022", 345);
        Releve rel7 = new Releve("25/01/2023", 712);

        Releve rel8 = new Releve("29/03/2023", 500);
        Releve rel9 = new Releve("24/05/2023", 700);
        Releve rel10 = new Releve("16/07/2023", 1000);

        //Ajouter des relevés aux clients voir la méthde dans Client.java
        clt1.AjouterUnReleve(rel1);
        clt1.AjouterUnReleve(rel2);

        clt2.AjouterUnReleve(rel3);

        clt3.AjouterUnReleve(rel4);
        clt3.AjouterUnReleve(rel5);

        clt4.AjouterUnReleve(rel6);
        clt4.AjouterUnReleve(rel7);

        clt5.AjouterUnReleve(rel8);
        clt5.AjouterUnReleve(rel9);
        clt5.AjouterUnReleve(rel10);

        //Ajouter des clients aux Agents
        agt1.AjouterUnCLient(clt1);
        agt1.AjouterUnCLient(clt2);
        agt1.AjouterUnCLient(clt3);

        agt2.AjouterUnCLient(clt4);

        agt3.AjouterUnCLient(clt5);
        agt3.AjouterUnCLient(clt6);

        mesAgents.add(agt1);
        mesAgents.add(agt2);
        mesAgents.add(agt3);
    }
}