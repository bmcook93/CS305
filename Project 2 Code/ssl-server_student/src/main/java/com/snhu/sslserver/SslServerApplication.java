package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}

@RestController
class ServerController {
	// store characters for hexadecimal conversion
	private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
	
	// method to get hash value of input string for SHA-256
	private String getHash(String input) {
		try {
			// initialize MessageDigest object
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			
			// digest hash, store in byte array
			byte[] sha256 = md.digest();
			
			// convert byte array to hex and return it
			return bytesToHex(sha256);
		} catch (NoSuchAlgorithmException e) {
			// catch error
			e.printStackTrace();
		}
		return input;
	}

	// method to convert byte to hex
	public static String bytesToHex(byte[] bytes) {
		// char array to store hex characters
		char[] hexChars = new char[bytes.length * 2];
		
		// iterate over each byte
		for (int j = 0; j < bytes.length; j++) {
			int v = bytes[j] & 0xFF;
			hexChars[j * 2] = HEX_ARRAY[v >>> 4];
			hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
		}
		return new String(hexChars);
	}

	// map /hash URL path
	@RequestMapping("/hash")
	public String myHash() {
		// input data
		String data = "Brandon Cook Check Sum";
		
		// get SHA-256 hash
		String hash = getHash(data);
		
		// HTML string
		return "<p>data: " + data + "</p><p> Name of Cipher Used: SHA-256 Value: " + hash;
	}
}