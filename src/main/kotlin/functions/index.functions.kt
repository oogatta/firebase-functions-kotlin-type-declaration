@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:[JsModule("firebase-functions")]

package functions

import kotlin.js.Json
import kotlin.js.Promise

external val https: Https = definedExternally

external class Https {
    fun onRequest(handler: (req: Request, resp: Response) -> Any?): HttpsFunction
}

external class Request {
    val body: dynamic
}

external class Response {
    fun status(statusCode: Number): Response
    fun send(message: String): Send
    fun send(message: Json): Send
    fun set(field:String, value:String): Send
}

external class Send

external class HttpsFunction
