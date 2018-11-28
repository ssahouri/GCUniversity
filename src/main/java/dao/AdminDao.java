package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.GCUniversity.entity.Admin;


@Repository
@Transactional
public class AdminDao {
	
	@PersistenceContext
	private EntityManager em;

	public List<Admin> findAll() {
		return em.createQuery("FROM Admin", Admin.class).getResultList();
	}
	
}
