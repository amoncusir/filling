package info.digitalpoet.test.filling.core

import info.digitalpoet.test.filling.core.contract.ResourceLoader
import java.io.InputStream

/** <!-- Created on 14/03/2019  -->
 * <h1>ClasspathResourceLoader</h1>
 *
 * <p>
 *  ...
 * </p>
 *
 * @author Aran Moncusí Ramírez
 */
class ClasspathResourceLoader @JvmOverloads constructor(
    private val context: ClassLoader = Thread.currentThread().contextClassLoader,
    val location: String? = "entities",
    val extension: String = "json"
):
    ResourceLoader
{
    /**
     * Implementation to find and get resources for filling entities
     *
     * @param path on find the resource
     * @return InputStream of resource
     * @throws info.digitalpoet.test.filling.core.ResourceNotFound if resource not be found
     */
    override fun loadResource(path: String): InputStream = context.getResourceAsStream(path.toResource()) ?:
        throw ResourceNotFound(path)

    private fun String.toResource(): String = if (location != null) "$location/$this.$extension" else "$this.$extension"
}
