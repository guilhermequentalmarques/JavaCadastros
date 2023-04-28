//import java.util.Date;
//import java.util.Scanner;
//
//public class CadastroColaborador {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//
//            System.out.print("Digite o nome do colaborador: ");
//            String nome = sc.nextLine();
//
//            System.out.print("Digite o CPF do colaborador: ");
//            String cpf = sc.nextLine();
//
//            System.out.print("Digite o telefone do colaborador: ");
//            String telefone = sc.nextLine();
//
//            System.out.print("Digite a data de nascimento do colaborador: ");
//            String dataNascimento = sc.nextLine();
//
//            System.out.print("Digite a data de agendamento do colaborador: ");
//            String dataAgendamento = sc.nextLine();
//
//            System.out.print("Digite o período (manhã, tarde ou noite): ");
//            char periodo = sc.nextLine();
//
//            Pessoa colaborador = new Pessoa(nome, cpf, telefone, dataNascimento, dataAgendamento, periodo);
//
//            System.out.println("\nColaborador cadastrado com sucesso:");
//            System.out.println("Nome: " + colaborador.getNome());
//            System.out.println("CPF: " + colaborador.getCPF());
//            System.out.println("Telefone: " + colaborador.getTelefone());
//            System.out.println("Data de Nascimento: " + colaborador.getDataNascimento());
//            System.out.println("Data de Agendamento: " + colaborador.getDataAgendamento());
//            System.out.println("Período: " + colaborador.getPeriodo());
//
//            sc.close();
//        }
//    }
//
//}
