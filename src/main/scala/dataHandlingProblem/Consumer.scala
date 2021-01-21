package dataHandlingProblem

object Consumer {

	def consumeData(dataModel: OriginalDataModel): String = {
		s"Message of id: ${dataModel.id} received with status: ${dataModel.response} and body: ${dataModel.data}"
	}
}
