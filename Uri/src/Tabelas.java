import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Tabelas {
	

public static void main(String[] args) {
               // String b9 = "3";
               // String x1 = digA1.getText().toString();  //transforma em inteiro
               // String b1 = "3";
             /*   String x2 = digB2.getText().toString();  //transforma em inteiro
                String b2 = "27";
                String x3 = digC3.getText().toString();  //transforma em inteiro
                String b3 = "10";
                String x4 = digA4.getText().toString();  //transforma em inteiro
                String b4 = "1";
                String x5 = digC5.getText().toString();  //transforma em inteiro
                String b5 = "17";
                */



ArrayList<Colunas> linha = new ArrayList<Colunas>();
ArrayList<String> listaPalavras = new ArrayList<String>();


                String dig1 = "3";
                String dig2 = "5";
                String dig3 = "9";
                String dig4 = "12";
                String dig5 = "15";
                Colunas linha0 =  new Colunas("3","-","-");
                Colunas linha1 =  new Colunas("3","27","-");
                Colunas linha2 =  new Colunas("3","27","10");
                Colunas linha3 =  new Colunas("1","27","10");
                Colunas linha4 =  new Colunas("1","27","17");

                linha.add(linha0);
                linha.add(linha1);
                linha.add(linha2);
                linha.add(linha3);
                linha.add(linha4);
                String  g ;

                for (int i = 0; i<linha.size();i++) {                	              	
                	//if(linha.get(i).getC()contains){
                		
                	//}
                	String p = JOptionPane.showInputDialog("Digite uma palavra");
        			listaPalavras.add(p);
        			//System.out.println(linha.get(i).getA());
        			System.out.println(linha.get(i).getA());
        			
                	//System.out.println("nome:" +nomes[k]+"nota:\n"+notas[k]);
                	//String bb = linha.get(i).getC();
                }
                System.out.println(listaPalavras); 
                System.out.println(listaPalavras.get(0));
                System.out.println(linha);
                System.out.println(linha.get(0).getA());
                //System.out.println("oi"+ g[0]);
                /*

                if(!x2.equalsIgnoreCase( linha.get(1).getB())) {
                    digB2.setText("");  //apaga
                    //Toast.makeText(getBaseContext(), "Tente novamente 1", Toast.LENGTH_LONG).show();
                    //break;

                } else {
                    digC3.requestFocus();
                    digA2.setText("3");
                    digC2.setText("-");
                    va3.setText(">> C =  B/A+1");
                    //System.out.println("linha 1 não -> " );
                    //Toast.makeText(getBaseContext(), "Você Acertou 1", Toast.LENGTH_LONG).show();

                }

                if(!x3.equalsIgnoreCase( linha.get(2).getC())) {
                    digC3.setText("");  //apaga
                    //Toast.makeText(getBaseContext(), "Tente novamente 1", Toast.LENGTH_LONG).show();
                    //break;

                } else {
                    digA4.requestFocus();
                    digA3.setText("3");
                    digB3.setText("27");
                    va4.setText(">> A =  A - 2");
                    //System.out.println("linha 1 não -> " );
                    //Toast.makeText(getBaseContext(), "Você Acertou 1", Toast.LENGTH_LONG).show();

                }

                if(!x4.equalsIgnoreCase( linha.get(3).getA())) {
                    digA4.setText("");  //apaga
                    //Toast.makeText(getBaseContext(), "Tente novamente 1", Toast.LENGTH_LONG).show();
                    //break;

                } else {
                    digC5.requestFocus();
                    digB4.setText("27");
                    digC4.setText("10");
                    //System.out.println("linha 1 não -> " );
                    //Toast.makeText(getBaseContext(), "Você Acertou 1", Toast.LENGTH_LONG).show();
                    va5.setText(">> C =  B - C");
                }

                if(!x5.equalsIgnoreCase( linha.get(4).getC())) {
                    digC5.setText("");  //apaga
                    //Toast.makeText(getBaseContext(), "Tente novamente 1", Toast.LENGTH_LONG).show();
                    //break;

                } else {
                    //System.out.println("linha 1 não -> " );
                    //Toast.makeText(getBaseContext(), "Você Acertou 1", Toast.LENGTH_LONG).show();
                    digA5.setText("1");
                    digB5.setText("27");
                    va2.setText(">> B =  3 ** 3");
                }


               // }

                //Colunas linha0 =  new Colunas("1","2","3");
                // linhas.add(linha0);
                // Scanner leitor = new Scanner(System.in);
                //linhas.add(linhas.get(0).getC());
                //String bb = (linha.get(0).getC());
                //digA1.requestFocus(); // cursor
                //       caixa A1
                //x1 = leitor.nextLine();
                //if(linha.get(0).getC().contains(x1)){
                //if(b9.equals(b1)) {
               // if(x1.equals(linhas)) {
                    //t1.show();
                  //  Toast.makeText(getBaseContext(), "Tente novamente 1",Toast.LENGTH_LONG).show();
                    // digA1.setText("");  //apaga
                    //digB1.setText(linha.get(0).getC());
                    //digC1.setText("");
                    //x1 = leitor.nextLine();

              //  }else{
                   // Toast.makeText(getBaseContext(), "Você Acertou 1",Toast.LENGTH_LONG).show();
                    // digB2.requestFocus();
                    // digB1.setText("-");
                    // digC1.setText("-");
                 //   va2.setText(">> B =  3 ** 3");
                
                */
				}        
                
}              