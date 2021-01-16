package com.pwd;

import java.security.SecureRandom;

public class PasswordGenerator {
	private static final String RANDCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
	private static final String RANDSPECIALS = "#$%&._-?";
	public static synchronized char[] generateRandomPassword(int length) {
		char[] newPwd = new char[length];
		SecureRandom rnd = new SecureRandom();
		for (int i = 0; i < newPwd.length-1; i++) {
			int index = (int) (rnd.nextFloat() * RANDCHARS.length());

			newPwd[i] = RANDCHARS.charAt(index);
		}
		int special = (int) (rnd.nextFloat() * RANDSPECIALS.length());
		newPwd[newPwd.length-1] = RANDSPECIALS.charAt(special);
		return (char [])newPwd.clone();
	}
	public static void main(String[] args) {
		int PASSWORD_SIZE = 16;
		int NUM_OF_TRIES = 5; 
		for (int i = 0; i < NUM_OF_TRIES; i++) {
			System.out.println(generateRandomPassword(PASSWORD_SIZE));
		}
	}
}
