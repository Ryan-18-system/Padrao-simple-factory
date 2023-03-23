public class LapTopNull extends LapTopAbstract{


    @Override
    protected String getMarca() {
        return "Marca não cadastrada";
    }

    @Override
    protected void runTestes() {
        System.out.printf("não é possível rodar, não foi encontrado este objeto");
    }
}
