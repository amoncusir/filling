package info.digitalpoet.test.filling

import com.nhaarman.mockito_kotlin.doReturn
import com.nhaarman.mockito_kotlin.mock
import info.digitalpoet.test.filling.core.Options
import info.digitalpoet.test.filling.core.contract.ResourceLoader
import info.digitalpoet.test.filling.core.contract.ResourceNamingResolver
import info.digitalpoet.test.filling.core.contract.ResourceSerializer
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

/** <!-- Created on 16/03/2019  -->
 * <h1>FillingTest</h1>
 *
 * <p>
 *  ...
 * </p>
 *
 * @author Aran Moncusí Ramírez
 */
class FillingTest
{

    val options: Options = mock() {

        on { loader }.doReturn(mock<ResourceLoader>())

        on { namingResolver }.doReturn(mock<ResourceNamingResolver>())

        on { serializer }.doReturn(mock<ResourceSerializer>())
    }

    @BeforeEach
    fun init()
    {

    }

    @Test
    fun `fill class`()
    {

    }
}
