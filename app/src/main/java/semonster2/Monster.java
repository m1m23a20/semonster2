public class Monster {
	String name;
	int rare; // 1:normal,2:uncommon,3:rare,4:ultra rare

	@Override
	public String toString() {
		return this.name + ":レア度[" + this.rare + "]";
	}
}
