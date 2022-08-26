package test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({StringUtilityTest.class, Taschenrechnertest.class, ParameterTestJUnit4.class, ParametrisierterTest.class})
public class AlleTests {

}
