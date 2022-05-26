package imagem_matriz;
import java.util.Scanner;

public class imagem_matriz {
	
	@SuppressWarnings({ "resource"}) //suprimir ou ignorar avisos do compilador
	public static void main(String[] args) {
			// Novo Scanner: "ler"
			Scanner ler = new Scanner(System.in);
	        
	        //variaveis
	        
	        int display[][] = new int[16][16]; 	// matrix do display
	        
	        int l,c; 							// i = linhas e c = colunas
	        
	        //Laços de movimentação dentro da matrix
	        for(c=0;c<16;c++){
	            for(l=0;l<16;l++){
	          
	            System.out.printf("\n ID's das cores\n 0 - Branco \n 1 - Preto \n 2 - Vermelho \n 3 - Bege \n Digite a cor da linha [%d],[%d]:  ",c,l);
	            display[c][l] = ler.nextInt();//scanner da matrix do display
	            
	            //caso de erro ('numeros menores que 0 e maiores que 3')
	             if (display[c][l] < 0 || display[c][l] > 3) {
	            	 System.out.printf("\n ***ERRO \n **Digite os id's das cores corretas**");
	            	 l--;//Reset da pergunta
				 }
	            }
	        }
	        
	        //Display
	        for(c=0;c<16;c++){
	            System.out.printf("\n");
	            for(l=0;l<16;l++){
	                System.out.printf(" %d",display[c][l]);      
	            }
	        }
	}
}
