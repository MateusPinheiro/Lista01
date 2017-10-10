package br.teste;

import java.util.List;

import br.DAO.DAO;
import br.DAO.JpaDao;
import br.model.Dependente;

public class TesteClass {
	
	public static void main(String[] args) {
		
		DAO jpa = new JpaDao();
		try {
			jpa.beginTransaction();
			
//			jpa.AddFunc("123", "123", "Jo�o", "joao@email.com", "999999989");
//			jpa.AddFunc("223", "223", "Jose", "jose@email.com", "899999989");
//			jpa.AddFunc("213", "213", "Joaquim", "joaquim@email.com", "899979989");
//			jpa.AddFunc("221", "221", "Jorge", "jorge@email.com", "899949989");
//			jpa.AddFunc("243", "243", "Joselito", "joselito@email.com", "899699989");
//			jpa.AddFunc("523", "523", "Jonata", "jonata@email.com", "899899989");
//			jpa.AddDepen(1, "776", "Maria");
//			jpa.AddDepen(2, "176", "Carla");
//			jpa.AddDepen(3, "736", "Marta");
			
//			List<Dependente> depts = jpa.getDepenWithLetter("M");
//			for(Dependente dept : depts){
//				System.out.println("Dependente: " + dept.getNome().toString() + " --- Funcionario: " + (dept.getFunc().getNome().toString()));
//			}
			
			jpa.getAllInfoAboutFuncs();
			
			jpa.commit();
		} catch (Exception e) {
			jpa.rollback();
			e.printStackTrace();
		} finally {
			jpa.close();
		}
	}
}
