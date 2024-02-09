package P4;
//this class is similar to P3 but has more code for testing
public class FarmTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Farm myFarm = new Farm("stat.dat");
		myFarm.printSummary();
		for(Animal a: myFarm.getAnimals())
			a.setEnergy(Math.random()*100);
		System.out.println("\nAvailable food before feeding: " + myFarm.getAvailableFood() + "\n");
		System.out.println("\nInitial list of animals:\n-------------------------");
		myFarm.printAnimals();
		System.out.println("\nAdding a clone of the second animal\n-----------------------------------");
		myFarm.addClone(myFarm.getAnimals()[1]);
		myFarm.printAnimals();
		myFarm.feedAnimals();
		System.out.println("\nAvailable food after feeding: " + myFarm.getAvailableFood() + "\n");
		System.out.println("\nAfter SORTING:\n--------------");
		myFarm.animSort();
		myFarm.printAnimals();
		System.out.println("\nFarm summary:\n--------------");
		myFarm.printSummary();
		myFarm.exit("stat.dat");
		/*
		 * Q: Why number of animals increase every time we run FarmTest?
		 * A: we are adding a CLONE every time and at the end we SAVE
		 * the next time we LOAD the previous list of animals and add another clone and so on. 
		 */
	}
}
