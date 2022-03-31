package it.unibas.associazioni;

import it.unibas.associazioni.controllo.ControlloPrincipale;
import it.unibas.associazioni.modello.Modello;
import it.unibas.associazioni.persistenza.DAOAssociazioneHibernate;
import it.unibas.associazioni.persistenza.DAOPersonaHibernate;
import it.unibas.associazioni.persistenza.IDAOAssociazione;
import it.unibas.associazioni.persistenza.IDAOPersona;
import it.unibas.associazioni.vista.Frame;
import it.unibas.associazioni.vista.PannelloPrincipale;
import javax.swing.SwingUtilities;

public class Applicazione {

    private static final Applicazione instance = new Applicazione();

    private Applicazione() {
    }

    private Modello modello;
    private IDAOPersona daoPersona;
    private IDAOAssociazione daoAssociazione;
    private Frame frame;
    private PannelloPrincipale pannelloPrincipale;
    private ControlloPrincipale controlloPrincipale;

    public static Applicazione getInstance() {
        return instance;
    }

    public Modello getModello() {
        return modello;
    }

    public IDAOPersona getDaoPersona() {
        return daoPersona;
    }

    public IDAOAssociazione getDaoAssociazione() {
        return daoAssociazione;
    }

    public Frame getFrame() {
        return frame;
    }

    public PannelloPrincipale getPannelloPrincipale() {
        return pannelloPrincipale;
    }

    public ControlloPrincipale getControlloPrincipale() {
        return controlloPrincipale;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                instance.inizializza();
            }
        });
    }

    private void inizializza() {
        this.modello = new Modello();
        this.daoPersona = new DAOPersonaHibernate();
        this.daoAssociazione = new DAOAssociazioneHibernate();
        this.controlloPrincipale = new ControlloPrincipale();
        this.frame = new Frame();
        this.pannelloPrincipale = new PannelloPrincipale();
        this.pannelloPrincipale.inizializza();
        this.frame.inizializza();
    }
}
