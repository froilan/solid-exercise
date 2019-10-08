package com.synacy.compress;

public class MessageCompressor {

	public String compressSmsMessage(String content) {
		//some complex compressing logic using the content
		return "compressed sms message";
	}

	public String compressFaxMessage(byte[] imageByteArray, ImageType imageType) {
		//some complex compressing logic using imageByteArray and imageType
		return "compressed fax message";
	}

}
