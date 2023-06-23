import com.sun.source.tree.BreakTree;
import org.jetbrains.annotations.NotNull;

public class Estudiante implements Comparable<Estudiante> {
   protected String nombre;
   protected int edad;
   protected double altura;

public Estudiante (String nombre, int edad, double altura){
       this.nombre=nombre;
       this.edad=edad;
       this.altura=altura;
   }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Estudiante"+" " + "nombre=" + nombre + '\''+ ", edad=" + edad + ", altura=" + altura;
    }
    @Override
    public int compareTo(Estudiante x) {
    int resultado=0;
     if (getAltura()<x.getAltura()){
         resultado=1;
     } else if (getAltura()>x.getAltura()) {
         resultado=-1;
     }else if ( getEdad()<x.getEdad()){
         resultado=1;
     } else if (getEdad()>x.getEdad()) {
         resultado=-1;
     }
     else
         resultado=0;
     return resultado;
    }
}
