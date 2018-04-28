class ep3_13 {
	private int money;

	ep3_13() {
		money = 2000;
	}

	private int getMoney() {
		return money;
	}

	public static void main(String args[]) {
		ep3_13 exa = new ep3_13();
		exa.money = 3000;
		int m = exa.getMoney();
		System.out.println("money=" + m);
	}
}