package info.digitalpoet.test.filling.core.contract

import java.io.InputStream

/** <!-- Created on 14/03/2019  -->
 * <h1>ResourceLoader</h1>
 *
 * <p>
 *  ...
 * </p>
 *
 * @author Aran Moncusí Ramírez
 */
interface ResourceLoader
{
    /**
     * Implementation to find and get resources for filling entities
     *
     * @param path on find the resource
     * @return InputStream of resource
     * @throws info.digitalpoet.test.filling.core.ResourceNotFound if resource not be found
     */
    fun loadResource(path: String): InputStream
}
