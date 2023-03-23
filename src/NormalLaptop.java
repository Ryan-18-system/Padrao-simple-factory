
public class NormalLaptop extends LapTopAbstract  {


    @Override
    protected String getMarca() {
        return this.marca;
    }

    @Override
    protected void runTestes() {
        System.out.printf("VRUMMMMMMMMM TESTE Normal LapTop\n");
    }
}
