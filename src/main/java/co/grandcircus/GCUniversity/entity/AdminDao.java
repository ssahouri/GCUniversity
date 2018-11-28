package co.grandcircus.GCUniversity.entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;



@Repository
@Transactional
public class AdminDao {
	
	@PersistenceContext
	private EntityManager em;

	public List<Admin> findAll() {
		return em.createQuery("FROM Admin", Admin.class).getResultList();
	}
	
	
	public User findByUsername(String username) {
		try {
			return em.createQuery("FROM User WHERE username = :username", User.class).setParameter("username", username)
					.getSingleResult();
		} catch (NoResultException ex) {
			// No user with that username found.
			return null;
		}
	}
	

}
