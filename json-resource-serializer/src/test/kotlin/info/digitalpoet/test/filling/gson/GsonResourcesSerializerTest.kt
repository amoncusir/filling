package info.digitalpoet.test.filling.gson

import com.google.gson.Gson
import com.google.gson.JsonParseException
import com.nhaarman.mockito_kotlin.mock
import info.digitalpoet.test.filling.core.SerializationEntityError
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.mockito.ArgumentMatchers.any
import java.io.ByteArrayInputStream
import java.io.InputStreamReader

/** <!-- Created on 22/03/2019  -->
 * <h1>GsonResourcesSerializerTest</h1>
 *
 * <p>
 *  ...
 * </p>
 *
 * @author Aran Moncusí Ramírez
 */

const val dataClassJson = """
{
  "name":    "Ana Lisa",
  "surname": "Melchoto"
}
"""

class GsonResourcesSerializerTest
{
    @Test
    fun `deserialize simple class`()
    {
        val serializer = GsonResourceSerializer()
        val inputStream = ByteArrayInputStream(dataClassJson.toByteArray())

        val entity = serializer.createEntity(inputStream, DataClass::class)

        assertEquals("Ana Lisa", entity.name)
        assertEquals("Melchoto", entity.surname)
    }

    @Test
    fun `deserialize with error`()
    {
        val gson: Gson = mock {
            on { fromJson(any(InputStreamReader::class.java), any(Class::class.java)) }
                .thenThrow(JsonParseException::class.java)
        }

        val serializer = GsonResourceSerializer(gson)
        val inputStream = ByteArrayInputStream(dataClassJson.toByteArray())

        assertThrows<SerializationEntityError> { serializer.createEntity(inputStream, DataClass::class) }
    }
}
