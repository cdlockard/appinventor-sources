package com.google.appinventor.client.editor.youngandroid.properties;

import static com.google.appinventor.client.Ode.MESSAGES;

import com.google.appinventor.client.widgets.properties.ChoicePropertyEditor;
import com.google.appinventor.components.runtime.ImageSprite;

/**
 * Property editor for {@link ImageSprite} boundary definition.
 *
 * @author AJ Parmidge
 * @author Colin Lockard
 */
public class YoungAndroidImageSpriteBoundsPropertyEditor extends ChoicePropertyEditor {
  private static final Choice[] boundDefinitions = new Choice[] {
      new Choice(MESSAGES.rectangularImageSpriteBounds(), "0"),
      new Choice(MESSAGES.visibleImageSpriteBounds(), "1"),
  };

  public YoungAndroidImageSpriteBoundsPropertyEditor() {
    super(boundDefinitions);
  }
}
