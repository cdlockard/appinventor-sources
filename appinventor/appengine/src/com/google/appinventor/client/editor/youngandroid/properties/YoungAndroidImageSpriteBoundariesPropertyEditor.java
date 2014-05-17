package com.google.appinventor.client.editor.youngandroid.properties;

import static com.google.appinventor.client.Ode.MESSAGES;

import com.google.appinventor.client.widgets.properties.ChoicePropertyEditor;

/**
 * Property editor for {@link ImageSprite} boundary definition.
 *
 * @author AJ Parmidge
 * @author Colin Lockard
 */
public class YoungAndroidImageSpriteBoundariesPropertyEditor extends ChoicePropertyEditor {
  private static final Choice[] boundaryDefinitions = new Choice[] {
      new Choice(MESSAGES.rectangularImageSpriteBoundaries(), "0"),
      new Choice(MESSAGES.visibleImageSpriteBoundaries(), "1"),
  };

  public YoungAndroidImageSpriteBoundariesPropertyEditor() {
    super(boundaryDefinitions);
  }
}