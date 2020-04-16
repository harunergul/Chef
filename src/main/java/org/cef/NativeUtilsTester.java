package org.cef;

import java.io.IOException;

public class NativeUtilsTester {

	public static void main(String... strings) {

		try {
			NativeUtils.loadLibraryFromJar("/natives/windows_64/chrome_elf.dll");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
