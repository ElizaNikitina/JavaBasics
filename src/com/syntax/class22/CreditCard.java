package com.syntax.class22;

public class CreditCard {
	double balance, interest;

	double getInterset() {

		interest = balance * 0.4;

		return interest;
	}
}

class Visa extends CreditCard {
	@Override
	double getInterset() {
		interest = balance * 0.6;
		return interest;
	}

}

class AX extends CreditCard {
	@Override
	double getInterset() {

		interest = balance * 0.7;

		return interest;
	}

}