package herencia;

class Producto1 {

	 class Producto {
			
			String NombreProd;
			int CantProd;
			double ProdPrecio;
			
			public Producto(String NombreProd, int CantProd,double ProdPrecio ) {
				
				this.NombreProd = NombreProd;
				this.CantProd = CantProd;
				this.ProdPrecio = ProdPrecio;
				
				
			}


				
		}

		  class itemCarrito extends Producto{
			  double ItemCPrecioTotal;
			  
			  public itemCarrito(String NombreProd, int CantProd,double ProdPrecio,double ItemCPrecioTotal ) {
				  super( NombreProd, CantProd,ProdPrecio);
				  this.ItemCPrecioTotal = ItemCPrecioTotal;
			  } 
		  } 
		  
		  class Descuento extends itemCarrito {
			  double DescuentoD;
			  
			  public Descuento(String NombreProd, int CantProd,double ProdPrecio,double ItemCPrecioTotal,double DescuentoD) {
				  super(NombreProd, CantProd,ProdPrecio, ItemCPrecioTotal);
				  this.DescuentoD = DescuentoD;
				  
			  }
			  
		  }
}
