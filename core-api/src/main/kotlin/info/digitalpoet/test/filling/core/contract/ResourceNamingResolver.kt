package info.digitalpoet.test.filling.core.contract

import kotlin.reflect.KClass

/** <!-- Created on 14/03/2019  -->
 * <h1>ResourceNamingResolver</h1>
 *
 * <p>
 *  ...
 * </p>
 *
 * @author Aran Moncusí Ramírez
 */
interface ResourceNamingResolver
{
    /**
     * Resolve a resource name using the class name, prefix and suffix.
     *
     * @param clz Class of resource type
     * @param prefix if need
     * @param suffix if need
     * @return Resolved name
     */
    fun resolve(clz: KClass<*>, prefix: String?, suffix: String?): String
}
