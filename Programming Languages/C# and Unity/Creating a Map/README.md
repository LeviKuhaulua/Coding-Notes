# How to -: Create a 2D Map / Level Design

Purpose - a quick guide to creating maps and detailing them in Unity via Visual Studio Code


Going to need (__Assets__)[assetstore.unity.com] for the map. <br> 

General Process: 
1. Get asset
2. Configure asset to right size (involves slicing)
3. Creating tilemaps and painting the map. 

<br> 

__Getting Assets__: 
Import the asset in Unity --> Drag n' Drop, Import Assets using the Assets tab, and / or using Packet Manager then selecting 'My Assets' 

**IMPORTANT NOTE** -: After importing the assets, make sure to create a Folder that will contain those assets to keep everything organized

__Configuring Assets__: 
After importing, click on the background file. Change the `Sprite Mode` to `Multiple` and the `Mesh Type` to the right pixel size - make sure to Apply those settings. Then enter `Sprite Editor` and press `Slice`, change the dropbox to Grid by cell count and change the x and y to the right pixel size of the tilemap - make sure to Apply those settings. 

__Creating Tilemaps__: 
In the `Hierarchy`section, add a 2D tilemap component (make the tilemap `Rectangular`). Then open up the `Window` menu and select 2D then Tile Palette. Create a new Tile Palette and create a new Folder to contain those palettes. Drag n' Drop the Tileset onto the tile palette to create your map. 
<br> 

**IMPORTANT NOTE** : To create details for the map, you will need to create multiple tile palettes. With one tile palette being in a higher "order" or layer so that it is not covered by an existing tile. This will come in handy later on when doing `Collisions`. 