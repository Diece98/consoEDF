package Tools;

import Entities.Agent;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelJTable extends AbstractTableModel
{
    private String[] entete;
    private Object[][] lignes;

    @Override
    public int getRowCount() {
        return lignes.length;
    }

    @Override
    public int getColumnCount() {
        return entete.length;
    }

    @Override
    public String getColumnName(int column) {
        return entete[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return lignes[rowIndex][columnIndex];
    }

    public void LoadDataAgent(ArrayList<Agent> desAgents)
    {
        entete = new String[]{"Numero","Nom"};
        lignes = new  Object[desAgents.size()][2];
        int i=0;
        for (Agent agt : desAgents)
        {
            lignes[i][0] = agt.getIdAgent();
            lignes[i][1] = agt.getNomAgent();
            i++;
        }
        fireTableChanged(null);
    }
}

