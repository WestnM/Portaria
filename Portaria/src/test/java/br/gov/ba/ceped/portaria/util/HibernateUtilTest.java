package br.gov.ba.ceped.portaria.util;

import org.hibernate.Session;
import org.junit.Test;

public class HibernateUtilTest {
	
	@Test
	public void conectar() {
		Session sessão = HibernateUtil.getFabricaDeSessoes().openSession();
		sessão.close();
		HibernateUtil.getFabricaDeSessoes().close();
	}

}
