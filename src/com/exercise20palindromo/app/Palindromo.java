package com.exercise20palindromo.app;

import com.exercise20palindromo.model.StringApplications;
public class Palindromo 
{
    public static void main(String[] args) 
	{
		String cadPalindrome1 ="Anita lava la tina.";
		String cadPalindrome2 ="Yo dono rosas, oro no doy!!!!";
		String cadPalindrome3 = "saac no ronca asi";
		
		System.out.println(StringApplications.isPalindrome(cadPalindrome1));
		System.out.println(StringApplications.isPalindrome(cadPalindrome2));
		System.out.println(StringApplications.isPalindrome(cadPalindrome3));
		System.out.println(StringApplications.isPalindromeStack(cadPalindrome1));
		System.out.println(StringApplications.isPalindromeStack(cadPalindrome2));
		System.out.println(StringApplications.isPalindromeStack(cadPalindrome3));
	}

}
