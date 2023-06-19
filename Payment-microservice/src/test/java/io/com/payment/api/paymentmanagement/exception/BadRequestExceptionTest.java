package io.com.payment.api.paymentmanagement.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.com.payment.api.paymentmanagement.exception.BadRequestException;

public class BadRequestExceptionTest {

	@Test
	public void testBadRequestException() {
		String errorMessage = "Bad request";
		BadRequestException badRequestException = new BadRequestException(errorMessage);
		assertEquals(errorMessage, badRequestException.getMessage());
	}
}
