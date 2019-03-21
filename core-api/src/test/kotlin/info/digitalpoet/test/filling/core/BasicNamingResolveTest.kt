package info.digitalpoet.test.filling.core

import info.digitalpoet.test.filling.DataClass
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/** <!-- Created on 21/03/2019  -->
 * <h1>BasicNamingResolveTest</h1>
 *
 * <p>
 *  ...
 * </p>
 *
 * @author Aran Moncusí Ramírez
 */
class BasicNamingResolveTest
{
    @Test
    fun `resolve with prefix and suffix`()
    {
        val namingResolve = BasicNamingResolve()
        val resolved = namingResolve.resolve(DataClass::class, "prefix", "suffix")

        assertEquals("prefix_DataClass_suffix", resolved)
    }

    @Test
    fun `resolve with prefix and suffix using custom separator`()
    {
        val namingResolve = BasicNamingResolve(".")
        val resolved = namingResolve.resolve(DataClass::class, "prefix", "suffix")

        assertEquals("prefix.DataClass.suffix", resolved)
    }

    @Test
    fun `resolve without prefix and suffix`()
    {
        val namingResolve = BasicNamingResolve()
        val resolved = namingResolve.resolve(DataClass::class, null, null)

        assertEquals("DataClass", resolved)
    }
}
