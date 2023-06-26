package main;

import java.util.Scanner;
public class mainGame {

	public static void main(String[] args){
		int Score = 0;
		Scanner newObj = new Scanner(System.in);
		System.out.println("Enter your name :)");
		
		String Name = newObj.nextLine();
		System.out.println("Hello, " + Name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Would you like to start?");
		String cont = newObj.nextLine();
		if(!cont.toLowerCase().equals("yes")) {
			System.out.println("Cancelled");
			newObj.close();
			return;
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("What is the capital of Denmark?");
		String Anwser = newObj.nextLine();
		if (!Anwser.toLowerCase().equals("copenhagen")) {
			System.out.println("Wrong :skull:");
			newObj.close();
			return;
		}
		else {
			System.out.println("Correct!");
			Score += 1;
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("What countrys capital is Stockholm");
		Anwser = newObj.nextLine();
		if (!Anwser.toLowerCase().equals("sweden")) {
			System.out.println("Wrong :skull:");
			newObj.close();
			return;
		}
		else {
			System.out.println("Correct!");
			Score += 1;
		}
		System.out.println(Score);
		newObj.close();
		return;
		
	}

}
