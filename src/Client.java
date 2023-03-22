
public class Client {

	public static void main(String[] args) {
		LaptopSimpleFactory laptopFactory = new LaptopSimpleFactory();
		
		Laptop myLaptop = laptopFactory.createLaptop("GamingLaptop");
		
		myLaptop.runTests();
		
		myLaptop = laptopFactory.createLaptop("NormalLaptop");
		myLaptop.runTests();

		
		myLaptop = laptopFactory.createLaptop("ProfessionalLaptop");
		myLaptop.runTests();
		
		myLaptop = laptopFactory.createLaptop("TurbolLaptop");
		myLaptop.runTests();
	}

}
