#Controle de notas

//importa a classe para o usuário poder inserir dados
import java.util.Scanner;
// cria a classe principal do código
public class Sala_de_aula {
    public static void main(String[] args){
        int i= 0;
        float nota_1[] = new float[3];
        float nota_2[] = new float[3];
        String nome[] = new String[3];
        while (i != 6) {
            System.out.println("Opcao 1: Adicionar nota aos alunos no primeiro semestre" + "\n" +
                                "Opcao 2: Adicionar nota aos alunos no segundo semestre" + "\n" +
                                "Opcao 3: Ver as notas do aluno requerido" + "\n" +
                                "Opcao 4: Calcular a media do aluno requerido" + "\n" +
                                "Opcao 5: Mostrar as notas dos dois semestres de todos os alunos da sala" + "\n" +
                                "Opcao 6: Sair");
            Scanner leitor = new Scanner(System.in);
            System.out.println("\nDigite o numero da opcao desejada");
            i = leitor.nextInt();

            if (i == 1){
                int b = 0;
                while (b<3) {
                    Scanner ler = new Scanner(System.in);
                    System.out.println("Digite o nome do aluno(a)");
                    String nomealuno = ler.next();
                    nome[b] = nomealuno;
                    System.out.println("Digite a nota deste aluno(a) no primeiro semestre");
                    float nota1sem = ler.nextFloat();
                    nota_1[b] = nota1sem;
                    System.out.println("\nNota no primeiro semestre do(a) aluno(a)" + "\t" + nome[b] + ":" + "\n" + nota_1[b] + "\n" + "Posicao:" + (b + 1) + "\n");
                    b++;
                }
            }if (i == 2) {
                int o = 0;
                while (o<3){
                    Scanner ler = new Scanner(System.in);
                    System.out.println("Digite a nota do aluno(a) que tem a posicao:" + (o+1));
                    float nota2sem = ler.nextFloat();
                    nota_2[o] = nota2sem;
                    System.out.println("\nNota no segundo semestre do(a) aluno(a)" + "\t" + nome[o] + ":" + "\n" + nota_2[o] + "\n" + "Posicao:" + (o + 1)+ "\n");
                    o++;
                }

            }if (i == 3){
                Scanner ler = new Scanner(System.in);
                System.out.println("Digite a posicao do aluno(a) cujo deseja ver as notas ");
                int ver = ler.nextInt();
                System.out.println("A notas do aluno(a)"+ "\t" + nome[ver-1] + "\tsao:" + "\tPrimeiro semestre nota\t" + nota_1[ver-1] + "\te segundo semestre nota\t" + nota_2[ver-1]+ "\n");
            }if (i ==4){
                Scanner ler = new Scanner(System.in);
                System.out.println("Digite a posicao do aluno(a) cujo qual deseja saber a media");
                int media = ler.nextInt();
                float somanota = (nota_1[media-1] + nota_2[media-1])/2;
                System.out.println("A media do aluno(a)\t" + nome[media-1] + "\té:\t" + somanota + "\n" );
            }if (i ==5){
                int r = 0;
                System.out.println("Semestre:"+ (r+1)+"\n");
                for (int y =0;y<3;y++){
                    System.out.println("Aluno:\t" + nome[y] + "\t" + "\tnota:\t" + nota_1[y] +"\n"); }
                System.out.println("Semestre:"+ (r+2)+"\n");
                for (int d =0;d<3;d++){
                    System.out.println("Aluno:\t" + nome[d] + "\t" + "\tnota:\t" + nota_2[d] +"\n"); }
            }
        }
    }
}
