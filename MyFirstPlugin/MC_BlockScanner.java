package MyFirstPlugin;

import java.util.ArrayList;
import java.util.List;

import Math.Algebra;
import Math.Pythagoras;
import PluginReference.MC_Block;
import PluginReference.MC_Chunk;
import PluginReference.MC_Location;
import PluginReference.MC_Server;
import PluginReference.MC_World;

/**
 * A class that gets blocks and list of blocks
 */
public class MC_BlockScanner {
	
	private MC_Server server;
	private final List<MC_Location> locations = new ArrayList<MC_Location>();

	/**
	 * Gets a list of every single block, in every loaded chunk, in every single registered world, on the server.
	 * @return a list of all the blocks.
	 */
	public List<MC_Block> getAllBlocksInAllLoadedChunksInAllWorlds(){
		List<MC_Block> blocks = new ArrayList<MC_Block>();
		List<MC_World> worlds = server.getWorlds();
		for(int i = 0; i < worlds.size(); i++){
			MC_World world = worlds.get(i);
			List<MC_Block> wBlocks = getAllBlocksInAllLoadedChunks(world);
			blocks.addAll(wBlocks);
		}
		return blocks;
	}
	
	/**
	 * Gets a list of every single block, in every loaded chunk, in the world.
	 * @param world the world to search in.
	 * @return a list of all the blocks.
	 */
	public List<MC_Block> getAllBlocksInAllLoadedChunks(MC_World world){
		List<MC_Block> blocks = new ArrayList<MC_Block>();
		List<MC_Chunk> chunks = world.getLoadedChunks();
		for(int i = 0; i < chunks.size(); i++){
			MC_Chunk chunk = chunks.get(i);
			List<MC_Block> cBlocks = getAllBlocksInChunk(chunk, world.getDimension());
			blocks.addAll(cBlocks);
		}
		return blocks;
	}
	
	/**
	 * Gets a list of every single block in the chunk.
	 * @param chk the chunk to get all the blocks from
	 * @param dimension the dimension to look in
	 * @return  a list of all the blocks (256 blocks!)
	 */
	public List<MC_Block> getAllBlocksInChunk(MC_Chunk chk, int dimension){
		List<MC_Block> blocks = new ArrayList<MC_Block>();
		int chunkx = chk.getCX();
		int chunkz = chk.getCZ();
		int basex = chunkx << 4;
		int topx = (chunkx << 4) + 15;
		int basez = chunkz << 4;
		int topz = (chunkz << 4) + 15;
		
		for(int x = basex; x <= topx; x++){
			for(int z = basez; z <= topz; z++){
				MC_Location location = new MC_Location((double)x, (double)100, (double)z, 0);
				locations.add(location);
				MC_World world = server.getWorld(dimension);
				MC_Block blk = world.getBlockAt(location);
				blocks.add(blk);
			}
		}
		return blocks;
	}
	
	/**
	 * Gets the block of whatever type that is closest to spawn
	 * Note the note at {@link #getClosestToLocation(int, MC_Location) getClosestToLocation(int, MC_Location)}
	 * @param type the type of block to look for
	 * @return the block object.
	 */
	public MC_Block getClosestToSpawn(int type){
		MC_World world = server.getWorld(0);
		MC_Location spawn = world.getSpawnLocation();
		return getClosestToLocation(type, spawn);
	}
	
	/**
	 * Gets the block of whatever type that is closest to the location specified.
	 * NOTE: this uses the Math package. If you are planning on using this package individually, you need to get the math package as well.
	 * @param type the type of block to look for
	 * @param loc the location to search from.
	 * @return the block object.
	 */
	public MC_Block getClosestToLocation(int type, MC_Location loc){
		MC_World world = server.getWorld(loc.dimension);
		List<MC_Block> blocks = getAllBlocksInAllLoadedChunks(world);
		List<MC_Block> possibilities = new ArrayList<MC_Block>();
		for(int i = 0; i < blocks.size(); i++){
			MC_Block block = blocks.get(i);
			if(block.getId() == type) possibilities.add(block);
		}
		if(possibilities.isEmpty()) return null;
		else{
			double dis = 1000000;
			MC_Block key = null;
			for(int i = 0; i < possibilities.size(); i++){
				MC_Block block = possibilities.get(i);
				MC_Location blockloc = locations.get(i);
				Pythagoras p = new Pythagoras();
				Algebra a = new Algebra();
				double bx = blockloc.getBlockX() - loc.getBlockX();
				double bz = blockloc.getBlockZ() - loc.getBlockZ();
				double x = a.makePositive(bx);
				double z = a.makePositive(bz);
				double hyp = p.getHypotenuse(x, z);
				if(hyp < dis){
					dis = hyp;
					key = block;
				}
			}
			return key;
			}
	}
	
	/**
	 * Creates an MC_BlockScanner object.
	 * @param server the server to get blocks from.
	 */
	public MC_BlockScanner(MC_Server server){
		this.server = server;
	}
	
}
