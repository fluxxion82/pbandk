@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

@pbandk.Export
public data class Api(
    val name: String = "",
    val methods: List<pbandk.wkt.Method> = emptyList(),
    val options: List<pbandk.wkt.Option> = emptyList(),
    val version: String = "",
    val sourceContext: pbandk.wkt.SourceContext? = null,
    val mixins: List<pbandk.wkt.Mixin> = emptyList(),
    val syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Api = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Api> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.Api> {
        public val defaultInstance: pbandk.wkt.Api by lazy { pbandk.wkt.Api() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Api = pbandk.wkt.Api.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Api> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Api, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = pbandk.wkt.Api::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "methods",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Method>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Method.Companion)),
                        jsonName = "methods",
                        value = pbandk.wkt.Api::methods
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Option>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Option.Companion)),
                        jsonName = "options",
                        value = pbandk.wkt.Api::options
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "version",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "version",
                        value = pbandk.wkt.Api::version
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "source_context",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.SourceContext.Companion),
                        jsonName = "sourceContext",
                        value = pbandk.wkt.Api::sourceContext
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "mixins",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Mixin>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Mixin.Companion)),
                        jsonName = "mixins",
                        value = pbandk.wkt.Api::mixins
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "syntax",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.Syntax.Companion),
                        jsonName = "syntax",
                        value = pbandk.wkt.Api::syntax
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Api",
                messageClass = pbandk.wkt.Api::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class Method(
    val name: String = "",
    val requestTypeUrl: String = "",
    val requestStreaming: Boolean = false,
    val responseTypeUrl: String = "",
    val responseStreaming: Boolean = false,
    val options: List<pbandk.wkt.Option> = emptyList(),
    val syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Method = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Method> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.Method> {
        public val defaultInstance: pbandk.wkt.Method by lazy { pbandk.wkt.Method() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Method = pbandk.wkt.Method.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Method> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Method, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = pbandk.wkt.Method::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "request_type_url",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "requestTypeUrl",
                        value = pbandk.wkt.Method::requestTypeUrl
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "request_streaming",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "requestStreaming",
                        value = pbandk.wkt.Method::requestStreaming
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "response_type_url",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "responseTypeUrl",
                        value = pbandk.wkt.Method::responseTypeUrl
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "response_streaming",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "responseStreaming",
                        value = pbandk.wkt.Method::responseStreaming
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Option>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Option.Companion)),
                        jsonName = "options",
                        value = pbandk.wkt.Method::options
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "syntax",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.Syntax.Companion),
                        jsonName = "syntax",
                        value = pbandk.wkt.Method::syntax
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Method",
                messageClass = pbandk.wkt.Method::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class Mixin(
    val name: String = "",
    val root: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Mixin = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Mixin> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.Mixin> {
        public val defaultInstance: pbandk.wkt.Mixin by lazy { pbandk.wkt.Mixin() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Mixin = pbandk.wkt.Mixin.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Mixin> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Mixin, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = pbandk.wkt.Mixin::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "root",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "root",
                        value = pbandk.wkt.Mixin::root
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Mixin",
                messageClass = pbandk.wkt.Mixin::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForApi")
public fun Api?.orDefault(): pbandk.wkt.Api = this ?: Api.defaultInstance

private fun Api.protoMergeImpl(plus: pbandk.Message?): Api = (plus as? Api)?.let {
    it.copy(
        methods = methods + plus.methods,
        options = options + plus.options,
        sourceContext = sourceContext?.plus(plus.sourceContext) ?: plus.sourceContext,
        mixins = mixins + plus.mixins,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Api.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Api {
    var name = ""
    var methods: pbandk.ListWithSize.Builder<pbandk.wkt.Method>? = null
    var options: pbandk.ListWithSize.Builder<pbandk.wkt.Option>? = null
    var version = ""
    var sourceContext: pbandk.wkt.SourceContext? = null
    var mixins: pbandk.ListWithSize.Builder<pbandk.wkt.Mixin>? = null
    var syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0)

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> methods = (methods ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.Method> }
            3 -> options = (options ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.Option> }
            4 -> version = _fieldValue as String
            5 -> sourceContext = _fieldValue as pbandk.wkt.SourceContext
            6 -> mixins = (mixins ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.Mixin> }
            7 -> syntax = _fieldValue as pbandk.wkt.Syntax
        }
    }

    return Api(name, pbandk.ListWithSize.Builder.fixed(methods), pbandk.ListWithSize.Builder.fixed(options), version,
        sourceContext, pbandk.ListWithSize.Builder.fixed(mixins), syntax, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMethod")
public fun Method?.orDefault(): pbandk.wkt.Method = this ?: Method.defaultInstance

private fun Method.protoMergeImpl(plus: pbandk.Message?): Method = (plus as? Method)?.let {
    it.copy(
        options = options + plus.options,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Method.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Method {
    var name = ""
    var requestTypeUrl = ""
    var requestStreaming = false
    var responseTypeUrl = ""
    var responseStreaming = false
    var options: pbandk.ListWithSize.Builder<pbandk.wkt.Option>? = null
    var syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0)

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> requestTypeUrl = _fieldValue as String
            3 -> requestStreaming = _fieldValue as Boolean
            4 -> responseTypeUrl = _fieldValue as String
            5 -> responseStreaming = _fieldValue as Boolean
            6 -> options = (options ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.Option> }
            7 -> syntax = _fieldValue as pbandk.wkt.Syntax
        }
    }

    return Method(name, requestTypeUrl, requestStreaming, responseTypeUrl,
        responseStreaming, pbandk.ListWithSize.Builder.fixed(options), syntax, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMixin")
public fun Mixin?.orDefault(): pbandk.wkt.Mixin = this ?: Mixin.defaultInstance

private fun Mixin.protoMergeImpl(plus: pbandk.Message?): Mixin = (plus as? Mixin)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Mixin.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Mixin {
    var name = ""
    var root = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> root = _fieldValue as String
        }
    }

    return Mixin(name, root, unknownFields)
}
