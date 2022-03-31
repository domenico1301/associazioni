package it.unibas.associazioni.controllo;

import it.unibas.associazioni.Applicazione;
import it.unibas.associazioni.Costanti;
import it.unibas.associazioni.modello.Persona;
import it.unibas.associazioni.persistenza.hibernate.DAOException;
import it.unibas.associazioni.persistenza.hibernate.DAOUtilHibernate;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.KeyStroke;

public class ControlloPrincipale {

    private Action azioneRicerca = new AzioneRicerca();

    public Action getAzioneRicerca() {
        return azioneRicerca;
    }

    private class AzioneRicerca extends AbstractAction {

        public AzioneRicerca() {
            this.putValue(NAME, "Cerca");
            this.putValue(SHORT_DESCRIPTION, "Cerca le persona per cognome");
            this.putValue(MNEMONIC_KEY, KeyEvent.VK_C);
            this.putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke("ctrl C"));
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String cognome = Applicazione.getInstance().getPannelloPrincipale().getCampoCognome();
            if (cognome.isBlank()) {
                Applicazione.getInstance().getFrame().mostraErrori("Il campo cognome non può essere vuoto");
                return;
            }
            try {
                DAOUtilHibernate.beginTransaction();
                List<Persona> persone = Applicazione.getInstance().getDaoPersona().findByCognome(cognome);
                Applicazione.getInstance().getModello().putBean(Costanti.LISTA_PERSONE, persone);
                Applicazione.getInstance().getPannelloPrincipale().aggiornaTabella();
                DAOUtilHibernate.commit();
            } catch (DAOException ex) {
                DAOUtilHibernate.rollback();
                Applicazione.getInstance().getFrame().mostraErrori("Problemi con la ricerca della persona nel db");
            }
        }

    }
                                           }
