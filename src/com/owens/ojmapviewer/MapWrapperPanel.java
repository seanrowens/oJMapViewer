package com.owens.ojmapviewer;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.tilesources.BingAerialTileSource;

public class MapWrapperPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JMapViewer mv;

	public MapWrapperPanel() {
		super();
		mv = new JMapViewer();
		mv.setScrollWrapEnabled(true);
		mv.setTileSource(new BingAerialTileSource());

		this.setLayout(new BorderLayout(0, 0));
		this.add(mv, BorderLayout.CENTER);
		// Buh, apparently they removed the file cache from jmapviewer?
		//
//		File cd = new File(System.getProperty("user.home", "osm_cache"));
//		cd.mkdirs();
//		TileCache
//		OsmFileCacheTileLoader cl = new OsmFileCacheTileLoader(mv, cd);
	}

}
