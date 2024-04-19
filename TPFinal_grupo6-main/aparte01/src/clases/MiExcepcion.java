package clases;

class MiExcepcion extends Exception {
    /**
	 * esto ("private static final long serialVersionUID = 1L;") nose muy bien que es pero me slataba un warning y me recomendaba agregarlo
	 */
	private static final long serialVersionUID = 1L;

	public MiExcepcion(String mensaje) {
        super(mensaje);
    }
}