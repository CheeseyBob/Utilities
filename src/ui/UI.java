package ui;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

public class UI {
	
	public static JScrollPane makeIntoScrollPane(Component component, boolean scrollHorizontally, boolean scrollVertically){
		JScrollPane scrollPane = new JScrollPane(component);
		if(scrollHorizontally) {
			scrollPane.setVerticalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		}
		if(scrollVertically) {
			scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		}
        scrollPane.setPreferredSize(component.getPreferredSize());
        scrollPane.setMinimumSize(component.getMaximumSize());
        scrollPane.setMinimumSize(component.getMinimumSize());
		return scrollPane;
	}
	
	public static JPanel makeIntoFancyPanel(Component component, String panelTitle, int borderThickness) {
        JPanel panel = new JPanel(new GridLayout(1,0));
        Border outsideBorder = BorderFactory.createTitledBorder(panelTitle);
        Border insideBorder = BorderFactory.createEmptyBorder(borderThickness, borderThickness, borderThickness, borderThickness);
        panel.setBorder(BorderFactory.createCompoundBorder(outsideBorder, insideBorder));
        panel.add(component);
		return panel;
	}
}