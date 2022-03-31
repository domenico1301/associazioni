package it.unibas.associazioni.vista;

import it.unibas.associazioni.modello.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModelloTabellaPersone extends AbstractTableModel {

    private List<Persona> persone;

    public ModelloTabellaPersone(List<Persona> persone) {
        this.persone = persone;
    }

    public void setPersone(List<Persona> persone) {
        this.persone = persone;
    }

    @Override
    public int getRowCount() {
        if (persone == null) {
            return 0;
        }
        return persone.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona persona = persone.get(rowIndex);
        if (columnIndex == 0) {
            return persona.getCodiceFiscale();
        }
        if (columnIndex == 1) {
            return persona.getNome();
        }
        if (columnIndex == 2) {
            return persona.getCognome();
        }
        if (columnIndex == 3) {
            return persona.getRegione();
        }
        if (columnIndex == 4) {
            return persona.getSesso();
        }
        if (columnIndex == 5) {
            return persona.getEta();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Codice Fiscale";
        }
        if (columnIndex == 1) {
            return "Nome";
        }
        if (columnIndex == 2) {
            return "Cognome";
        }
        if (columnIndex == 3) {
            return "Regione";
        }
        if (columnIndex == 4) {
            return "Sesso";
        }
        if (columnIndex == 5) {
            return "Eta";
        }
        return "";
    }

    public void aggiorna() {
        this.fireTableDataChanged();
    }

}
