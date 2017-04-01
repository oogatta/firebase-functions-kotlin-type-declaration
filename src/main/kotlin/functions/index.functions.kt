@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:[JsModule("firebase-functions")]

package functions

import kotlin.js.Json

external val https: Https = definedExternally

external interface Https {
    fun onRequest(handler: (req: Request, resp: Response) -> Unit): HttpsFunction
}

external interface Request {
    val body: dynamic
}

external interface Response {
    fun status(statusCode: Number): Response
    fun send(message: String): Send
    fun send(message: Json): Send
}

external interface Send {}

external interface HttpsFunction {}
