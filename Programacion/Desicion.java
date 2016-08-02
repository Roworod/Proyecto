/******************************
*
*
*
*
******************************/

public class Desicion{
	public int eleccion(boolean right, boolean front){
		if(right==true)
			return 0;
		else if(right==false && front==true)
			return 1;
		else 
			return 2;
	}

	public void desicion(){

	}
}