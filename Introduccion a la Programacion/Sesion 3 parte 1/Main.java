public class Main { 
    public static void main(String[] args) {
      // Potato miPotato = new Potato();
      // miPotato.QuitarBrazo();
      // miPotato.QuitarBrazo();
      // miPotato.QuitarBrazo();
      // System.out.println(miPotato.brazos);
     
      suma(1, 2);

    }
    
    public static int suma(int a, int b) {
        int resultado = a + b;
        System.out.println(resultado);

        return suma(a, resultado);

      // CALLBACK 
      // mivariable = funcion();
      // mivariable();

    }

  }

// class Potato {
//   public int brazos = 0;

//   public void QuitarBrazo() {
//     this.brazos--; 
//   }
// }

// Paso por valor : Duplica el tipo de valor, aumenta el consumo de memoria
// Paso por referencia: tiene ventaja en terminos de optmisacion. No aumenta el consumo de memoria.