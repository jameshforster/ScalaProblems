package traitsAndAbstractClasses.sealedTrait

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike
import traitsAndAbstractClasses.Consumer

class SealedTraitSpec extends Matchers with AnyWordSpecLike {

	"Return trait type" should {

		"return the correct string" when {

			"provided with ItemOne" in {
//				Consumer.returnTraitType(ItemOne("String")) shouldBe "Item One with String"
			}

			"provided with ItemTwo" in {
//				Consumer.returnTraitType(ItemTwo(false)) shouldBe "Item Two with false"
			}

			"provided with ItemThree" in {
//				Consumer.returnTraitType(ItemThree(1)) shouldBe "Item Three with 1"
			}
		}
	}
}
