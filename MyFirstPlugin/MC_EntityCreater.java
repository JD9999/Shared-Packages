package MyFirstPlugin;

import java.util.Random;

import Exceptions.NotRequestedEntityTypeException;
import PluginReference.MC_Entity;
import PluginReference.MC_EntityAgeable;
import PluginReference.MC_EntityType;
import PluginReference.MC_Server;
import PluginReference.MC_World;

public class MC_EntityCreater {

	/**
	 * Creates an entity
	 * @param type the type of entity to create
	 * @param server the server that holds the world for level 0 (overworld) to spawn it in
	 * @return the created entity
	 */
	public static MC_Entity createEntity(MC_EntityType type, MC_Server server){
		return createEntity(type, 0, server);
	}

	/**
	 * Creates an entity
	 * @param type the type of entity to create
	 * @param world the world level to spawn it in
	 * @param server the server to spawn it in
	 * @return the created entity
	 */
	public static MC_Entity createEntity(MC_EntityType type, int world, MC_Server server) {
		return createEntity(type, server.getWorld(world));
	}
	
	/**
	 * Creates an entity
	 * @param type the type of entity to create
	 * @param world the world to create it in
	 * @return the created entity
	 */
	public static MC_Entity createEntity(MC_EntityType type, MC_World world){
		return world.spawnEntity(type, world.getSpawnLocation(), "");
	}
	
	/**
	 * Creates an entity
	 * @param type the type of entity to create
	 * @param server the server that holds the world for level 0 (overworld) to spawn it in
	 * @return the created entity
	 */
	public static MC_Entity createEntity(String type, MC_Server server){
		return createEntity(type, 0, server);
	}

	/**
	 * Creates an entity
	 * @param type the type of entity to create
	 * @param world the world level to spawn it in
	 * @param server the server to spawn it in
	 * @return the created entity
	 */
	public static MC_Entity createEntity(String type, int world, MC_Server server) {
		return createEntity(type, server.getWorld(world));
	}
	
	/**
	 * Creates an entity
	 * @param type the type of entity to create
	 * @param world the world to create it in
	 * @return the created entity
	 */
	public static MC_Entity createEntity(String type, MC_World world){
		return world.spawnEntity(MC_EntityType.valueOf(type), world.getSpawnLocation(), "");
	}
	
	/**
	 * Creates an entity
	 * @param type the type of entity to create
	 * @param server the server that holds the world for level 0 (overworld) to spawn it in
	 * @param isBaby whether the entity is a baby or not
	 * @return the created entity
	 */
	public static MC_Entity createEntity(MC_EntityType type, MC_Server server, boolean isBaby){
		return createEntity(type, 0, server, isBaby);
	}

	/**
	 * Creates an entity
	 * @param type the type of entity to create
	 * @param world the world level to spawn it in
	 * @param server the server to spawn it in
	 * @param isBaby whether the entity is a baby or not
	 * @return the created entity
	 */
	public static MC_Entity createEntity(MC_EntityType type, int world, MC_Server server, boolean isBaby) {
		return createEntity(type, server.getWorld(world), isBaby);
	}
	
	/**
	 * Creates an entity
	 * @param type the type of entity to create
	 * @param world the world to create it in
	 * @param isBaby whether the entity is a baby or not
	 * @return the created entity
	 */
	public static MC_Entity createEntity(MC_EntityType type, MC_World world, boolean isBaby){
		MC_Entity ent = world.spawnEntity(type, world.getSpawnLocation(), "");
		((MC_EntityAgeable)ent).setAge(-9000);
		return ent;
	}
	
	/**
	 * Creates an entity
	 * @param type the type of entity to create
	 * @param server the server to get the overworld from
	 * @param isBaby whether to spawn a baby or not
	 * @return the entity created
	 * @throws NotRequestedEntityTypeException if isBaby is true but then entity does not implement MC_EntityAgeable
	 */
	public static MC_Entity createEntity(String type, MC_Server server, boolean isBaby) throws NotRequestedEntityTypeException{
		return createEntity(type, 0, server, isBaby);
	}

	/**
	 * Creates an entity
	 * @param type the type of entity to create
	 * @param world the world to create it in
	 * @param server the server to get the overworld from
	 * @param isBaby whether to spawn a baby or not
	 * @return the entity created
	 * @throws NotRequestedEntityTypeException if isBaby is true but then entity does not implement MC_EntityAgeable
	 */
	public static MC_Entity createEntity(String type, int world, MC_Server server, boolean isBaby) throws NotRequestedEntityTypeException {
		return createEntity(type, server.getWorld(world), isBaby);
	}
	
	/**
	 * Creates an entity
	 * @param type the type of entity to create
	 * @param world the world to create it in
	 * @param isBaby whether to spawn a baby or not
	 * @return the entity created
	 * @throws NotRequestedEntityTypeException if isBaby is true but then entity does not implement MC_EntityAgeable
	 */
	public static MC_Entity createEntity(String type, MC_World world, boolean isBaby) throws NotRequestedEntityTypeException{
	    MC_Entity ent = world.spawnEntity(MC_EntityType.valueOf(type), world.getSpawnLocation(), "");
	    if(isBaby){
	    	if(ent instanceof MC_EntityAgeable)((MC_EntityAgeable)ent).setAge(-9000);
	    	else throw new NotRequestedEntityTypeException("Only ageing entities can be babies!");
	    }
	    return ent;
	}
	
	/**
	 * Creates a random entity
	 * @param world the world to create it in
	 * @return the random entity
	 */
	public static MC_Entity createRandomEntity(MC_World world){
		MC_EntityType[] array = MC_EntityType.values();
		Random random = new Random();
		int r = random.nextInt(array.length -1);
		MC_EntityType type = array[r];
		return createEntity(type, world);
	}
	
	/**
	 * Creates a random entity
	 * @param server the server to create it in
	 * @param dimension the dimesion number to create it in
	 * @return the random entity
	 */
	public static MC_Entity createRandomEntity(MC_Server server, int dimension){
		return createRandomEntity(server.getWorld(dimension));
	}
	
	/**
	 * Creates a random entity
	 * @param server the server to get the overworld from
	 * @return the random entity
	 */
	public static MC_Entity createRandomEntity(MC_Server server){
		return createRandomEntity(server, 0);
	}
	
}
