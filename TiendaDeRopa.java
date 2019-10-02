
package tiendaderopa;

public class TiendaDeRopa {

    private boolean venderRopa;
    private int caja;

    public TiendaDeRopa(boolean venderRopa, int pagarIva) {
        this.venderRopa = venderRopa;
        this.caja = caja;
    }
    
    public void clientes(){
        venderRopa = true;
    }
    
    public void ganancia(){
        caja += 10000;
    }
    
    public void ganancia(int nuevasGanancias){
        if(nuevasGanancias<=this.caja){
            System.out.println("No se tiene ganancias por la venta");
        }else{
            this.caja = nuevasGanancias;
            System.out.println("La ganancia en esta venta fue de" + 
                    String.valueOf(nuevasGanancias) + "dólares");
            }
        }
}
