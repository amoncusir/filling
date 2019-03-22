package info.digitalpoet.test.filling.gson

import com.google.gson.Gson
import com.google.gson.JsonIOException
import com.google.gson.JsonParseException
import com.google.gson.JsonSyntaxException
import info.digitalpoet.test.filling.core.SerializationEntityError
import info.digitalpoet.test.filling.core.contract.ResourceSerializer
import java.io.InputStream
import java.io.InputStreamReader
import kotlin.reflect.KClass

/** <!-- Created on 14/03/2019  -->
 * <h1>GsonResourceSerializer</h1>
 *
 * <p>
 *  Implementation using `Gson` library.
 * </p>
 *
 * @author Aran Moncusí Ramírez
 */
class GsonResourceSerializer(private val gson: Gson = Gson()):
        ResourceSerializer
{
    /**
     * Create a new instance from entity using stream as data.
     *
     * @param stream InputStream with data for fill a entity
     * @return New instance from entity
     * @throws info.digitalpoet.test.filling.core.SerializationEntityError if can't be serialized entity from resource
     */
    override fun <T : Any> createEntity(stream: InputStream, clz: KClass<T>): T =
        try { gson.fromJson(InputStreamReader(stream), clz.java) }
        catch (e: JsonParseException) { throw SerializationEntityError(clz, e) }
}
