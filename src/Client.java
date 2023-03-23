
public class Client {

	public static void main(String[] args) {
		LaptopSimpleFactory laptopFactory = new LaptopSimpleFactory();

		LapTopAbstract myLaptop = laptopFactory.createLaptop("gaming");
		
		myLaptop.runTestes();
		
		myLaptop = laptopFactory.createLaptop("normal");
		myLaptop.runTestes();

		
		myLaptop = laptopFactory.createLaptop("profissional");
		myLaptop.runTestes();
		
		myLaptop = laptopFactory.createLaptop("");
		myLaptop.runTestes();
	}

}
