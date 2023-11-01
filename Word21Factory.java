package com.microoffice;

class Word21Factory extends GUIComponentFactory {
	@Override
	public Panel createPanel() {
		return new Word21Panel();
	}

	@Override
	public Button createButton() {
		return new Word21Button();
	}

	@Override
	public Textbox createTextbox() {
		return new Word21Textbox();
	}
}
