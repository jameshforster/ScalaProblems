package dataHandlingProblem

object Consumer {

	def consumeData(dataModel: FirstDataModel): String = {
		s"Message of id: ${dataModel.id} received with status: ${dataModel.status} and body: ${dataModel.data}"
	}
}
