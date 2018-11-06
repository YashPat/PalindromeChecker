import javax.swing.JOptionPane;					
import java.util.Scanner;								
import java.util.Random;
import java.awt.*;								
import java.applet.*;								
import java.awt.event.*;								
import java.io.*;   //for files						
import java.net.*;
import javax.sound.midi.*;
import java.util.Vector;
//import jmidi.*;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.lang.String.*;

public class Palindrome
{
	static Scanner scan = new Scanner(in);
	static String input = "";
	static boolean yes;
	static StringBuilder input1 = new StringBuilder();
	public static void main (String args[]) 
	{
		out.print("Enter your word: ");
		input = scan.nextLine();
		check(input);
		if (yes == true)
		{
			out.println("It is a palindrome!");
			for (int x = 0;x<input1.length();x++)
			{
				out.print(input1.charAt(x));
			}
			out.println();
		}
		if (yes == false)
		{
			out.println("It is not a palindrome!");
			for (int x = 0;x<input1.length();x++)
			{
				out.print(input1.charAt(x));
			}
			out.println();
		}
	}
	public static void check(String i)
	{
		input1.append(i);
		input1=input1.reverse();
		if (i.equalsIgnoreCase(input1.toString()))
		{
			yes = true;
		}
	}
}