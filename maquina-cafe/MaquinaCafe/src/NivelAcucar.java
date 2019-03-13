import java.util.Scanner;

public  class  NivelAcucar {
     int nivelAcucar = 3;
     String regulouAcucar;

     public String alteraAcucar(int escolha, Opcao opcaoEscolhida) {
         if (escolha == 5) {
             System.out.println("Você selecionou a opção " + opcaoEscolhida.descricao);
             if (opcaoEscolhida.valor == 0) {
                 System.out.println("Essa opção é gratuita.");
                 // mostra preparo
             }
         }


         if (escolha != 5) {
             System.out.println("Você escolheu " + opcaoEscolhida.descricao + ". O nível de açúcar da sua bebida é 3. Deseja alterar? Digite 1 para sim e 2 para não");
             Scanner mudaAcucar = new Scanner(System.in);
             int alteraAcucar = mudaAcucar.nextInt();

             if (alteraAcucar == 1) {
                 System.out.println("Para alterar o nível de açúcar, digite um número de 0 a 5, sendo 0 zero açúcar e 5 o máximo de açúcar");
                 Scanner quantidadeAcucar = new Scanner(System.in);
                 nivelAcucar = quantidadeAcucar.nextInt();
                 if (nivelAcucar >= 0 && nivelAcucar <= 5) {
                     System.out.println("Você pediu um " + opcaoEscolhida.descricao + (" e o nível de açúcar dele é: " + nivelAcucar));
                 } else {
                     System.out.println("Opção inválida. A bebida será feita com o nível de açúcar 3.");
                     nivelAcucar = 3;
                 }


             } else {
                 System.out.println("Você pediu um " + opcaoEscolhida.descricao + (" e o nível de açúcar dele é: " + nivelAcucar));
             }

         } else {
             // return modo de preparo água.
         }
         return regulouAcucar;
     }
}


