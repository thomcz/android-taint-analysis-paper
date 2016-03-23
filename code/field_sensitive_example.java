void fieldSensitive() {
	Foo o = new Foo();@\label{field:o}@
	o.field1 = "123";@\label{field:f1}@
	o.field2 = source();@\label{field:f2}@
	
	sink(o.field1);@\label{field:sink}@
}

class Foo {
	String field1;
	String field2;
}
