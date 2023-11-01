package com.microoffice;

class Word10Factory extends GUIComponentFactory {
	@Override
	public Panel createPanel() {
		return new Word10Panel();
	}

	@Override
	public Button createButton() {
		return new Word10Button();
	}

	@Override
	public Textbox createTextbox() {
		return new Word10Textbox();
	}
}
