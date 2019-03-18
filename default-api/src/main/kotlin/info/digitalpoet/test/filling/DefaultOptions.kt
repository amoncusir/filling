package info.digitalpoet.test.filling

import info.digitalpoet.test.filling.core.ClasspathResourceLoader
import info.digitalpoet.test.filling.core.Options
import info.digitalpoet.test.filling.core.contract.ResourceLoader
import info.digitalpoet.test.filling.core.contract.ResourceNamingResolver
import info.digitalpoet.test.filling.core.contract.ResourceSerializer

/** <!-- Created on 15/03/2019  -->
 * <h1>DefaultOptions</h1>
 *
 * <p>
 *  ...
 * </p>
 *
 * @author Aran Moncusí Ramírez
 */
class DefaultOptions(
    override val loader: ResourceLoader,
    override val serializer: ResourceSerializer,
    override val namingResolver: ResourceNamingResolver
):
        Options
