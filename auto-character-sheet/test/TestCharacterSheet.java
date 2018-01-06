import org.junit.Test;
import static org.junit.Assert.*;

public class TestCharacterSheet {
	String name = "Manetherin";
    int Strength = 13;
	CharacterSheet manny = new CharacterSheet(name);

	@Test
	public void testGetCharacterName() {
		System.out.println("Character's name stored: ");
		assertEquals(manny.getCharacterName(), name);
	}

	@Test
	public void testSetCharacterName() {
		String newName = "Jonny";
		manny.setCharacterName(newName);
		System.out.println("Character's name changed: ");
		assertEquals(manny.getCharacterName(), newName);
	}

	@Test
	public void testGetStrengthAttribute() {
		manny.setStrength(Strength);
        assertEquals(manny.getStrength(), Strength);
    }
}
