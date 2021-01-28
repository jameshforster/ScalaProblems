package traitsAndAbstractClasses.methodTrait

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike

class MethodTraitSpec extends Matchers with AnyWordSpecLike {

	"ErrorPrefixClass" should {
		"apply the correct prefix" in {
			ErrorPrefixClass().prefixString("message") shouldBe "[ERROR] message"
		}
	}

	"LogPrefixClass" should {
		"apply the correct prefix" in {
			LogPrefixClass().prefixString("message") shouldBe "[LOG] message"
		}
	}
}
