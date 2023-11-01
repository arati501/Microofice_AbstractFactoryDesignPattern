package com.microoffice;

public class GUIComponentTester {
	public static void main(String[] args) {
        String[] configuration = {"Word90", "Word00", "Word90", "Word21", "Word10", "Word00", "Word21", "Word90", "Word00"};

        for (String wordGeneration : configuration) {
            GUIComponentFactory factory = null; 

            int count = GenerationSingletonImpl.getInstanceCount(wordGeneration);

            if (wordGeneration.equals("Word90")) {
                factory = new Word90Factory();
            } else if (wordGeneration.equals("Word00")) {
                factory = new Word00Factory(); 
            }else if (wordGeneration.equals("Word10")) {
                factory = new Word10Factory(); 
            }else if (wordGeneration.equals("Word21")) {
                factory = new Word21Factory(); 
            }
            
            if (factory != null) {
                Panel panel = factory.createPanel();
                Button button = factory.createButton();
                Textbox textbox = factory.createTextbox();

                panel.display();
                button.display();
                textbox.display();
            }
        }
    }
}
