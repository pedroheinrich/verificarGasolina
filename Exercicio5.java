public class Exercicio5 {

    /* Crie um programa para ler a quantidade de litros de combustível e a
    distância percorrida por um carro em várias viagens. O programa deve
    calcular o consumo médio do carro, que é igual a média de quilômetros
    por litro de todas as viagens */
    public static void main(String[] args) {
        
        double 
        qtdAtualGasolina, 
        qtdAtualGasolina2, 
        consumoGasolina, 
        limiteTanqueGasolina, 
        kmPorLitro, 
        limiteDeViagens, 
        distancia, 
        km;

        int resp;
        
        // viagem
        km = 1;
        

        // carro
        limiteTanqueGasolina = 65; // litros
        consumoGasolina = 13.5; // km por litro 
        qtdAtualGasolina = 0; //quantidade de gasolina no tanque
        
        // iniciando viagem
        System.out.println("--------------------------------------\n");
        System.out.println("Ligar o carro? \n");
        System.out.println(1 + " - Sim " + "/ " + 2 + " - Não");
        resp = Integer.parseInt(System.console().readLine());
        // validando a quantidade de viagens e total de gasolina no tanque
        if(resp == 1){
            System.out.println("Ligando o carro... \n");
            System.out.println("Verificando a gasolina! \n");
            if(qtdAtualGasolina == 0){
                System.out.println("Sem gasolina, você deve abastecer!!!!\n");
                System.out.println("Quantos litros você quer abastecer? \n");
                System.out.printf("O limite do tanque atual é :  %.1f litros\n", limiteTanqueGasolina);
                qtdAtualGasolina = Double.parseDouble(System.console().readLine());
                System.out.printf("Quantidade atual de gasolina é %.1f litros \n", qtdAtualGasolina); 
                kmPorLitro = consumoGasolina * qtdAtualGasolina;
                System.out.printf("Você consegue viajar %.1f quilômetros antes de ter que abastecer novamente. \n", kmPorLitro); 
                if(qtdAtualGasolina < limiteTanqueGasolina){
                        double praCompletar = limiteTanqueGasolina - qtdAtualGasolina;
                        System.out.printf("Você ainda pode completar o tanque com %.1f litros \n", praCompletar);
                        System.out.println("Você quer abastecer mais? \n");
                        System.out.println(1 + " - Sim " + "/ " + 2 + " - Não");
                        resp = Integer.parseInt(System.console().readLine());
                        if(resp == 1){
                            System.out.println("Quantos litros você quer abastecer? \n");
                            System.out.printf("Você só pode abastecer %.1f litros\n", praCompletar);
                            qtdAtualGasolina2 = Double.parseDouble(System.console().readLine());
                            qtdAtualGasolina = qtdAtualGasolina + qtdAtualGasolina2;
                            if(qtdAtualGasolina > limiteTanqueGasolina){
                                System.out.println("Quantidade ultrapassa o limite do tanque! \n");
                                
                            }else{
                                System.out.printf("Quantidade atual de gasolina é %.1f litros \n", qtdAtualGasolina); 
                                kmPorLitro = consumoGasolina * qtdAtualGasolina;
                                System.out.printf("Você consegue viajar %.1f quilômetros antes de ter que abastecer novamente \n", kmPorLitro);
                            }                                                     
                        }else{
                            System.out.println("Seguindo viagem!! \n");
                        }
                    }
            }
        }else{
            System.out.println("Carro desligado! \n");
        }  
        
    }
}





