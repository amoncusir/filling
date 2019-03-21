@file:JvmName("Builder")
package info.digitalpoet.test.filling

import info.digitalpoet.test.filling.core.BasicNamingResolve
import info.digitalpoet.test.filling.core.ClasspathResourceLoader
import info.digitalpoet.test.filling.core.Options
import info.digitalpoet.test.filling.gson.GsonResourceSerializer

/** <!-- Created on 15/03/2019  -->
 * <h1>Builder</h1>
 *
 * <p>
 *  ...
 * </p>
 *
 * @author Aran Moncusí Ramírez
 */

fun filling(options: Options = DefaultOptions(
    ClasspathResourceLoader(),
    GsonResourceSerializer(),
    BasicNamingResolve()
)): Filling =
    Filling(options)
