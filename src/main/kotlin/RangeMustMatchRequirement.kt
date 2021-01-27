/**
 * Example of a startup requirement for ranged properties that must match a certain range.
 */
class RangeMustMatchRequirement(
    val property: RangedProperty,
    val min: Int,
    val max: Int
) : StartupRequirement {

    override fun validate(): Unit {
        if (property.min != min || property.max != max) {
            throw StartupRequirementException()
        }
    }
}
