package com.astrum.wallet.wise.core.common.serializers

import com.astrum.wallet.wise.core.common.extensions.format
import com.astrum.wallet.wise.core.common.extensions.toLocalDate
import com.astrum.wallet.wise.core.common.utilities.supportedDateFormat
import kotlinx.datetime.LocalDate
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

class LocalDateSerializer : KSerializer<LocalDate> {
    override val descriptor = PrimitiveSerialDescriptor("LocalDate", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): LocalDate {
        for (format in supportedDateFormat) {
            try {
                return decoder.decodeString().toLocalDate(format)!!
            } catch (_: Exception) {

            }
        }

        throw RuntimeException("Error parsing date")
    }

    override fun serialize(encoder: Encoder, value: LocalDate) {
        encoder.encodeString(value = value.format())
    }
}
