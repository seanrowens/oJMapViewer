package com.owens.ojmapviewer;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main {

	private final JFrame mapFrame;
	private MapWrapperPanel mapPanel;
	private JPanel controlPanel;

	public Main() {
		mapFrame = new JFrame("EMAPS visualizer");
		mapFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mapFrame.setExtendedState(mapFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		mapFrame.setLayout(new BorderLayout());

		mapPanel = new MapWrapperPanel();
		mapPanel.setLayout(new BorderLayout());
		mapPanel.setBorder(BorderFactory.createTitledBorder("Map"));
		mapFrame.add(mapPanel, BorderLayout.CENTER);

		controlPanel = new JPanel();
		controlPanel.setLayout(new BorderLayout());
		controlPanel.setBorder(BorderFactory.createTitledBorder("Control"));
		mapFrame.add(controlPanel, BorderLayout.SOUTH);
		mapFrame.setVisible(true);

		while (true) {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					mapFrame.repaint();
				}
			});
		}
	}

	public static void main(String[] args) {
		new Main();
	}
}
