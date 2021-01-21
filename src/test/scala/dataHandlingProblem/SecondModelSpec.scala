package dataHandlingProblem

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike

class SecondModelSpec extends Matchers with AnyWordSpecLike {

	val testDataModel: SecondDataModel = SecondDataModel(3, 400.04, dataBoolean = true, 200)

	"Calling consume" should {
		"return the correct string" in {
//			Consumer.consumeData(testDataModel) shouldBe "Message of id: 3 received with status: OK and body: Numeric: 400.04 and boolean: true"
		}
	}
}
