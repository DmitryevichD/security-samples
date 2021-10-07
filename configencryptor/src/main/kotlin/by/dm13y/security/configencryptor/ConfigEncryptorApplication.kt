package by.dm13y.security.configencryptor

import by.dm13y.security.configencryptor.service.ConfigEncryptor
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ConfigEncryptorApplication(
    private val configEncryptor: ConfigEncryptor

): CommandLineRunner {
    override fun run(vararg args: String?) {
        println("ENCRYPT")
        val sourceText = "sourceText"
        val encryptedText = configEncryptor.encrypt(sourceText)
        println("Text: '$sourceText' encrypted to '$encryptedText'")

        println("DECRYPT")
        val decryptedText = configEncryptor.decrypt(encryptedText)
        println("Text: '$encryptedText' decrypted to '$decryptedText'")
    }
}

fun main(args: Array<String>) {
    runApplication<ConfigEncryptorApplication>(*args)
}
