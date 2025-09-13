import java.util.Scanner;

public class domaci1 {

	public static void main(String[] args) {
		int a = 24;
		int b = 12;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite znak operacije:");
		String operation = scanner.next();
        if (operation.equals("+"))
        	System.out.println(a+b);
        else if (operation.equals("-"))
        	System.out.println(a-b);
        else if (operation.equals("*"))
        	System.out.println(a*b);
        else if (operation.equals("/"))
        	System.out.println(a/b);
        else
        	System.out.println("Nepostojeca operacija");
        scanner.close();
	}

}
