package springmvc_ecommerce.configuration.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import springmvc_ecommerce.configuration.dto.Product;




@Component
public class Productdao {

EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();

public String save(Product product) {
	et.begin();
	em.persist(product);
	et.commit();
	
	return "product data inserted";
}

public  List<Product> fetchAll() {
	Query q=em.createQuery("select data from Product data");
	 List<Product> list=q.getResultList();
	  if(list.isEmpty()) {
		  return null;
	  }
	  return list;
}

public void updatedata(Product product) {
	 et.begin();
	     em.merge(product);
	     et.commit();
}

}
