package it.unibas.associazioni.modello;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Iscrizione {
    
    private Long id;
    private Persona persona;
    private Associazione associazione;
    private Calendar data;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @ManyToOne
    public Associazione getAssociazione() {
        return associazione;
    }

    public void setAssociazione(Associazione associazione) {
        this.associazione = associazione;
    }

    @Temporal(value = TemporalType.DATE)
    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
    
    
    
}
