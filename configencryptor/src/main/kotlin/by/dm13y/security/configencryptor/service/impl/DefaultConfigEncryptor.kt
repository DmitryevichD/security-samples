package by.dm13y.security.configencryptor.service.impl

import by.dm13y.security.configencryptor.service.ConfigEncryptor
import org.springframework.beans.factory.annotation.Value
import org.springframework.security.crypto.encrypt.Encryptors
import org.springframework.stereotype.Service

@Service
class DefaultConfigEncryptor(
    @Value("\${encrypt.key}") encryptKey: String,
    @Value("\${encrypt.salt:deadbeef}") encryptSalt: String,
) : ConfigEncryptor {
    val encryptor = Encryptors.text(encryptKey, encryptSalt)

    override fun encrypt(text: String): String {
        return encryptor.encrypt(text)
    }

    override fun decrypt(text: String): String {
        return encryptor.decrypt(text)
    }
}
