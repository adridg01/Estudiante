import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Estudiante[] compararEstudiantes =new Estudiante[5];

        Estudiante e1 = new Estudiante("patri", 12, 170);
        Estudiante e2 = new Estudiante("manuel", 43, 173);
        Estudiante e3 = new Estudiante("javier", 72, 189);
        Estudiante e4 = new Estudiante("Alicia", 52, 168);
        Estudiante e5 = new Estudiante("Alberto", 35, 189);
        compararEstudiantes[0]=e1;
        compararEstudiantes[1]=e2;
        compararEstudiantes[2]=e3;
        compararEstudiantes[3]=e4;
        compararEstudiantes[4]=e5;

        System.out.println("sin ordenar");
        for (int i= 0; i < compararEstudiantes.length; i++){
            System.out.println(compararEstudiantes[i].toString());
        }
        System.out.println();
        Arrays.sort(compararEstudiantes);
        System.out.println("ordenados");
        for (int i = 0; i < compararEstudiantes.length; i++){
            System.out.println(compararEstudiantes[i].toString());
        }
    }
}