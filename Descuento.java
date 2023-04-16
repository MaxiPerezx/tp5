package tp5;

public class Descuento extends itemCarrito {
	
	   double DescuentoDesc;  

	    // CONTRUCTOR
	    
	    public Descuento(String ProdNombre, int ProdCantidad, double ProdPrecio, double ItemCPrecTotal, double DescuentoDesc){
	        super(ProdNombre,ProdCantidad,ProdPrecio,ItemCPrecTotal);
	        this.DescuentoDesc = DescuentoDesc;
	    }

}
