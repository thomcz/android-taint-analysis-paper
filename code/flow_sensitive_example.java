void flowSensitive() {
	String s = "value";@\label{flow:s}@
	sink(s);@\label{flow:sink}@
	s = source();@\label{flow:source}@
}
