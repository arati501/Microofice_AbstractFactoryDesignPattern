package com.microoffice;

class Word00Factory extends GUIComponentFactory {
	@Override
	public Panel createPanel() {
		return new Word00Panel();
	}

	@Override
	public Button createButton() {
		return new Word00Button();
	}

	@Override
	public Textbox createTextbox() {
		return new Word00Textbox();
	}
}
