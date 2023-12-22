package persona;

public enum CEFRLevel {
	A1,
	A2,
	B1,
	B2,
	C1,
	C2;

	public static CEFRLevel fromString(String level) {
		switch (level) {
			case "A1":
				return A1;
			case "A2":
				return A2;
			case "B1":
				return B1;
			case "B2":
				return B2;
			case "C1":
				return C1;
			case "C2":
				return C2;
			default:
				throw new IllegalArgumentException("Nivel de inglés no válido");
		}
	}
}
