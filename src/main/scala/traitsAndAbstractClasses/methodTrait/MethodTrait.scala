package traitsAndAbstractClasses.methodTrait

trait MethodTrait {
	val prefix: String

	def prefixString(input: String) = {
		prefix + " " + input
	}

	def processMessage(input: String): String
}
