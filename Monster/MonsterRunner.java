
public class MonsterRunner {

	public static void main(String[] args) {
		Monster monsterOne = new Monster("Mack",50);
		Monster monsterTwo = new Monster("ckaM",100);
		
		System.out.println(monsterOne);
		System.out.println(monsterTwo);
		System.out.println(monsterOne.isSmaller(monsterTwo));
	}
}
