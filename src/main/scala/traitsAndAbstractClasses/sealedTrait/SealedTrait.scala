package traitsAndAbstractClasses.sealedTrait

sealed trait SealedTrait

case class ItemOne(input: String)
case class ItemTwo(input: Boolean)
case class ItemThree(input: Int)
