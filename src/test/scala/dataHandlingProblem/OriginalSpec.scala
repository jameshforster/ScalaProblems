package dataHandlingProblem

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike

class OriginalSpec extends Matchers with AnyWordSpecLike {

	val testDataModel: OriginalDataModel = OriginalDataModel(1, 100.01, 200)

	"Calling consume" should {

		"return the correct string" in {
			Consumer.consumeData(testDataModel) shouldBe "Message of id: 1 received with status: 200 and body: 100.01"
		}
	}
}
