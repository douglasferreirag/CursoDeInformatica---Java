
import java.util.Random;
import java.util.Scanner;


public class App {

    
    public static int sorteia (){
 
        Random r = new Random () ;
        final int H = 60 ; // sorteia entre 1 e 60
        final int L = 1 ;
        return (int)( r.nextDouble () * ( H-L )) + L;
    }

  

    public static void main(String[] args) throws Exception {

                int dezenaSorteada1, dezenaSorteada2, dezenaSorteada3, dezenaSorteada4, dezenaSorteada5, dezenaSorteada6;

                int dezenaDigitada1, dezenaDigitada2, dezenaDigitada3, dezenaDigitada4, dezenaDigitada5, dezenaDigitada6;

                int pontos = 0;

            

                Scanner input = new Scanner(System.in);

                System.out.println("Digite as dezenas que escolheu: ");

                dezenaDigitada1 = input.nextInt();

                dezenaDigitada2 = input.nextInt();

                dezenaDigitada3 = input.nextInt();

                dezenaDigitada4 = input.nextInt();

                dezenaDigitada5 = input.nextInt();

                dezenaDigitada6 = input.nextInt();

                if(dezenaDigitada1 < 1)

                    System.exit(0);

                if(dezenaDigitada1 > 60)

                        System.exit(0);   
                        
                if(dezenaDigitada2 < 1)

                        System.exit(0);
            
                if(dezenaDigitada3 > 60)
            
                        System.exit(0);
                        
                if(dezenaDigitada4 < 1)

                        System.exit(0);
            
                if(dezenaDigitada4 > 60)
            
                        System.exit(0);  
                        
                if(dezenaDigitada5 < 1)

                        System.exit(0);
            
                if(dezenaDigitada5 > 60)
            
                        System.exit(0);  

                if(dezenaDigitada6 < 1)

                        System.exit(0);
            
                if(dezenaDigitada6 > 60)
            
                        System.exit(0);  

                System.out.println("Sorteando as dezenas premiadas ...");

                dezenaSorteada1 = sorteia();

                dezenaSorteada2 = sorteia() ;

                dezenaSorteada3 = sorteia() ;

                dezenaSorteada4 = sorteia() ;

                dezenaSorteada5 =  sorteia();

                dezenaSorteada6 = sorteia();

                System.out.println("Conferindo as dezenas ...");

                if(dezenaDigitada1 == dezenaSorteada1){

                        System.out.println("Acertou a seguinte dezena: " + dezenaSorteada1);

                        pontos = pontos + 1;

                }

                if(dezenaDigitada1 == dezenaSorteada2){

                    System.out.println("Acertou a seguinte dezena: " + dezenaSorteada2);

                    pontos = pontos + 1;

                }
                
                if(dezenaDigitada1 == dezenaSorteada3){

                    System.out.println("Acertou a seguinte dezena: " + dezenaSorteada3);

                    pontos = pontos + 1;

                }

                if(dezenaDigitada1 == dezenaSorteada4){

                    System.out.println("Acertou a seguinte dezena: " + dezenaSorteada4);

                    pontos = pontos + 1;

                }

                if(dezenaDigitada1 == dezenaSorteada5){

                    System.out.println("Acertou a seguinte dezena: " + dezenaSorteada5);

                    pontos = pontos + 1;

                }

                if(dezenaDigitada1 == dezenaSorteada6){

                    System.out.println("Acertou a seguinte dezena: " + dezenaSorteada6);

                    pontos = pontos + 1;

                }

                if(dezenaDigitada2 == dezenaSorteada1){

                    System.out.println("Acertou a seguinte dezena: " + dezenaSorteada1);

                    pontos = pontos + 1;

                }

                if(dezenaDigitada2 == dezenaSorteada2){

                    System.out.println("Acertou a seguinte dezena: " + dezenaSorteada2);

                    pontos = pontos + 1;

                }

                if(dezenaDigitada2 == dezenaSorteada3){

                    System.out.println("Acertou a seguinte dezena: " + dezenaSorteada3);

                    pontos = pontos + 1;

                }

                if(dezenaDigitada2 == dezenaSorteada4){

                    System.out.println("Acertou a seguinte dezena: " + dezenaSorteada4);

                    pontos = pontos + 1;

                }

                if(dezenaDigitada2 == dezenaSorteada5){

                    System.out.println("Acertou a seguinte dezena: " + dezenaSorteada5);

                    pontos = pontos + 1;

                }

                if(dezenaDigitada2 == dezenaSorteada6){

                    System.out.println("Acertou a seguinte dezena: " + dezenaSorteada6);

                    pontos = pontos + 1;

                }


                if(dezenaDigitada3 == dezenaSorteada1){

                    System.out.println("Acertou a seguinte dezena: " + dezenaSorteada1);

                    pontos = pontos + 1;

            }

            if(dezenaDigitada3 == dezenaSorteada2){

                System.out.println("Acertou a seguinte dezena: " + dezenaSorteada2);

                pontos = pontos + 1;

            }
            
            if(dezenaDigitada3 == dezenaSorteada3){

                System.out.println("Acertou a seguinte dezena: " + dezenaSorteada3);

                pontos = pontos + 1;

            }

            if(dezenaDigitada3 == dezenaSorteada4){

                System.out.println("Acertou a seguinte dezena: " + dezenaSorteada4);

                pontos = pontos + 1;

            }

            if(dezenaDigitada3 == dezenaSorteada5){

                System.out.println("Acertou a seguinte dezena: " + dezenaSorteada5);

                pontos = pontos + 1;

            }

            if(dezenaDigitada3 == dezenaSorteada6){

                System.out.println("Acertou a seguinte dezena: " + dezenaSorteada6);

                pontos = pontos + 1;

            }

            if(dezenaDigitada4 == dezenaSorteada1){

                System.out.println("Acertou a seguinte dezena: " + dezenaSorteada1);

                pontos = pontos + 1;

            }

            if(dezenaDigitada4 == dezenaSorteada2){

                System.out.println("Acertou a seguinte dezena: " + dezenaSorteada2);

                pontos = pontos + 1;

            }

            if(dezenaDigitada4 == dezenaSorteada3){

                System.out.println("Acertou a seguinte dezena: " + dezenaSorteada3);

                pontos = pontos + 1;

            }

            if(dezenaDigitada4 == dezenaSorteada4){

                System.out.println("Acertou a seguinte dezena: " + dezenaSorteada4);

                pontos = pontos + 1;

            }

            if(dezenaDigitada4 == dezenaSorteada5){

                System.out.println("Acertou a seguinte dezena: " + dezenaSorteada5);

                pontos = pontos + 1;

            }

            if(dezenaDigitada4 == dezenaSorteada6){

                System.out.println("Acertou a seguinte dezena: " + dezenaSorteada6);

                pontos = pontos + 1;

            }

            if(dezenaDigitada5 == dezenaSorteada1){

                System.out.println("Acertou a seguinte dezena: " + dezenaSorteada1);

                pontos = pontos + 1;

            }

            if(dezenaDigitada5 == dezenaSorteada2){

                System.out.println("Acertou a seguinte dezena: " + dezenaSorteada2);

                pontos = pontos + 1;

            }

            if(dezenaDigitada5 == dezenaSorteada3){

                System.out.println("Acertou a seguinte dezena: " + dezenaSorteada3);

                pontos = pontos + 1;

            }

            if(dezenaDigitada5 == dezenaSorteada4){

                System.out.println("Acertou a seguinte dezena: " + dezenaSorteada4);

                pontos = pontos + 1;

            }

            if(dezenaDigitada5 == dezenaSorteada5){

                System.out.println("Acertou a seguinte dezena: " + dezenaSorteada5);

                pontos = pontos + 1;

            }

            if(dezenaDigitada5 == dezenaSorteada6){

                System.out.println("Acertou a seguinte dezena: " + dezenaSorteada6);

                pontos = pontos + 1;

            }

            if(dezenaDigitada6 == dezenaSorteada1){

                System.out.println("Acertou a seguinte dezena: " + dezenaSorteada1);

                pontos = pontos + 1;

            }

            if(dezenaDigitada6 == dezenaSorteada2){

                System.out.println("Acertou a seguinte dezena: " + dezenaSorteada2);

                pontos = pontos + 1;

            }

            if(dezenaDigitada6 == dezenaSorteada3){

                System.out.println("Acertou a seguinte dezena: " + dezenaSorteada3);

                pontos = pontos + 1;

            }

            if(dezenaDigitada6 == dezenaSorteada4){

                System.out.println("Acertou a seguinte dezena: " + dezenaSorteada4);

                pontos = pontos + 1;

            }

            if(dezenaDigitada6 == dezenaSorteada5){

                System.out.println("Acertou a seguinte dezena: " + dezenaSorteada5);

                pontos = pontos + 1;

            }

            if(dezenaDigitada6 == dezenaSorteada6){

                System.out.println("Acertou a seguinte dezena: " + dezenaSorteada6);

                pontos = pontos + 1;

            }

            System.out.println("Dezenas Sorteadas: " + dezenaSorteada1 + ","+ dezenaSorteada2 + "," + dezenaSorteada3 + "," + dezenaSorteada4 + "," + dezenaSorteada5 + "," + dezenaSorteada6);

            System.out.println("Dezenas Sorteadas: " + Integer.toString(dezenaDigitada1) + ","+ Integer.toString(dezenaDigitada2) + "," + Integer.toString(dezenaDigitada3) + "," + Integer.toString(dezenaDigitada4) + "," + Integer.toString(dezenaDigitada5) + "," + Integer.toString(dezenaDigitada6));

            System.out.println("Você acertou " + pontos + " dezenas");


            
                    
                
    
    }
}
