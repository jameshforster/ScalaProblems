package dataHandlingProblem

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike

class NewSpec extends Matchers with AnyWordSpecLike {

	val testDataModel: NewDataModel = NewDataModel(2, "200.02", "OK")

	"Calling consume" should {

		"return the correct string" in {
//			Consumer.consumeData(testDataModel) shouldBe "Message of id: 2 received with status: 200 and body: 200.02"
		}
	}
}
