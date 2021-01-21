package dataHandlingProblem

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike

class FirstModelSpec extends Matchers with AnyWordSpecLike {

	val testDataModel: FirstDataModel = FirstDataModel(1, "Numeric: 200.02 and boolean: false", "OK")

	"Calling consume" should {
		"return the correct string" in {
			Consumer.consumeData(testDataModel) shouldBe "Message of id: 1 received with status: OK and body: Numeric: 200.02 and boolean: false"
		}
	}
}
