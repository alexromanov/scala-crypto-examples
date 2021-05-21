package alexromanov.crypto

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CaesarCypherTest extends AnyFlatSpec with Matchers {
  "User" should "encrypt message with Caesars Cipher" in {
    val plaintext = "CAESAR"
    val caesarCipher = new CaesarCipher(3)
    val ciphertext = caesarCipher.encryptAlpha(plaintext)
    ciphertext should be ("fdhvdu")
  }

  "User" should "decrypt message with Caesars Cipher" in {
    val ciphertext = "fdhvdu"
    val caesarCipher = new CaesarCipher(3)
    val plaintext = caesarCipher.decryptAlpha(ciphertext)
    plaintext should be ("caesar")
  }
}
