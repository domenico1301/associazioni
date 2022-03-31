package it.unibas.associazioni.persistenza;

import it.unibas.associazioni.modello.Persona;
import it.unibas.associazioni.persistenza.hibernate.DAOException;
import it.unibas.associazioni.persistenza.hibernate.DAOGenericoHibernate;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class DAOPersonaHibernate extends DAOGenericoHibernate<Persona> implements IDAOPersona{

    public DAOPersonaHibernate() {
        super(Persona.class);
    }
    
    @Override
    public List<Persona> findByCognome(String cognome) throws DAOException {
        Criteria criteria =  getSession().createCriteria(Persona.class);
        criteria.add(Restrictions.eq("cognome", cognome).ignoreCase());
        criteria.addOrder(Order.asc("eta"));
        return criteria.list();
    }
    
}
