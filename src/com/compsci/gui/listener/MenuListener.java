package com.compsci.gui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.compsci.core.SloverseClient;
import com.compsci.gui.FrameHandle;
import com.compsci.gui.GuiOperations;

public class MenuListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(FrameHandle.getExitItem())) {
			SloverseClient.shutdownClient();
		}
		else if (e.getSource().equals(FrameHandle.getPropertiesItem())) {
			GuiOperations.openPropertiesDialog();
		}
	}
}