package info.digitalpoet.test.filling

import com.nhaarman.mockito_kotlin.*
import info.digitalpoet.test.filling.core.Options
import info.digitalpoet.test.filling.core.contract.ResourceLoader
import info.digitalpoet.test.filling.core.contract.ResourceNamingResolver
import info.digitalpoet.test.filling.core.contract.ResourceSerializer
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.ArgumentMatchers
import org.mockito.ArgumentMatchers.anyString
import java.io.InputStream
import kotlin.reflect.KClass

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

    val loader: ResourceLoader = mock {
        on { loadResource(anyOrNull()) } .then { mock<InputStream>() }
    }

    val namingResolver: ResourceNamingResolver = mock {
        on { resolve(anyOrNull(), anyOrNull(), anyOrNull()) } .then { "resolve" }
    }

    val serializer: ResourceSerializer = mock {
        on { createEntity<DataClass>(anyOrNull(), anyOrNull()) } .then { DataClass() }
    }

    val options: Options = mock {

        on { loader }.doReturn(loader)

        on { namingResolver }.doReturn(namingResolver)

        on { serializer }.doReturn(serializer)
    }

    @Test
    fun `fill class`()
    {
        val filling = Filling(options)

        var fill = filling.fill(DataClass::class)
        var javaFill = filling.fill(DataClass::class.java)
        var reifiedFill: DataClass = filling.fill()

        verify(loader, times(3)).loadResource(anyOrNull())
        verify(namingResolver, times(3)).resolve(anyOrNull(), anyOrNull(), anyOrNull())
        verify(serializer, times(3)).createEntity<DataClass>(anyOrNull(), anyOrNull())
    }
}
