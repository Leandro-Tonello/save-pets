package ar.edu.unlam.tallerweb1.repositorios;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unlam.tallerweb1.modelo.Refugio;

@Repository("repositorioRefugio")
public class RepositorioRefugioImpl implements RepositorioRefugio {

	private SessionFactory sessionFactory;

    @Autowired
	public RepositorioRefugioImpl(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
    
    @Override
	public void guardar(Refugio refugio) {
		sessionFactory.getCurrentSession().save(refugio);
	}

	@Override
	public List<Refugio> buscar(String nombre) {
		return sessionFactory.getCurrentSession().createCriteria(Refugio.class)
				.add(Restrictions.eq("nombre", nombre))
				.list();
	}

    @Override
    public List<Refugio> buscarTodos() {
        return sessionFactory.getCurrentSession()
                .createCriteria(Refugio.class)
                .list();
    }
}
