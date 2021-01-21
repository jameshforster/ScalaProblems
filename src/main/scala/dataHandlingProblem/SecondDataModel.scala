package dataHandlingProblem

case class SecondDataModel(id: Int, dataNumeric: BigDecimal, dataBoolean: Boolean, response: Int) {
	val responseAsString: String = response match {
		case 200 => "OK"
		case 404 => "Not Found"
		case _ => "Internal Server Error"
	}
}
