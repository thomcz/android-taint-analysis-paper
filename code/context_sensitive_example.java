void contextSensitive() {
	String s1 = id(source());
	String s2 = id("123");
	sink(s2);
}

String id(String s) {
	return s;
}
