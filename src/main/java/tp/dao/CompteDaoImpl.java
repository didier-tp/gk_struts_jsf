package tp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tp.data.Client;
import tp.data.Compte;

@Repository //ou @Component
@Scope("singleton")
@Transactional //de spring
public class CompteDaoImpl implements ICompteDao {
	
	@PersistenceContext()//pour initialiser entityManager avec
	//META-INF/persistence.xml et/ou springContext.xml
	private EntityManager entityManager;

	@Override
	public Compte findCompte(Long num) {
		return entityManager.find(Compte.class, num);
	}

	@Override
	public List<Compte> rechercherComptesDuClient(Long numClient) {
		return entityManager.createQuery(
				"SELECT c FROM Client cli JOIN cli.comptes c WHERE cli.numero = :numClient" ,
				Compte.class)
				.setParameter("numClient", numClient)
				.getResultList();
	}

	@Override
	public void updateCompte(Compte c) {
		entityManager.merge(c);
	}

	@Override
	public Compte insertCompte(Compte c) {
		//avant .persist , c.numero est � null
		entityManager.persist(c);//avec auto_incr
		//apr�s .persist , c.numero n'est plus null
		//si @GeneratedValue(strategy=IDENTITY) � cot� de @Id dans Compte.class
		return c;
	}

	@Override
	public void removeCompte(Long num) {
		Compte c = entityManager.find(Compte.class, num);
		entityManager.remove(c);
	}

	@Override
	public Client insertClient(Client c) {
		//avant .persist , c.numero est � null
		entityManager.persist(c);//avec auto_incr
		//apr�s .persist , c.numero n'est plus null
		//si @GeneratedValue(strategy=IDENTITY) � cot� de @Id dans Client.class
		return c;
	}

}
