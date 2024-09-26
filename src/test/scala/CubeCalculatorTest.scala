import org.scalatest.funsuite.AnyFunSuite
class CubeCalculatorTest extends AnyFunSuite:
  test("CubeCalculator.cube"){
    assert(CubeCalculator.cube(3) !== 26)
  }
  test("CubeCalculator.cube 2") {
    assert(CubeCalculator.cube(3) === 27)
  }
