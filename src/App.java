import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Feriado[] feriados = new Feriado[11];

        CalendarioFeriado calendario = new CalendarioFeriado();

        Feriado feriado1 = new Feriado("01/01/2023", "Confraternização mundial");
        Feriado feriado2 = new Feriado("21/02/2023", "Carnaval");
        Feriado feriado3 = new Feriado("17/04/2023", "Páscoa");
        Feriado feriado4 = new Feriado("21/04/2023", "Tiradentes");
        Feriado feriado5 = new Feriado("01/05/2023", "Dia do trabalho");
        Feriado feriado6 = new Feriado("08/06/2023", "Corpus Christi");
        Feriado feriado7 = new Feriado("07/09/2023", "Independência do Brasil");
        Feriado feriado8 = new Feriado("12/10/2023", "Nossa Senhora Aparecida");
        Feriado feriado9 = new Feriado("02/11/2023", "Finados");
        Feriado feriado10 = new Feriado("15/11/2023", "Proclamação da República");
        Feriado feriado11 = new Feriado("25/12/2023", "Natal");
        
        feriados[0] = feriado1;
        feriados[1] = feriado2;
        feriados[2] = feriado3;
        feriados[3] = feriado4;
        feriados[4] = feriado5;
        feriados[5] = feriado6;
        feriados[6] = feriado7;
        feriados[7] = feriado8;
        feriados[8] = feriado9;
        feriados[9] = feriado10;
        feriados[10] = feriado11;   

        calendario.feriados = feriados;

        System.out.println("Digite 'feriados' para saber todos os feriados, ou digite 'data' para saber sobre um feriado específico: \n" );
        String resposta = scan.nextLine();

        if(resposta.equals("feriados")) {
            calendario.todosFeriados();
        } else if (resposta.equals("data")) {
            System.out.println("Digite uma data (xx/xx/xxxx): \n");
            String data = scan.nextLine();
            System.out.println(calendario.confirmaFeriado(data));
        } else {
            System.out.println("Então não sei o que você quer...");
        }


    }
}
