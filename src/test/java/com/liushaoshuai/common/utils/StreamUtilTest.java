package com.liushaoshuai.common.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() throws FileNotFoundException {
		StreamUtil.closeAll(new FileInputStream(new File("1.txt")),new FileOutputStream(new File("2.txt")));
	}

	@Test
	public void testCopy() throws FileNotFoundException, IOException {
		StreamUtil.copy(new FileInputStream(new File("1.txt")), new FileOutputStream(new File("e:/2.txt")), true, true);
	}

	@Test
	public void testReadTextFileInputStream() throws InstantiationException, IllegalAccessException, FileNotFoundException, IOException {
		StreamUtil.readTextFile(new FileInputStream(new File("e:/1.txt")));
	}

	@Test
	public void testReadTextFileFile() throws FileNotFoundException, InstantiationException, IllegalAccessException, IOException {
		StreamUtil.readTextFile(new File("1.txt"));
	}

	@Test
	public void testReadStringFromSystemIn() {
		StreamUtil.readStringFromSystemIn(null);
	}

	@Test
	public void testReadIntFromSystemIn() {
		StreamUtil.readIntFromSystemIn(null);
	}

}
