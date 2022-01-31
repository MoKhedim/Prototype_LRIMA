import java.io.File;
public class testCrypto {

	public static void main(String[] args) {
		
		String key = "Welcome to hell!";
		File inputfile = new File("U:/java/Crypto/testFile.txt");
		File encryptedFile = new File("U:/java/Crypto/testFileEncrypted.txt");
		File decryptedFile = new File("U:/java/Crypto/testFileDecrypted.txt");
		
		try {
			CryptoUtils.encrypt(key, inputfile, encryptedFile);
			CryptoUtils.decrypt(key, encryptedFile, decryptedFile);
		} catch (CryptoException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}

}
