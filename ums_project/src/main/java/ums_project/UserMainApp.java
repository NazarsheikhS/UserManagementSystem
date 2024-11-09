package ums_project;

import java.util.Scanner;

public class UserMainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----------WELCOME TO UMS-------------\n");

		while (true) {
			
			System.out.print("1.Login\n2.Add User\n3.Delete User\n4.View All Users\n5.Select User By Id\n6.Update User\n7.Exit\nChoose One Option: ");
			int ch = sc.nextInt();
			
			switch (ch) {
			case 1: {
				
				new LoginApp().login(sc);
				break;
			}
			
			case 2: {
				
				new InsertApp().addUser(sc);
				break;
			}
			
			case 3: {
				
				new DeleteApp().deleteUser(sc);
				break;
			}
			
			case 4: {
				
				new SelectAllApp().selectAllUsers();
				break;
			}
			
			case 5: {
				
				new SelectUserById().selectUserById(sc);
				break;
			}
			
			case 6: {
				
				new UpdateUserApp().updateUser(sc);
				break;
			}
			case 7: {
				System.out.println("\nThank You For Using Our Application :)\nVisit Again :)");
				sc.close();
				System.exit(0);
				break;
			}
			default:
				System.out.println("Invalid Choice - "+ch);
			}
		}
	}
}