package persona;

public enum Nacionalidad {
	PORTUGUES,
	ESPANOL,
	FRANCES,
	ITALIANO,
	JAPONES,
	CHINO,
	RUSO,
	COREANO,
	INDU;

	public static Nacionalidad fromString(String nacionalidad) {
		switch (nacionalidad.toLowerCase()) {
			case "portugues":
				return PORTUGUES;
			case "espanol":
				return ESPANOL;
			case "frances":
				return FRANCES;
			case "italiano":
				return ITALIANO;
			case "japones":
				return JAPONES;
			case "chino":
				return CHINO;
			case "ruso":
				return RUSO;
			case "coreano":
				return COREANO;
			case "indu":
				return INDU;
			default:
				throw new IllegalArgumentException("Nacionalidad no válida");
		}
	}
}
