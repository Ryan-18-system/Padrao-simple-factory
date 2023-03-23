
public class ProfessionalLaptop extends LapTopAbstract {


    @Override
    protected String getMarca() {
        return this.marca;
    }

    @Override
    protected void runTestes() {
        System.out.printf("VRUMMMMMMMMM TESTE Profissional LapTop\n");
    }
}
