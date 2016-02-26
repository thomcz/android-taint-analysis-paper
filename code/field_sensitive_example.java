void fieldSensitive() {
	Foo o = new Foo();
	o.field1 = “123“;
	o.field2 = source();
	
	sink(o.field1);
}

class Foo {
	String field1;
	String field2;
}
