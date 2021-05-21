package alexromanov.crypto

class CaesarCipher(shift: Int) {
  val alpha = "abcdefghijklmnopqrstuvwxyz"

  def encryptAlpha(plaintext: String): String = {
    val encrypted = plaintext
      .map(c => alpha.charAt((alpha.indexOf(c.toLower) + shift) % 26))
    encrypted
  }

  def decryptAlpha(ciphertext: String): String = {
    val encrypted = ciphertext
      .map(c => alpha.charAt((alpha.indexOf(c.toLower) - shift) % 26))
    encrypted
  }

  def encryptAny(plaintext: String): String = {
    ???
  }

  def decryptAny(ciphertext: String): String = {
    ???
  }
}
