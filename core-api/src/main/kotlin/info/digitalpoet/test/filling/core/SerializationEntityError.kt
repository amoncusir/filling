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
class SerializationEntityError( clazz: KClass<*>, cause: Throwable? = null):
    FillingException("Error when try to serialize [$clazz]", cause)
