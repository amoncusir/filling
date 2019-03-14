package info.digitalpoet.test.filling.core

/** <!-- Created on 14/03/2019  -->
 * <h1>ResourceNotFound</h1>
 *
 * <p>
 *  ...
 * </p>
 *
 * @author Aran Moncusí Ramírez
 */
class ResourceNotFound(path: String):
    FillingException("The resource with path: $path can't be found")
