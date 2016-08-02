/******************************
*
*
*
*
******************************/

public class Play{
	private boolean front;
	private boolean right;
	private Personaje player;
	private Desicion decidir;
	private boolean fin=false;

	public void Play(){
	}

	public void run(){
		int escoger=decidir.desicion();
		if(escoger==0)
			player.turnRight();
		else if(escoger==1){
			player.walk();
		else
			player.turnLeft();
		}
	}

	public void setFront(boolean front){
		this.front=front;
	}

	public void setRight(boolean right){
		this.right=right;
	}

	public void setFin(boolean fin){
		this.fin=fin;
	}

	public boolean getFront(){
		return front;
	}

	public boolean getRight(){
		return right;
	}

	public boolean getFin(){
		return fin;
	}

}


