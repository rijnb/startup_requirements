/**
 * Example of a startup requirement for ranged properties that should have an overlapping range.
 */
class RangeMustIncludeRequirement(
    val property: RangedProperty,
    val min: Int,
    val max: Int
) : StartupRequirement {

    override fun validate(): Unit {
        if (property.min < min || property.max > max || property.min > property.max) {
            throw StartupRequirementException()
        }
    }
}
