/**
 * Example of a system that provides property values to 'ExampleService'.
 */
class ExampleHvacProvider {
    companion object {
        /**
         * Example of a property with incompatible min/max range (should be 1.3).
         */
        fun getFanSpeedValue() = RangedProperty(min = 1, max = 3, value = 1)

        /**
         * Example of a property with a compatible rangem but an out of range value.
         */
        fun getTemperatureValue() = RangedProperty(min = -20, max = 50, value = 200)
    }
}
