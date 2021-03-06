package com.compsci.gui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import com.compsci.core.SloverseClient;
import com.compsci.gui.FrameHandle;
import com.compsci.gui.GuiOperations;

public class MenuListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(FrameHandle.getExitItem())) {
			SloverseClient.shutdownClient();
		}
		else if (e.getSource().equals(FrameHandle.getLogOutItem())) {
			int option = JOptionPane.showConfirmDialog(FrameHandle.getFrame(), "Are you sure you would like to log out?", "Sloverse Chat - Log Out", JOptionPane.YES_NO_OPTION);
			if (option == JOptionPane.YES_OPTION) {
				try {
					SloverseClient.getConnectThread().setConnected(false);
					SloverseClient.getConnectThread().getSocket().close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				GuiOperations.switchToLogin();
			}
			
		}
		else if (e.getSource().equals(FrameHandle.getCustomizeItem())) {
			GuiOperations.openCustomizeDialog();
		}
	}
}
