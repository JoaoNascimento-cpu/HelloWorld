public class helloworld1{
    public static void main(String[] args){
        String ambiente = args[0];
        if (ambiente.equalsIgnoreCase("DEV")) {
            
            System.out.print("Executando no ambiente de 'DEV' ");
        } else if (ambiente.equalsIgnoreCase("TESTE")) {
            System.out.print("Executando no ambiente de 'TESTE' ");
        } else{
            System.out.print(ambiente);
        }
    }
}