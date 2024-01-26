
import java.time.Year;
public class ListagemClientes {
    public static void main(String[] args) {

         String nomeCliente1 = "Fulano";
         int anoNascimentoCliente1 = 1980;

         String nomeCliente2 = "Sicrano";
         int anoNascimentoCliente2 = 2000;


        //Cálculo da idade

        int idadeCliente1 = calcularIdade(anoNascimentoCliente1);
        int idadeCliente2 = calcularIdade(anoNascimentoCliente2);

        //Característica Etária

        String caracteristicaCliente1 = getCaracteristicaEtaria(idadeCliente1);
        String caracteristicaCliente2 = getCaracteristicaEtaria(idadeCliente2);


        //Listagem dos Clientes

        System.out.println(">>> Listagem de Clientes");
        System.out.println("___________________________________________");
        System.out.println("Nome : " + nomeCliente1);
        System.out.println("Data de nascimento " + anoNascimentoCliente1);
        System.out.println("Idade: " + idadeCliente1);
        System.out.println("Característica Etária: " + caracteristicaCliente1);
        System.out.println("___________________________________________");
        System.out.println("Nome : " + nomeCliente2);
        System.out.println("Data de nascimento " + anoNascimentoCliente2);
        System.out.println("Idade: " + idadeCliente2);
        System.out.println("Característica Etária: " + caracteristicaCliente2);
    }

    //metodo para calcular a idade do cliente
        public static int calcularIdade(int anoNascimento) {
            // traz o ano atual
            int anoAtual = Year.now().getValue();
            // retorna a idade
            return anoAtual - anoNascimento;
        }


        //metodo para característica etaria do cliente
        private static String getCaracteristicaEtaria(int idade) {

            if (idade <= 17){
                return "ADOLESCENTE";
            }else if (idade >= 18 && idade <=29){
                return "JOVEM";
            }else if (idade >=30 && idade <=59){
                return "ADULTO";
            }else {
                return "IDOSO";
            }

        }


    }




