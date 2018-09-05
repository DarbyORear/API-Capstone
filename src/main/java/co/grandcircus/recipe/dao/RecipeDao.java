package co.grandcircus.recipe.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.recipe.entities.Recipe;

@Repository
@Transactional
public class RecipeDao {
	
	@PersistenceContext
	EntityManager em;

//	public List<Hotel> findAll() {
//		// TODO Auto-generated method stub
//		//you speak like java (not like sql) when you talk to hibernate or jpa (which is why "Product" is capitalized
//		return em.createQuery("FROM Hotel", Hotel.class).getResultList();
//	}

//	public Hotel findById(Long id){
//		return em.find(Hotel.class, id);
//
//	}
	
	public List<Recipe> findAll() {
		// HQL queries use the Java names for classes and properties
		return em.createQuery("FROM Recipe", Recipe.class).getResultList();
	}
}
	//this is the method that does the actual search on the database by name
//	public List<Hotel> findByName(String name) {
//		
//		return em.createQuery("from Hotel where name like :n", Hotel.class)
//				.setParameter("n", "%" + name + "%")
//				.getResultList();
//	}
	
//	//this is the method that does the actual search on the database by name
//	public List<Recipe> findByCity(String city) {
//		
//		return em.createQuery("FROM Hotel where city = :city", Hotel.class)
//				.setParameter("city", city)
//				.getResultList();
//	}
//	
//	public List<Hotel> findByPrice(String pricePerNight) {
//		return em.createQuery("FROM Hotel where price = :pricePerNight", Hotel.class)
//				.setParameter("price", pricePerNight)
//				.getResultList();
//	}
//	
//	
//	public void create(Hotel hotel) {
//		em.persist(hotel);
//	}
//	
//	public void update(Hotel hotel) {
//		em.merge(hotel);
//	}

