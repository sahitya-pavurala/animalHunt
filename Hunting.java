package animalHunt;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Hunting {
	public static void main(String args[]){
		int n, option;
		System.out.println("Enter game level");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("enter user input 1. list weapons 2.list animals 3.hunt");
		option = sc.nextInt();
		switch(option){
			case 1 : 
				for(String st : Constants.weapons){
					System.out.println(st);//list weapons
				}
				break;
			case 2 : 
				for(String st : Constants.animals){
					System.out.println(st);//list animals
				}
				break;
			case 3 : 
				WeaponChecklist w = new WeaponChecklist();
				switch(n){
					case 1 :
					{
						w.generateCheckList1();
						w.printCheckList();
						ArrayList<String> animalsHunted = new ArrayList<String>();
						ArrayList<String> weaponsUsed = new ArrayList<String>();
						for(int i = 1 ; i <= Constants.count; i++){
							System.out.println("Please select animal:");
							String animal = sc.next(); //read animal
							w.printWeapons(animal);
							if(animalsHunted.contains(animal)){ //check this function once
								System.out.println("The animal has been killed!");
								i--;
								continue;
							}
							while(true){
								System.out.println("Please select weapon:");
								String weapon = sc.next(); //read weapon
								/*if(weaponsUsed.contains(weapon)){ //check this function once
									System.out.println("The weapon has been used!");
									continue;
								}*/
								if(!w.playLevel1(animal, weapon)){
									System.out.println("The weapon you selected cannot be used to kill this animal!");
								}else{
									System.out.println(animal + " is killed by " + weapon);
									System.out.println("No. Of Animals left : " + w.aw.size());
									System.out.println("No. Of Weapons left : " + w.aw.size());
									animalsHunted.add(animal);
									weaponsUsed.add(weapon);
									if(!w.continueGame(animalsHunted, weaponsUsed)){
										System.out.println("You cannot continue the game with left over wepons");
										System.out.println("You loose the game");
										System.exit(0);
									}
									break;
								}
							}
						}
						System.out.println("You have won a medal, you are the King of the Jungle");
						break;
					}
					case 2 :
					{
						w.generateCheckList2();
						w.printCheckList();
						ArrayList<String> animalsHunted = new ArrayList<String>();
						ArrayList<String> weaponsUsed = new ArrayList<String>();
						for(int i = 1 ; i <= Constants.count; i++){
							System.out.println("Please select animal:");
							String animal = sc.next(); //read animal
							w.printWeapons(animal);
							if(animalsHunted.contains(animal)){ //check this function once
								System.out.println("The animal has been killed!");
								i--;
								continue;
							}
							while(true){
								System.out.println("Please select weapon:");
								String weapon = sc.next(); //read weapon
								/*if(weaponsUsed.contains(weapon)){ //check this function once
									System.out.println("The weapon has been used!");
									continue;
								}*/
								if(!w.playLevel1(animal, weapon)){
									System.out.println("The weapon you selected cannot be used to kill this animal!");
								}else{
									System.out.println(animal + " is killed by " + weapon);
									System.out.println("No. Of Animals left : " + w.aw.size());
									System.out.println("No. Of Weapons left : " + w.aw.size());
									animalsHunted.add(animal);
									weaponsUsed.add(weapon);
									if(!w.continueGame(animalsHunted, weaponsUsed)){
										System.out.println("You cannot continue the game with left over wepons");
										System.out.println("You loose the game");
										System.exit(0);
									}
									break;
								}
							}
						}
						System.out.println("You have won a medal, you are the King of the Jungle");
						break;
					}
					case 3 :
					{
						long lStartTime = new Date().getTime();
						w.generateCheckList3();
						w.printCheckList();
						ArrayList<String> animalsHunted = new ArrayList<String>();
						ArrayList<String> weaponsUsed = new ArrayList<String>();
						for(int i = 1 ; i <= Constants.count; i++){
							System.out.println("Please select animal:");
							String animal = sc.next(); //read animal
							w.printWeapons(animal);
							if(animalsHunted.contains(animal)){ //check this function once
								System.out.println("The animal has been killed!");
								i--;
								continue;
							}
							int count = 0;
							while(true){
								if(count == 2){
									System.out.println("You selected the wrong weapon more than twice!!!! lost the game!!");
									System.exit(0);
								}
								System.out.println("Please select weapon:");
								String weapon = sc.next(); //read weapon
								
								if(weaponsUsed.contains(weapon)){ //check this function once
									System.out.println("The weapon has been used!");
									count ++;
									continue;
								}
								if(!w.playLevel1(animal, weapon)){
									System.out.println("The weapon you selected cannot be used to kill this animal!");
									count ++;
								}else{
									System.out.println(animal + " is killed by " + weapon);
									System.out.println("No. Of Animals left : " + w.aw.size());
									System.out.println("No. Of Weapons left : " + w.aw.size());
									animalsHunted.add(animal);
									weaponsUsed.add(weapon);
									if(!w.continueGame(animalsHunted, weaponsUsed)){
										System.out.println("You cannot continue the game with left over wepons");
										System.out.println("You loose the game");
										System.exit(0);
									}
									
								    	  
									break;
								}
							}
						}
						long lEndTime = new Date().getTime();
						long difference = lEndTime - lStartTime; //check different
						 
					      System.out.println("Elapsed seconds: " + difference/1000);
					      if (difference/1000 <= 60){
					    	  System.out.println("You have won a medal, you are the King of the Jungle");
					      }
					      else
					      
						System.out.println("You have won the game but did not complete in 60 seconds");
						break;
					}
					default : 
						System.out.println("Invaluid");
						System.exit(0);
				}
				break;
			default : ;
		}
	}

}
