/**
 * Startup requirements for a module should validated before a module starts.
 *
 */
interface StartupRequirement {
    fun validate(): Unit = throw StartupRequirementException()
}
