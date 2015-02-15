package ch01;
// this class will not compile. For more info Refer page 19
// since the Beverage class is not public and it is in different package(ch01.cert) the Tea class can't access it.
import ch01.cert.Beverage;
class Tea extends Beverage{}
/*
ch01\Tea.java:3: error: Beverage is not public in ch01.cert; cannot be accessed
from outside package
import ch01.cert.Beverage;
				^
ch01\Tea.java:4: error: cannot find symbol
class Tea extends Beverage{}
				  ^
  symbol: class Beverage
2 errors

*/