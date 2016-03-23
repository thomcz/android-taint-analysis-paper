void objectSensitive() {
	Foo o1 = new Foo();
	Foo o2 = new Foo();
	o1.value = "123";
	o2.value = source();

	sink(o1.getValue());
}

class Foo {
	String value;
	
	String getValue() {
		return value;
	}
}
