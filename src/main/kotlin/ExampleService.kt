/**
 * Example of a service that needs to validate start-up requirements.
 */
class ExampleService {

    var fanSpeed = ExampleHvacProvider.getFanSpeedValue()
    var temperature = ExampleHvacProvider.getTemperatureValue()

    init {

        /**
         * Define some startup requirements. The first one is OK, the second one fails.
         */
        val startupRequirements = StartupRequirements(
            RangeMustIncludeRequirement(temperature, min = -100, max = 100),
            RangeMustMatchRequirement(fanSpeed, min = 1, max = 5)
        )
    }
}

fun main() {
    println("start")
    ExampleService()
    println("stop")
}
