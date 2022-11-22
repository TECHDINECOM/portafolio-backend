package com.techdinecom.api.portafolio.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeneradorPass {

	public static void main(String[] args) {
		
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(12);
        //El String que mandamos al metodo encode es el password que queremos encriptar.
		String contraAdmin = bCryptPasswordEncoder.encode("Ulises-2022");
		String contraOtra = bCryptPasswordEncoder.encode("Prueba-2022");
		System.out.println("CONTRASEÑA ADMIN:" + contraAdmin);
		System.out.println("CONTRASEÑA 2: " + contraOtra);
		
	}
}
