package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import application.Taschenrechner;

class ParametrisierterTest {

	@ParameterizedTest
	@MethodSource("stringIntAndListProvider")
	void testWithMultiArgMethodSource(int p1, int p2, int result) {
		var tester = new Taschenrechner();
		assertEquals(result, tester.multipliziere(p1, p2));
	}

	static Stream<Arguments> stringIntAndListProvider() {
		return Stream.of(arguments(4, 5, 20),
				arguments(4,8,32));
	}

}
