
public class LaptopSimpleFactory {
	
	public Laptop createLaptop(String laptopType) {
		if (laptopType == null )
			return null;
		
		laptopType = laptopType.toUpperCase();

		if (laptopType.equalsIgnoreCase("NormalLaptop"))
			return new NormalLaptop();
		
		else if (laptopType.equalsIgnoreCase("GamingLaptop"))
			return new GamingLaptop();
		else if (laptopType.equalsIgnoreCase("ProfessionalLaptop"))
			return new ProfessionalLaptop();
		else
			return null;
		
	}
}
