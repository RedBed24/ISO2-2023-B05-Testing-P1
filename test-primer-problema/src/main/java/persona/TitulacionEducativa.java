package persona;

public enum TitulacionEducativa {
	ESO,
	BACHILLERATO,
	FP,
	GRADO_MEDIO,
	GRADO_SUPERIOR,
	CARRERA,
	MASTER,
	DOCTORADO;

	public static TitulacionEducativa fromString(String titulacion) {
		switch (titulacion.toUpperCase()) {
			case "ESO":
				return ESO;
			case "BACHILLERATO":
				return BACHILLERATO;
			case "FP":
				return FP;
			case "GRADO_MEDIO":
				return GRADO_MEDIO;
			case "GRADO_SUPERIOR":
				return GRADO_SUPERIOR;
			case "CARRERA":
				return CARRERA;
			case "MASTER":
				return MASTER;
			case "DOCTORADO":
				return DOCTORADO;
			default:
				throw new IllegalArgumentException("Titulación educativa no válida");
		}
	}
}
