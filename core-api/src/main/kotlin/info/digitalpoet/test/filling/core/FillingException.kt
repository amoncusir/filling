package info.digitalpoet.test.filling.core

/** <!-- Created on 14/03/2019  -->
 * <h1>FillingException</h1>
 *
 * <p>
 *  base class to extends all errors in project
 * </p>
 *
 * @author Aran Moncusí Ramírez
 */
abstract class FillingException:
        RuntimeException
{
    constructor() : super()

    constructor(message: String?) : super(message)

    constructor(message: String?, cause: Throwable?) : super(message, cause)

    constructor(cause: Throwable?) : super(cause)

    constructor(message: String?, cause: Throwable?, enableSuppression: Boolean, writableStackTrace: Boolean):
            super(
        message,
        cause,
        enableSuppression,
        writableStackTrace
    )
}
