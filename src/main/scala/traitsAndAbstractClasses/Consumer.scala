package traitsAndAbstractClasses

import traitsAndAbstractClasses.sealedTrait.SealedTrait

object Consumer {

	def returnTraitType(input: SealedTrait): String = {
		input match {
			case _ => throw new Exception("This should never happen")
		}
	}
}
