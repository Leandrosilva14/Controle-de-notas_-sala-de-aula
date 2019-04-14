# Controle de notas_sala de aula
``` java
//Importa a classe Scanner para o usuário poder inserir dados

import java.util.Scanner;

//Cria a classe principal do código

public class Sala_de_aula< {
    public static void main(String[] args){  
        int i= 0;
        //Cria o vetor com o número de notas por aluno a ser inserido no primeiro semestre
        float nota_1[] = new float[15];
        //Cria o vetor com o número de notas por aluno a ser inserido no segundo semestre
        float nota_2[] = new float[15];
        //Cria o vetor com o número de alunos a serem inseridos
        String nome[] = new String[15];
        
        //Começa o laço de repetição para aparecer sempre que o usuário terminar uma ação e não escolher a opção nº 6
        while (i != 6) {
            System.out.println("Opcao 1: Adicionar nota aos alunos no primeiro semestre" + "\n" +
                                "Opcao 2: Adicionar nota aos alunos no segundo semestre" + "\n" +
                                "Opcao 3: Ver as notas do aluno requerido" + "\n" +
                                "Opcao 4: Calcular a media do aluno requerido" + "\n" +
                                "Opcao 5: Mostrar as notas dos dois semestres de todos os alunos da sala" + "\n" +
                                "Opcao 6: Sair");
            // Esta parte faz com que possa ser inserido dados com o Scanner                   
            Scanner leitor = new Scanner(System.in);
            System.out.println("\nDigite o numero da opcao desejada");
            // O dado pego pelo leitor é armazenado na variável i
            i = leitor.nextInt();
            
            // Se a opção digitada pelo usuário for 1, ele irá cair nessa etapa do programa
            if (i == 1){
            // Contador de voltas
                int b = 0;
                // Laço de repetição para poder adicionar os dados dos 15 alunos 
                while (b<15) {
                    Scanner ler = new Scanner(System.in);
                    System.out.println("Digite o nome do aluno(a)");
                    // Pega o nome dado pelo usuário
                    String nomealuno = ler.next();
                    // Armazena o nome inserido no vetor de nomes na posição que está o contador
                    nome[b] = nomealuno;
                    System.out.println("Digite a nota deste aluno(a) no primeiro semestre");
                    // Pega a nota do primeiro semestre 
                    float nota1sem = ler.nextFloat();
                    // Armazena a nota inserida no vetor de notas do primeiro semestre na posição que está o contador
                    nota_1[b] = nota1sem;
                    // imprime a confirmação dos dados inseridos do aluno e a sua posição
                    System.out.println("\nNota no primeiro semestre do(a) aluno(a)" + "\t" + nome[b] + ":" + "\n" + nota_1[b] + "\n" + "Posicao:" + (b + 1) + "\n");
                    b++;
                }
                
            // Se a opção digitada pelo usuário for 2, ele irá cair nessa etapa do programa
            }if (i == 2) {
            //Contador de voltas
                int o = 0;
                // Laço de repetição para poder adicionar a nota do segundo semestre para os 15 alunos
                while (o<15){
                    Scanner ler = new Scanner(System.in);
                    // Solicita a nota do aluno referente ao primeiro aluno cadastrado
                    System.out.println("Digite a nota do aluno(a) que tem a posicao:" + (o+1));
                    // Pega a nota digitada
                    float nota2sem = ler.nextFloat();
                    // Armazena essa nota no vetor de notas do segundo semestre do aluno da posição que está o contador de voltas
                    nota_2[o] = nota2sem;
                    // Imprime a confirmação da nota do aluno e sua posição
                    System.out.println("\nNota no segundo semestre do(a) aluno(a)" + "\t" + nome[o] + ":" + "\n" + nota_2[o] + "\n" + "Posicao:" + (o + 1)+ "\n");
                    o++;
                }
                
            // Se a opção digitada pelo usuário for 3, ele irá cair nessa etapa do programa
            }if (i == 3){
                Scanner ler = new Scanner(System.in);
                // Solicita a posição do aluno cujo qual deseja ver as notas
                System.out.println("Digite a posicao do aluno(a) cujo deseja ver as notas ");
                // Pega a posição inserida
                int ver = ler.nextInt();
                // Imprime as notas do primeiro e segundo semestre respectivamente do aluno da posição inserida
                System.out.println("A notas do aluno(a)"+ "\t" + nome[ver-1] + "\tsao:" + "\tPrimeiro semestre nota\t" + nota_1[ver-1] + "\te segundo semestre nota\t" + nota_2[ver-1]+ "\n");
                
            // Se a opção digitada pelo usuário for 4, ele irá cair nessa etapa do programa
            }if (i ==4){
                Scanner ler = new Scanner(System.in);
                // Solicita a posição do aluno para o cálculo de sua média
                System.out.println("Digite a posicao do aluno(a) cujo qual deseja saber a media");
                // Pega a posição do aluno para o cálculo
                int media = ler.nextInt();
                // Soma as notas do primeiro e segundo semestre do aluno requerido e divide pelo número de semestres,ou seja, 2
                float somanota = (nota_1[media-1] + nota_2[media-1])/2;
                // Imprime a média do aluno
                System.out.println("A media do aluno(a)\t" + nome[media-1] + "\té:\t" + somanota + "\n" );
                
            // Se a opção digitada pelo usuário for 5, ele irá cair nessa etapa do programa    
            }if (i ==5){
                // Contador de voltas
                int r = 0;
                // Imprime o primeiro semestre
                System.out.println("Semestre:"+ (r+1)+"\n");
                // faz um laço de repetição para imprimir a nota de todos os alunos da sala no primeiro semestre, criando uma mátriz
                for (int y =0;y<15;y++){
                // Imprime as notas
                    System.out.println("Aluno:\t" + nome[y] + "\t" + "\tnota:\t" + nota_1[y] +"\n"); }
                // Imprime o segundo semestre
                System.out.println("Semestre:"+ (r+2)+"\n");
                // faz um laço de repetição para imprimir a nota de todos os alunos da sala no segundo semestre, criando uma mátriz
                for (int d =0;d<15;d++){
                // Imprime as notas
                    System.out.println("Aluno:\t" + nome[d] + "\t" + "\tnota:\t" + nota_2[d] +"\n"); }
            }
        }
    }
}
