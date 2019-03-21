package info.digitalpoet.test.filling

import info.digitalpoet.test.filling.core.Options
import kotlin.reflect.KClass

/** <!-- Created on 14/03/2019  -->
 * <h1>Filling</h1>
 *
 * <p>
 *  ...
 * </p>
 *
 * @author Aran Moncusí Ramírez
 */
class Filling(val options: Options)
{
    inline fun <reified T: Any> fill(prefix: String? = null, suffix: String? = null): T =
            fill(T::class, prefix, suffix)

    fun <T: Any> fill(clz: KClass<T>, prefix: String? = null, suffix: String? = null): T
    {
        val resourceName = options.namingResolver.resolve(clz, prefix, suffix)
        val resource = options.loader.loadResource(resourceName)

        return options.serializer.createEntity(resource, clz)
    }

    @JvmOverloads
    fun <T: Any> fill(clz: Class<T>, prefix: String? = null, suffix: String? = null): T =
            fill(clz.kotlin, prefix, suffix)
}
