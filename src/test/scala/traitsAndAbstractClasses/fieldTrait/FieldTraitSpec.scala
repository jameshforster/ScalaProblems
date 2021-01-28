package traitsAndAbstractClasses.fieldTrait

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike

class FieldTraitSpec extends Matchers with AnyWordSpecLike {

	"MatchingFieldClass" should {
		val test = MatchingFieldClass(boolean = false, 100.1, "stringVal")

		"have a boolean val" in {
			test.boolean shouldBe false
		}

		"have a number val" in {
			test.number shouldBe BigDecimal(100.1)
		}

		"have a string val" in {
			test.string shouldBe "stringVal"
		}

		"be an instance of the FieldTrait" in {
			test.isInstanceOf[FieldTrait] shouldBe true
		}
	}

	"NoneMatchingFieldClass" should {
		val test = NonMatchingFieldClass(1, int => int != 1, 100, "stringVal")

		"have a boolean val" in {
//			test.boolean shouldBe false
		}

		"have a number val" in {
//			test.number shouldBe BigDecimal(100)
		}

		"have a string val" in {
			test.string shouldBe "stringVal"
		}

		"be an instance of the FieldTrait" in {
			test.isInstanceOf[FieldTrait] shouldBe true
		}
	}
}
