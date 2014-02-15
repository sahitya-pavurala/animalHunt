package animalHunt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class WeaponChecklist {

	ArrayList<AWCombo> aw = new ArrayList<AWCombo>();
	
	public void generateCheckList1(){
		// one to one mapping
		//ArrayList<String> weaponsList = new ArrayList<String>();
		/*for(String weapon : Constants.weapons){
			weaponsList.add(weapon);
		}*/
		ArrayList<String> weaponsList = new ArrayList<String>(Arrays.asList(Constants.weapons));// mapping of array to array list
		Collections.shuffle(weaponsList);
		for(int i =0; i< Constants.animals.length; i++){
			AWCombo awc = new AWCombo();
			awc.animal = Constants.animals[i];
			awc.weapons.add(weaponsList.get(i));
			aw.add(awc);
		}
		
		int[] animalCount = {0,0,0,0,0};
		for(AWCombo awc : aw){
			ArrayList<String> weaponsListRemaining = new ArrayList<String>(Arrays.asList(new String[weaponsList.size()]));
			Collections.copy(weaponsListRemaining, weaponsList);
			weaponsListRemaining.remove(awc.weapons.get(0));
			while(true){
				Vector<String> v = getWeaponsVector(weaponsListRemaining); // vectors has option to generate random sub sequence
				Collections.shuffle(v);
				v.setSize(getSize(3));
				boolean correctWeaponCheckList = true; // variable which is true
				for(String weapon : v){ // module checks if a weapon is used in the range i.e either 2 to 4 animals can have a weapon in their list
					if(weapon.contains("1") && animalCount[0] < 3){ //animal count contains the number of times a weapon is used
						continue;
					}else if(weapon.contains("2") && animalCount[1] < 3){
						continue;
					}else if(weapon.contains("3") && animalCount[2] < 3){
						continue;
					}else if(weapon.contains("4") && animalCount[3] < 3){
						continue;
					}else if(weapon.contains("5") && animalCount[4] < 3){
						continue;
					}else{
						correctWeaponCheckList = false;
						break;
					}
				}
				if(correctWeaponCheckList){
					for(String weapon : v){
						if(weapon.contains("1")){
							animalCount[0]++;
						}else if(weapon.contains("2")){
							animalCount[1]++;
						}else if(weapon.contains("3")){
							animalCount[2]++;
						}else if(weapon.contains("4")){
							animalCount[3]++;
						}else if(weapon.contains("5")){
							animalCount[4]++;
						}
					}
					awc.weapons.addAll(getWeaponsList(v)); // adds the valid sequence to AW combo column
					break; 
				}
			}
		}
	}
	

	private ArrayList<String> getWeaponsList(Vector<String> v) {
		ArrayList<String> weapons = new ArrayList<String>();
		for(String st : v){
			weapons.add(st);
		}
		return weapons;
	}

	private int getSize(int count) {
		return (new Random().nextInt(count) + 1);
	}

	private Vector<String> getWeaponsVector(ArrayList<String> weaponsListRemaining) {
		Vector<String> weaponVector = new Vector<String>();
		for(String w : weaponsListRemaining){
			weaponVector.add(w);
		}
		return weaponVector;
	}

	public void generateCheckList2(){
		ArrayList<String> weaponsList = new ArrayList<String>();
		for(String weapon : Constants.weapons){
			weaponsList.add(weapon);
		}
		Collections.shuffle(weaponsList);
		for(int i =0; i< Constants.animals.length; i++){
			AWCombo awc = new AWCombo();
			awc.animal = Constants.animals[i];
			awc.weapons.add(weaponsList.get(i));
			aw.add(awc);
		}
		
		int[] animalCount = {0,0,0,0,0};
		for(AWCombo awc : aw){
			ArrayList<String> weaponsListRemaining = new ArrayList<String>(Arrays.asList(new String[weaponsList.size()]));
			Collections.copy(weaponsListRemaining, weaponsList);
			weaponsListRemaining.remove(awc.weapons.get(0));
			while(true){
				Vector<String> v = getWeaponsVector(weaponsListRemaining);
				Collections.shuffle(v);
				v.setSize(getSize(2));
				boolean correctWeaponCheckList = true;
				for(String weapon : v){
					if(weapon.contains("1") && animalCount[0] < 2){
						continue;
					}else if(weapon.contains("2") && animalCount[1] < 2){
						continue;
					}else if(weapon.contains("3") && animalCount[2] < 2){
						continue;
					}else if(weapon.contains("4") && animalCount[3] < 2){
						continue;
					}else if(weapon.contains("5") && animalCount[4] < 2){
						continue;
					}else{
						correctWeaponCheckList = false;
						break;
					}
				}
				if(correctWeaponCheckList){
					for(String weapon : v){
						if(weapon.contains("1")){
							animalCount[0]++;
						}else if(weapon.contains("2")){
							animalCount[1]++;
						}else if(weapon.contains("3")){
							animalCount[2]++;
						}else if(weapon.contains("4")){
							animalCount[3]++;
						}else if(weapon.contains("5")){
							animalCount[4]++;
						}
					}
					awc.weapons.addAll(getWeaponsList(v));
					break;
				}
			}
		}
	}
		
	

	public void generateCheckList3(){
		ArrayList<String> weaponsList = new ArrayList<String>();
		for(String weapon : Constants.weapons){
			weaponsList.add(weapon);
		}
		Collections.shuffle(weaponsList);
		for(int i =0; i< Constants.animals.length; i++){
			AWCombo awc = new AWCombo();
			awc.animal = Constants.animals[i];
			awc.weapons.add(weaponsList.get(i));
			aw.add(awc);
		}
		
		int[] animalCount = {0,0,0,0,0};
		for(AWCombo awc : aw){
			ArrayList<String> weaponsListRemaining = new ArrayList<String>(Arrays.asList(new String[weaponsList.size()]));
			Collections.copy(weaponsListRemaining, weaponsList);
			weaponsListRemaining.remove(awc.weapons.get(0));
			while(true){
				Vector<String> v = getWeaponsVector(weaponsListRemaining);
				Collections.shuffle(v);
				v.setSize(getSize(2));
				boolean correctWeaponCheckList = true;
				for(String weapon : v){
					if(weapon.contains("1") && animalCount[0] < 2){
						continue;
					}else if(weapon.contains("2") && animalCount[1] < 2){
						continue;
					}else if(weapon.contains("3") && animalCount[2] < 2){
						continue;
					}else if(weapon.contains("4") && animalCount[3] < 2){
						continue;
					}else if(weapon.contains("5") && animalCount[4] < 2){
						continue;
					}else{
						correctWeaponCheckList = false;
						break;
					}
				}
				if(correctWeaponCheckList){
					for(String weapon : v){
						if(weapon.contains("1")){
							animalCount[0]++;
						}else if(weapon.contains("2")){
							animalCount[1]++;
						}else if(weapon.contains("3")){
							animalCount[2]++;
						}else if(weapon.contains("4")){
							animalCount[3]++;
						}else if(weapon.contains("5")){
							animalCount[4]++;
						}
					}
					awc.weapons.addAll(getWeaponsList(v));
					break;
				}
			}
		}
		
	}
	
	public void printCheckList(){
		for(AWCombo awc : aw){
			System.out.print(awc.animal);
			for(String weapon : awc.weapons){
				System.out.print("    " + weapon);
			}
			System.out.println(" ");
		}
	}
	
	public void printWeapons(String animal){
		for(AWCombo amatch : aw){
			if(amatch.animal.equalsIgnoreCase(animal)){
				for(String w : amatch.weapons){
					System.out.println(w);
				}
			}
		}
	}
	
	public boolean playLevel1(String animal, String weapon){
		for(AWCombo awc : aw){
			if(awc.animal.equalsIgnoreCase(animal)){
				if(!awc.weapons.contains(weapon)){
					return false;
				}else{
					aw.remove(awc);
					break;
				}
			}
		}
		for(AWCombo awc : aw){
			if(awc.weapons.contains(weapon)){
				awc.weapons.remove(weapon);
			}
		}
		printCheckList();
		return true;
	}

	public boolean continueGame(ArrayList<String> animalsHunted, ArrayList<String> weaponsUsed) {
		ArrayList<String> weaponsLeft = new ArrayList<String>();
		for(String weapon : Constants.weapons){
			if(!weaponsUsed.contains(weapon)){
				weaponsLeft.add(weapon);
			}
		}
		for(AWCombo awc : aw){
			boolean weaponAvailable = false;
			for(String weapon : awc.weapons){
				if(weaponsLeft.contains(weapon)){
					weaponAvailable = true;
					break;
				}
			}
			if(!weaponAvailable){
				return false;
			}
		}
		return true;
	}
}
