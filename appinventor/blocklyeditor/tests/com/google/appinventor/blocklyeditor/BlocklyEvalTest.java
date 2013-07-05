// Copyright 2009 Google Inc. All Rights Reserved.

package com.google.appinventor.blocklyeditor;

import java.io.IOException;

import com.google.appinventor.common.testutils.TestUtils;

import junit.framework.TestCase;

/**
 * Tests the App Inventor Blockly blocks evaluation of various YAIL code.
 * 
 * TODO(andrew.f.mckinney): More tests needed!
 * 
 * @author andrew.f.mckinney@gmail.com (Andrew.F.McKinney)
 */

public class BlocklyEvalTest extends TestCase {
  
  public static final String testpath = TestUtils.APP_INVENTOR_ROOT_DIR + "/blocklyeditor";

  public void testBackgroundColor() throws Exception {

    String[] params = { "phantomjs", testpath + "/tests/com/google/appinventor/blocklyeditor/backgroundColorTest.js" };
    String result = "";

    try {
      result = CodeBlocksProcessHelper.exec(params, true).trim();
    } catch (IOException e) {
      e.printStackTrace();
    }

    assertEquals("true", result.toString());
  }

  public void testMoleMash() throws Exception {

    String[] params = { "phantomjs", testpath + "/tests/com/google/appinventor/blocklyeditor/moleMashTest.js" };
    String result = "";

    try {
      result = CodeBlocksProcessHelper.exec(params, true).trim();
    } catch (IOException e) {
      e.printStackTrace();
    }

    assertEquals("true", result.toString());
  }

  public void testPaintPot() throws Exception {

    String[] params = { "phantomjs", testpath + "/tests/com/google/appinventor/blocklyeditor/paintPotTest.js" };
    String result = "";

    try {
      result = CodeBlocksProcessHelper.exec(params, true).trim();
    } catch (IOException e) {
      e.printStackTrace();
    }

    assertEquals("true", result.toString());
  }

  public void testHelloPurr() throws Exception {

    String[] params = { "phantomjs", testpath + "/tests/com/google/appinventor/blocklyeditor/helloPurrTest.js" };
    String result = "";

    try {
      result = CodeBlocksProcessHelper.exec(params, true).trim();
    } catch (IOException e) {
      e.printStackTrace();
    }

    assertEquals("true", result.toString());
  }

  public void testMakeQuiz() throws Exception {

    String[] params = { "phantomjs", testpath + "/tests/com/google/appinventor/blocklyeditor/makeQuizTest.js" };
    String result = "";

    try {
      result = CodeBlocksProcessHelper.exec(params, true).trim();
    } catch (IOException e) {
      e.printStackTrace();
    }

    assertEquals("true", result.toString());
  }

}