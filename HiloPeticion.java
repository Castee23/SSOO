import ssoo.telemetría.estación.Petición;

public class HiloPeticion implements Runnable{
	private final Petición peticion;
	private final int id;
	
	public HiloPeticion(Petición peticion, int id) {
		this.peticion = peticion;
		this.id = id;
	}
	 @Override
	 public void run() {
		 try {
			System.out.println("[Hilo peticion " + id +"] Empiezo");
			System.out.println("[Hilo peticion " + id +"] He recibido una peticion: Nombre de la estacion: " + id + ", Telemetrias del encargo: " + peticion.getEncargo().getTelemetrías());
			System.out.println("[Hilo de peticion " + id + "] Encargo: " + peticion.getEncargo().getTítulo());
			Thread.sleep(5000);
			System.out.println("[Hilo de peticion "+ id + "] Termino"); 
		 }catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}