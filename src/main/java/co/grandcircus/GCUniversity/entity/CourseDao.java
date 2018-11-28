package co.grandcircus.GCUniversity.entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;



@Repository
@Transactional
public class CourseDao {

	@PersistenceContext
	private EntityManager em;
	
	public List<Course> findAll() {
		// The SELECT clause is optional in HQL. If omitted, it's basically SELECT *.
		// When creating a a query specify the type of the results: Food.class
		return em.createQuery("FROM Course", Course.class).getResultList();
	}
	
}
