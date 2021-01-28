package traitsAndAbstractClasses.methodTrait

trait MethodTrait {
	val prefix: String

	def prefixString(input: String) = {
		prefix + " " + input
	}
}
