package tp5;

public class itemCarrito extends Producto {
	
double ItemCPrecTotal; 
    
    // CONSTRUCTOR
        public itemCarrito(String ProdNombre, int ProdCantidad, double ProdPrecio, double ItemCPrecTotal){

        super(ProdNombre, ProdCantidad, ProdPrecio);  
        this.ItemCPrecTotal =  ItemCPrecTotal;  		   
    }

}


