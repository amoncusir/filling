package info.digitalpoet.test.filling.core.contract

import java.io.InputStream
import kotlin.reflect.KClass

/** <!-- Created on 14/03/2019  -->
 * <h1>ResourceSerializer</h1>
 *
 * <p>
 *  ...
 * </p>
 *
 * @author Aran Moncusí Ramírez
 */
interface ResourceSerializer
{
    /**
     * Create a new instance from entity using stream as data.
     *
     * @param stream InputStream with data for fill a entity
     * @return New instance from entity
     * @throws info.digitalpoet.test.filling.core.SerializationEntityError if can't be serialized entity from resource
     */
    fun <T: Any> createEntity(stream: InputStream, clz: KClass<T>): T
}
