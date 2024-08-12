public class SistemaMedida {
    public static void main(String[] args) {
        
        String sigla = "M";

        switch (sigla) {
            case "P": {
                System.out.printf("Pequeno");
                break;
            }
            case "M": {
                System.out.printf("Médio");
                break;
            }
            case "G": {
                System.out.printf("Grande");
                break;
            }
            default:
                System.out.printf("Indefinido");
                break;
        }
    }
}
