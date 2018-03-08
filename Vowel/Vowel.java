package Vowel;
import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {

		int c=0;

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String.");
		String text=scanner.nextLine();

		int l = text.length()-1;
		int i=0;

		for(i=0;i<=l;i++){

			char letter=text.charAt(i);

			if(letter=='a' || letter=='e' || letter=='i'|| letter=='o'||letter=='u'  ){


				System.out.println(letter);
				break;
			}
		}
	}
}
