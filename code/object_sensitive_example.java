void objectSensitive() {
	Foo o1 = new Foo();
	Foo o2 = new Foo();
	o1.value = "123";@\label{object:o1}@
	o2.value = source();@\label{object:o2}@

	sink(o1.getValue());@\label{object:sink}@
}

class Foo {
	String value;
	
	String getValue() {
		return value;
	}
}
