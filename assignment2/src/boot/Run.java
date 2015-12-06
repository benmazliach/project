package boot;

import java.io.IOException;
//import java.util.Scanner;

import workers.Designer;
import workers.Manager;
import workers.Programmer;
import workers.Worker;

public class Run {

	public static void main(String[] args) {
		
		/*Worker[] workers;
		Scanner s=new Scanner(System.in);
		System.out.print("How many workers?");
		int numOfWorkers = s.nextInt();
		workers=new Worker[numOfWorkers];
		
		for (int i=0;i<numOfWorkers;i++) {
			System.out.println("1 – programmer");
			System.out.println("2 – designer");
			System.out.println("3 – manager");
			int b = s.nextInt();
			switch (b) {
			case 1:
				workers[i] = new Programmer();
				break;
			case 2:
				workers[i] = new Designer();
				break;
			case 3:
				workers[i] = new Manager();
				break;
			default:
				System.out.println("Please enter again");
				i--;
			}
		}
		for (Worker worker : workers) {
			worker.work();
		}
		s.close();*/
		
		
		int numOfWorkers = 0;
		System.out.println("How many workers?");
		try{
			char ichar = (char)System.in.read();
			numOfWorkers = Character.getNumericValue(ichar);
		
		Worker[] workers = new Worker[numOfWorkers];
		
		for(int i=0;i<numOfWorkers;i++)
		{
			@SuppressWarnings("unused")
			char temp;
			temp = (char)System.in.read();
			temp = (char)System.in.read();
			System.out.println("Choose 1 for progrmer - Choose 2 for desiner - Choose 3 for manager");
			int iChoice = 0;
			char choice = (char)System.in.read();
			iChoice = Character.getNumericValue(choice);
			if(iChoice==1)
			{
				workers[i] = new Programmer();
			}
			else if(iChoice==2)
			{
				workers[i] = new Designer();
			}
			else if(iChoice==3)
			{
				workers[i] = new Manager();
			}	
			else
				i--;
		}
		
		System.out.println("Ben");
		
		for (Worker worker : workers) {
			
			worker.work();
			
		}
		}catch(IOException e){
			e.printStackTrace();
		}	
	}

}
