package javacore.M_polimorfismo.tests;

import javacore.M_polimorfismo.classes_interface.ArquivoDAOImpl;
import javacore.M_polimorfismo.classes_interface.ArquivoFiho;
import javacore.M_polimorfismo.classes_interface.DatabaseDAOImpl;
import javacore.M_polimorfismo.classes_interface.GenericDAO;

public class DAOTest {

	public static void main(String[] args) {
		//veja que eu posso simplesmente chamar objetos de outras classes filhas, pois posso fazer um 
		//casting implicito, bastanto trocar o objeto, e usando a mesma variavel de referencia
		
		GenericDAO arquivo = new ArquivoDAOImpl();
		arquivo.save();
		
		arquivo = new DatabaseDAOImpl();
		arquivo.save();
		
		//ArquivoFilho classe "neto" de GenericDAO, por isso ainda funciona.
		arquivo = new ArquivoFiho();
		arquivo.save();
		
		//basicamente, estou declarando uma variavel do mesmo tipo, e recebendo objetos de classes filhas/netas diferentes
	}

}
