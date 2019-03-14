package info.digitalpoet.test.filling.core

import info.digitalpoet.test.filling.core.contract.ResourceLoader
import info.digitalpoet.test.filling.core.contract.ResourceNamingResolver
import info.digitalpoet.test.filling.core.contract.ResourceSerializer

/** <!-- Created on 14/03/2019  -->
 * <h1>Options</h1>
 *
 * <p>
 *  ...
 * </p>
 *
 * @author Aran Moncusí Ramírez
 */
interface Options
{
    val loader: ResourceLoader

    val serializer: ResourceSerializer

    val namingResolver: ResourceNamingResolver
}
