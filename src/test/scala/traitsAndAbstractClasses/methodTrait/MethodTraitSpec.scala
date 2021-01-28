package traitsAndAbstractClasses.methodTrait

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike

class MethodTraitSpec extends Matchers with AnyWordSpecLike {

	"ErrorPrefixClass" should {
		"apply the correct prefix" in {
//			ErrorPrefixClass().prefixString("message") shouldBe "[ERROR] message"
		}

		"have a process message method that works correctly" in {
//			ErrorPrefixClass().processMessage("message") shouldBe "[ERROR] processed message of 'message'"
		}
	}

	"LogPrefixClass" should {
		"apply the correct prefix" in {
//			LogPrefixClass().prefixString("message") shouldBe "[LOG] message"
		}

		"have a process message method that works correctly" in {
//			LogPrefixClass().processMessage("message") shouldBe "[LOG] logging message of 'message'"
		}
	}
}
