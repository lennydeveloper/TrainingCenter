import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        // casos de prueba
        byte t = in.nextByte();

        // Obtener n && m
        String nm = sc.nextLine();
        String[] splitter = nm.split(" ");
        // número de candidatos
        byte n = Byte.parseByte(splitter[0]);
        // número de ciudades
        byte m = Byte.parseByte(splitter[1]);

        // Capturar el nombre de los presidentes
        String presidents = sc.nextLine();
        String number_votes = "";

        while(m-- > 0) {
            // Capturar el número de votos
            number_votes += sc.nextLine();
            number_votes += " ";
        }

        number_votes.substring(0, number_votes.length() - 1);

        // Split de votos
        String[] votos = number_votes.split(" ");

        // Split de presidentes
        String[] presidentes = presidents.split(" ");

        Integer[] total_votos = new Integer[n];
        // Inicializar el vector con 0
        Arrays.fill(total_votos, 0);
        int contador = 0;

        // Calcular el resultado
        for (int i = 0; i < votos.length; i++) {
            if (contador >= n) contador = 0;
            total_votos[contador] += Integer.parseInt(votos[i]);
            contador++;
        }

        // posición del ganador
        int pos = Arrays.asList(total_votos).indexOf(Collections.max(Arrays.asList(total_votos)));
        out.println(presidentes[pos]);
        out.close();
    }
}
