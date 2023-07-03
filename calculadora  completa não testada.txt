import java.until.scanner;

public class calculadora {

           public static double somar ( double a, doube b) {
               return a + b;
               }  
               
           public static double subtrair (double a, double b) {
               return a - b;
              }
              
           Public static double multiplicar (double a, double b) {
              return a * b;
              }
              
           Public static double dividir (double a, double b) {
              return a / b;
              }
              
            public static void exibirMenu() {
            system.out.print ("===Calculadora===);
            system.out.println ("Escolha a Operação");
            system.out.println("1. Somar");
            system.out.println ("2. subtrair");
            system.out.println ("3. multiplicar");
            system.out.println ("4. dividir");
            system.out.print ("0. sair");
            }
            
            public static void main (string[] args) {
            
            
            scanner entrada = new scanner  (system.in);
            boolean sair = false
            
            while (!sair) {
            exibir menu ();
            int opcao = entrada.nextint();
            
            switch (opcao) {
            case 1:
            system.out.print ("Digite o primeiro numero")
            double num1 = entrada.nextDouble();
            system.out.print ("Digite o segundo numero")
            double num2 = entrada.nextDouble();
            double resultadoSoma = somar (num1 , num2);
            ("Resultado: " + resultado soma);
                           break;
                           
            case 2: 
            system.out.print ("Digite o primeiro numero: ")
            double num3 = entrada.nextDouble();
            system.out.print = ("Digite o segundo numero: ")
            double num4 = entrada.nextDouble();
            double resultadosubtrair = subtrair (num3 , num4)
            ("Resultado: " + resultado subtracao);
                           break;
                           
            case 3:
            system.out.print ("Digite o primeiro numero: ")
            double num5 = entrada.nextDouble ();
            system.out.print = ("Digite o segundo numero: ")
            double num6 = entrada.nextDouble ();
            double resultadomultiplicar = multiplicar (num5 , num6)
            ("Resultado: " + resultado multiplicacao);
                           break;

            case 4:
            system.out.print ("Digite o primeiro numero: ")
            double num7 = entrada.nextDouble ();
            system.out.print ("Digite o segundo numero: ")
            double num8 = entrada.nextDouble ();
            double resultadodividir = dividir (num8 , num9)
            ("Resultado: " + resultado divisao);
                           break;

            case 0 
            sair = true;
            system.out.println ("Encerrar Calculadora.");
                           break;

            default:
            system.out.println ("Comando invalido. Tente Novamente.");
                           break;
                          }
                     } 
                     
                     entrada.close ();

                  }
          
         }         


                           
            
            
            