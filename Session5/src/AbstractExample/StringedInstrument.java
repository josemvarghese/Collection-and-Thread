package AbstractExample;

public class StringedInstrument extends Instrument {
	public int numberOfStrings=10;
	
	public void play() {
		
		System.out.println("Calling Play method from StringedInstrument class");
		System.out.println("numberOfStrings----(StringedInstrument class)"+numberOfStrings);

	}

}
