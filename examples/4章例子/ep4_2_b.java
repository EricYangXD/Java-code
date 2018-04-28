class ep4_2_b extends ep4_2_a {
	int n;

	float f() {
		float c;
		super.n = n;
		c = super.f();
		return c / n;
	}

	float g() {
		float c;
		c = super.f();
		return c / 2;
	}
}