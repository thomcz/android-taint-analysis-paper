void contextSensitive() {
	String s1 = id(source());@\label{context:s1}@
	String s2 = id("123");@\label{context:s2}@
	sink(s2);@\label{context:sink}@
}

String id(String s) {
	return s;
}
