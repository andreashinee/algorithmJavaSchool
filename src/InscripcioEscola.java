import java.util.Scanner;

public class InscripcioEscola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inscripció a l'escola.");

        System.out.println("Siusplau, introdueix el número de registre del nen: ");
        int registre = scanner.nextInt();

        scanner.nextLine();

        int punts = 0;

        String germans;
        while (true) {
            System.out.print("Té almenys un germà al centre? (0: no / 1:si): ");
            germans = scanner.nextLine().toLowerCase();
            if (germans.equals("si") || germans.equals("1")) {
                punts += 40;
                break;
            } else if (germans.equals("no") || germans.equals("0")) {
                break;
            } else {
                System.out.println("Resposta invàlida. Si us plau, introdueix (0: no / 1:si) .");
            }
        }

        String poblacio;
        while (true) {
            System.out.print("Viu a la mateixa població? (0: no / 1:si): ");
            poblacio = scanner.nextLine().toLowerCase();
            if (poblacio.equals("si") || poblacio.equals("1")) {
                punts += 30;
                break;
            } else if (poblacio.equals("no") || poblacio.equals("0")) {
                break;
            } else {
                System.out.println("Resposta invàlida. Si us plau, introdueix (0: no / 1:si).");
            }
        }

        String treball;
        while (true) {
            System.out.print("El pare o mare treballa a la mateixa població? (0: no / 1:si): ");
            treball = scanner.nextLine().toLowerCase();
            if (treball.equals("si") || treball.equals("1")) {
                punts += 20;
                break;
            } else if (treball.equals("no") || treball.equals("0")) {
                break;
            } else {
                System.out.println("Resposta invàlida. Si us plau, introdueix (0: no / 1:si).");
            }
        }


        String discapacitat;
        while (true) {
            System.out.print("Té alguna discapacitat igual o superior al 33% o malaltia crònica? (0: no / 1:si): ");
            discapacitat = scanner.nextLine().toLowerCase();
            if (discapacitat.equals("si") || discapacitat.equals("1")) {
                punts += 10;
                break;
            } else if (discapacitat.equals("no") || discapacitat.equals("0")) {
                break;
            } else {
                System.out.println("Resposta invàlida. Si us plau, introdueix (0: no / 1:si).");
            }
        }

        String familiaNombrosa;
        while (true) {
            System.out.print("És part d'una família nombrosa o monoparental? (0: no / 1:si):");
            familiaNombrosa = scanner.nextLine().toLowerCase();
            if (familiaNombrosa.equals("si") || familiaNombrosa.equals("1")) {
                punts += 15;
                break;
            } else if (familiaNombrosa.equals("no") || familiaNombrosa.equals("0")) {
                break;
            } else {
                System.out.println("Resposta invàlida. Si us plau, introdueix (0: no / 1:si).");
            }
        }

        String familiarEscola;
        while (true) {
            System.out.print("El pare, mare, tutor legal o germà ha estat escolaritzat a la mateixa escola? (0: no / 1:si):");
            familiarEscola = scanner.nextLine().toLowerCase();
            if (familiarEscola.equals("si") || familiarEscola.equals("1")) {
                punts += 5;
                break;
            } else if (familiarEscola.equals("no") || familiarEscola.equals("0")) {
                break;
            } else {
                System.out.println("Resposta invàlida. Si us plau, introdueix (0: no / 1:si).");
            }
        }

        System.out.println("Puntuació final del nen amb número de registre " + registre + " : " + punts + " punts.");


        scanner.close();
    }
}
