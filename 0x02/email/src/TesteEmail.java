
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TesteEmail {
	
	@Test
	void testar_email_com_arroba() throws Exception {
		assertTrue(Person.emailValid("email_teste@dominio.com.br"));
	}
	
	@Test
	void testar_email_sem_arroba() throws Exception {
		assertFalse(Person.emailValid("email_testedominio.com.br"));
	}

	@Test
	void testar_email_mais_50_caracteres() throws Exception {
		assertEquals(Person.emailValid("emailtestemuitolongonaodeveser_valido@dominio.com.br"), false);
	}
}
