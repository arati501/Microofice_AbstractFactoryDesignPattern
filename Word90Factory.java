package com.microoffice;

class Word90Factory extends GUIComponentFactory {
	@Override
	public Panel createPanel() {
		return new Word90Panel();
	}

	@Override
	public Button createButton() {
		return new Word90Button();
	}

	@Override
	public Textbox createTextbox() {
		return new Word90Textbox();
	}
}