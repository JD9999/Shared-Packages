package MyFirstPlugin;

import java.util.ArrayList;
import java.util.List;

import PluginReference.MC_Chunk;
import PluginReference.MC_World;

/**
 * A copy of the class used in AnimalGuard related to retrieving and storing chunks.
 */
public class MC_ChunkRecorder {

	private static List<MC_Chunk> chunks = new ArrayList<MC_Chunk>();
	
	/**
	 * Creates an MC_ChunkRecorder object.
	 */
	public MC_ChunkRecorder(){
	}
	
	/**
	 * Add a chunk to the list
	 * @param chk the chunk to add
	 */
	public void add(MC_Chunk chk){
		chunks.add(chk);
	}
	
	/**
	 * Remove a chunk from the list
	 * @param chk the chunk to remove
	 */
	public void remove(MC_Chunk chk){
		chunks.remove(chk);
	}
	
	/**
	 * Check whether a chunk is in the list
	 * @param chk the chunk to check
	 * @return whether the chunk is in the list or not
	 */
	public boolean contains(MC_Chunk chk){
		return chunks.contains(chk);
	}
	
	/**
	 * Gets an MC_Chunk object from a position in a world
	 * @param x the x-coordinate of the BLOCK (NOT CHUNK)
	 * @param z the z-coordinate of the BLOCK (NOT CHUNK)
	 * @param world the world to get the chunk from
	 * @return the chunk. May return null if the chunk is not loaded.
	 */
	public static MC_Chunk getChunkFor(int x, int z, MC_World world){
		List<MC_Chunk> chunks = world.getLoadedChunks();
		for(int i = 0; i < chunks.size(); i++){
			MC_Chunk chunk = chunks.get(i);
			if(chunk.getCX() == x && chunk.getCZ() == z) return chunk;
		}
		return null;
	}
	
}
