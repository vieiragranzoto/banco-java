public class CriarConta {
    public static void main(String [] args){
        Conta conta = new Conta(5000, 3514,1095579, new Cliente("45971187805",
                "Vitória Viana Gonçalves", 23, "Rua João Miguel Alcantra 20"));
        
        Conta conta2 = new Conta(400, 1097,1055786, new Cliente("11822212898",
                "Joana Garcia Silveira", 48, "Rua Jose Augusto Pereira 300"));

        System.out.println(conta2.getTitular().getNome());
    }
}
