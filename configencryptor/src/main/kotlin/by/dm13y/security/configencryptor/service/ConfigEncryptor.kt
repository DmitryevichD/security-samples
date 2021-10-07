package by.dm13y.security.configencryptor.service

interface ConfigEncryptor {
    fun encrypt(text: String): String
    fun decrypt(text: String): String
}