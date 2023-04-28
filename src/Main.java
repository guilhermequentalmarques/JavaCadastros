import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pessoa> colaboradores = new ArrayList<>();
        try {


            System.out.println("Quantas pessoas deseja cadastrar");
            int nmr = sc.nextInt();
            int i;

            for (i = 0; i < nmr; i++) {
                System.out.print("Digite o nome do colaborador: ");
                String nome = sc.nextLine();

                System.out.print("Digite o CPF do colaborador: ");
                String cpf = sc.nextLine();

                System.out.print("Digite o telefone do colaborador: ");
                String telefone = sc.nextLine();

                System.out.print("Digite a data de nascimento do colaborador: ");
                String dataNascimento = sc.nextLine();

                System.out.print("Digite a data de agendamento do colaborador: ");
                String dataAgendamento = sc.nextLine();

                System.out.print("Digite o período (<M>anhã, <T>arde ou <N>oite): ");
                String periodo = sc.nextLine();

                Pessoa colaborador = new Pessoa(nome, cpf, telefone, dataNascimento, dataAgendamento, periodo);

                colaboradores.add(colaborador);

                sc.close();
            }
            System.out.println("Lista de Colaboradores \n" + colaboradores);
        } catch (InputMismatchException ex){
            System.out.println("Rote o programa novamente e passe um numero não String " + ex);
        }
    }
}