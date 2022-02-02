package com.university.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class PersonaTests {

	@Test
	void creacionCorrecta() {
		Persona persona = new Persona();
		persona.setNombre("juan");
		persona.setApellido("castaño");
		persona.setFechaDeNacimiento(LocalDate.now());
		persona.setTelefonoFijo(2949438);
	}

}
