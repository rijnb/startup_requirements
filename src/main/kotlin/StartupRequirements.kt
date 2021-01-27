/**
 * Interface for a set of startup requirements.
 */
class StartupRequirements(vararg startupRequirement: StartupRequirement) {

    /**
     * Validate all requirements.
     */
    init {
        startupRequirement.map { it.validate() }
    }
}
