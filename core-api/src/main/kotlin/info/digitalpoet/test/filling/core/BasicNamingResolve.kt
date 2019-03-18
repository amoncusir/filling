package info.digitalpoet.test.filling.core

import info.digitalpoet.test.filling.core.contract.ResourceNamingResolver
import kotlin.reflect.KClass

/** <!-- Created on 14/03/2019  -->
 * <h1>BasicNamingResolve</h1>
 *
 * <p>
 *  ...
 * </p>
 *
 * @author Aran Moncusí Ramírez
 */
class BasicNamingResolve:
    ResourceNamingResolver
{
    /**
     * Resolve a resource name using the class name, prefix and suffix.
     *
     * @param clz Class of resource type
     * @param prefix if need
     * @param suffix if need
     * @return Resolved name
     */
    override fun resolve(clz: KClass<*>, prefix: String?, suffix: String?): String =
        "${prefix.toPrefix()}${clz.simpleName}${suffix.toSuffix()}"

    private fun String?.toPrefix(): String = if (this == null) "" else "${this}_"

    private fun String?.toSuffix(): String = if (this == null) "" else "_${this}"
}
