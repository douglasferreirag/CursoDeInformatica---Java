import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        StringBuffer mask = new StringBuffer();
        DecimalFormat df = new DecimalFormat("0000");
        int senha = Integer.parseInt(JOptionPane.showInputDialog("Digite uma senha númerica de 4 dígitos"));
        mask.append(df.format(senha));
        boolean correta = false;
        StringBuffer tentativa = new StringBuffer();
       
        System.out.println("M: " + mask);
       
       
        JOptionPane.showMessageDialog(null, mask);
       
        while(correta != true) {
            if(tentativa.equals(mask)) {               
                System.out.println("Senha correta");
                JOptionPane.showMessageDialog(null, "senha correta");
                correta = true;
            }else{
                for (int i = 0; i < 10000; i++) {
					//tentativa.append(df.format(i));
					/*
					* Em vez de apensar, eu gero um novo StringBuffer
					*/
					tentativa = new StringBuffer(df.format(i)); 
                    System.out.println(tentativa);
					/*
					* Se você colocar uma quebra de linha no final, nunca irá dar match
					*/
                    //tentativa.append("\n");
					System.out.println("\n");
					
					/*
					* O método equals no StringBuffer é u método herdado de Object, mas não o subscreve. Portanto, 
					compara objetos. Nesse caso, queremos comparar as Strings, então...
					*/
					if(tentativa.toString().equals(mask.toString())){
						correta = true;
						System.out.println("Match!" + "A senha " 
							+ mask + " corresponde a tentativa: " + tentativa + ".");
						i = 10000;
					}
                }
            }
        }
    }
}
