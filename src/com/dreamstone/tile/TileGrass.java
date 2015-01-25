package com.dreamstone.tile;

import java.awt.image.BufferedImage;

import com.dreamstone.file.ResourceLoader;
import com.dreamstone.util.TransformImage;

public class TileGrass extends TileTransition {
	
	public TileGrass(String name, String tileSheetName) {
		super(name, tileSheetName);
		this.setImageTiles();
	}
	
	@Override
	protected void setImageTiles() {
		//Sets full images
		defaultImages.add(TransformImage.getSubImageFromIndex(ResourceLoader.getTileSheet(this.getTileSheetName()), tileSize, tileSize, 17));
		defaultImages.add(TransformImage.getSubImageFromIndex(ResourceLoader.getTileSheet(this.getTileSheetName()), tileSize, tileSize, 20));
		defaultImages.add(TransformImage.getSubImageFromIndex(ResourceLoader.getTileSheet(this.getTileSheetName()), tileSize, tileSize, 23));
		defaultImages.add(TransformImage.getSubImageFromIndex(ResourceLoader.getTileSheet(this.getTileSheetName()), tileSize, tileSize, 26));
		defaultImages.add(TransformImage.getSubImageFromIndex(ResourceLoader.getTileSheet(this.getTileSheetName()), tileSize, tileSize, 29));
	}
	
	@Override
	public BufferedImage getImageTile() {
		
		int percent = rand.nextInt(100);
		
		if (percent >= 32)
			return defaultImages.get(0);
		else if (percent < 32 && percent >= 24)
			return defaultImages.get(1);
		else if (percent < 24 && percent >= 16)
			return defaultImages.get(2);
		else if (percent < 16 && percent >= 8)
			return defaultImages.get(3);
		else
			return defaultImages.get(4);
	}
	
	@Override
	protected void setTransitionImageTiles() {
//		Northwest Images
//		transitionImages.get(0).add(TransformImage.getSubImageFromIndex(ResourceLoader.getTileSheet(this.getTileSheetName()), tileSize, tileSize, 0));
//		
//		//North Images
//		transitionImages.get(1).add(TransformImage.getSubImageFromIndex(ResourceLoader.getTileSheet(this.getTileSheetName()), tileSize, tileSize, 1));
//		
//		//Northeast Images
//		transitionImages.get(2).add(TransformImage.getSubImageFromIndex(ResourceLoader.getTileSheet(this.getTileSheetName()), tileSize, tileSize, 2));
//		
//		//West Images
//		transitionImages.get(3).add(TransformImage.getSubImageFromIndex(ResourceLoader.getTileSheet(this.getTileSheetName()), tileSize, tileSize, 16));
//		
//		//East Images
//		transitionImages.get(4).add(TransformImage.getSubImageFromIndex(ResourceLoader.getTileSheet(this.getTileSheetName()), tileSize, tileSize, 18));
//		
//		//Southwest Image
//		transitionImages.get(5).add(TransformImage.getSubImageFromIndex(ResourceLoader.getTileSheet(this.getTileSheetName()), tileSize, tileSize, 32));
//		
//		//South Image
//		transitionImages.get(6).add(TransformImage.getSubImageFromIndex(ResourceLoader.getTileSheet(this.getTileSheetName()), tileSize, tileSize, 33));
//		
//		//Southeast Image
//		transitionImages.get(7).add(TransformImage.getSubImageFromIndex(ResourceLoader.getTileSheet(this.getTileSheetName()), tileSize, tileSize, 34));
	}
}
