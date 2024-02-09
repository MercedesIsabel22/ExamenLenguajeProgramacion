package pruebas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Subject;

public class PruebaInfoTabla02 {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ExamenCL1");
		EntityManager em = factory.createEntityManager();
		
		Query query = em.createQuery("SELECT s FROM Subject s");
		
		List<Subject> rolList = (List<Subject>) query.getResultList();
		
		for(Subject r: rolList) {
			System.out.println(r.getIdsubject());
			System.out.println(r.getSubject());
			System.out.println(r.getCredits());
		}

	}

}
