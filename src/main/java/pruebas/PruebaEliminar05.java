package pruebas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;


public class PruebaEliminar05 {

	public static void main(String[] args) {
		
		SubjectDao dao = new SubjectDaoImpl();
		
		dao.delete(2);
		
		List<Subject> subjectList = dao.findAll(); 
		for(Subject r: subjectList) {
			System.out.println(r.getIdsubject());
			System.out.println(r.getSubject());
			System.out.println(r.getCredits());
		}

	}

}
