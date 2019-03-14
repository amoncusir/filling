package info.digitalpoet.test.filling.core

import kotlin.reflect.KClass

/** <!-- Created on 14/03/2019  -->
 * <h1>ResourceNotFound</h1>
 *
 * <p>
 *  ...
 * </p>
 *
 * @author Aran Moncusí Ramírez
 */
class SerializationEntityError(path: String, clazz: KClass<*>):
    FillingException("Error when try to serialize [$clazz] from resource: $path")
