public class Ex05while {
    
    public static void main(String[] args) {
        
        int i = 0;

        while (i <= 100001){
            System.out.println("Contando de 0 a 100001 de mil em mil com while: " + i);
            i+= 1000;
        }
    }
}
