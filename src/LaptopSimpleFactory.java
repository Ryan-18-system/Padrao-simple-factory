
public class LaptopSimpleFactory {
	
	public LapTopAbstract createLaptop(String laptopType) {


		if (laptopType.equalsIgnoreCase("normal")) {
			return new NormalLaptop();
		} else if (laptopType.equalsIgnoreCase("gaming"))
			return new GamingLaptop();
		else if (laptopType.equalsIgnoreCase("profissional"))
			return new ProfessionalLaptop();
		else
			return new LapTopNull();
		
	}
}
