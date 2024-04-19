package clases;
import java.util.LinkedList;
import java.util.Queue;

public class ColaChofer {
	Queue<Chofer> colaChofer;

	public ColaChofer() {
		super();
		this.colaChofer = new LinkedList<>();
	}
	
	public void setChofer(Chofer chofer){
		this.colaChofer.add(chofer);
	}
	public Chofer getChofer(){
		return this.colaChofer.poll();
	}
}
