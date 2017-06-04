package Converter.Minecraft;

import PluginReference.MC_Animal;
import PluginReference.MC_AnimalTameable;
import PluginReference.MC_Enderman;
import PluginReference.MC_Entity;
import PluginReference.MC_EntityAgeable;
import PluginReference.MC_Horse;
import PluginReference.MC_Ocelot;
import PluginReference.MC_Player;
import PluginReference.MC_Skeleton;
import PluginReference.MC_Wolf;
import PluginReference.MC_Zombie;

/**
 * A class managing entity conversions
 */
public class Entity {

	/**
	 * The stored entity type from the constructor
	 */
	private MC_Entity ent;
	
	/**
	 * Creates the entity converted
	 * @param ent The entity to convert
	 */
	public Entity(MC_Entity ent){
		this.ent = ent;
	}
	
	/**
	 * Converts the entity to a player
	 * @return An MC_Player object representing the entity
	 * @throws NotRequestedEntityTypeException If the entity is not a player
	 */
	public MC_Player toPlayer() throws NotRequestedEntityTypeException{
		if(ent instanceof MC_Player){
			MC_Player plr = (MC_Player)ent;
			return plr;
		}else throw new NotRequestedEntityTypeException(ent);
	}
	
	/**
	 * Converts the entity to an enderman
	 * @return An MC_Enderman object representing the entity
	 * @throws NotRequestedEntityTypeException If the entity is not an enderman
	 */
	public MC_Enderman getAsEnderman() throws NotRequestedEntityTypeException{
		if(ent instanceof MC_Enderman){
			MC_Enderman man = (MC_Enderman)ent;
			return man;
		}else throw new NotRequestedEntityTypeException(ent);
	}
	
	/**
	 * Converts the entity to a horse
	 * @return An MC_Horse object representing the entity
	 * @throws NotRequestedEntityTypeException If the entity is not a horse
	 */
	public MC_Horse getAsHorse() throws NotRequestedEntityTypeException{
		if(ent instanceof MC_Horse){
			MC_Horse hse = (MC_Horse)ent;
			return hse;
		}
		else throw new NotRequestedEntityTypeException(ent);
	}
	
	/**
	 * Converts the entity to an ocelot (cat)
	 * @return An MC_Ocelot object representing the ocelot (cat)
	 * @throws NotRequestedEntityTypeException If the entity is not an ocelot (cat)
	 */
	public MC_Ocelot getAsOcelot() throws NotRequestedEntityTypeException{
		if(ent instanceof MC_Ocelot){
			MC_Ocelot oce = (MC_Ocelot)ent;
			return oce;
		}
		else throw new NotRequestedEntityTypeException(ent);
	}
	
	/**
	 * Converts the entity to a skeleton
	 * @return An MC_Skeleton object representing the entity
	 * @throws NotRequestedEntityTypeException If the entity is not a skeleton
	 */
	public MC_Skeleton getAsSkeleton() throws NotRequestedEntityTypeException{
		if(ent instanceof MC_Skeleton){
			MC_Skeleton skel = (MC_Skeleton)ent;
			return skel;
		}
		else throw new NotRequestedEntityTypeException(ent);
	}

	/**
	 * Converts the entity to a wolf
	 * @return An MC_Enderman object representing the entity
	 * @throws NotRequestedEntityTypeException If the entity is not a wolf
	 */
	public MC_Wolf getAsWolf() throws NotRequestedEntityTypeException{
		if(ent instanceof MC_Wolf){
			MC_Wolf wolf = (MC_Wolf)ent;
			return wolf;
		}
		else throw new NotRequestedEntityTypeException(ent);
	}
	
	/**
	 * Converts the entity to a zombie
	 * @return An MC_Zombie object representing the entity
	 * @throws NotRequestedEntityTypeException If the entity is not a zombie
	 */
	public MC_Zombie getAsZombie() throws NotRequestedEntityTypeException{
		if(ent instanceof MC_Zombie){
			MC_Zombie zom = (MC_Zombie)ent;
			return zom;
		}
		else throw new NotRequestedEntityTypeException(ent);
	}
	
	/**
	 * Converts the entity to a tameable animal. 
	 * HINT: MC_Ocelot and MC_Wolf are both MC_AnimalTameable subinterfaces. If your animal is a ocelot or a wolf use those converter methods for maximum method availability
	 * @return An MC_Enderman object representing the entity
	 * @throws NotRequestedEntityTypeException If the entity is not a wolf
	 */
	public MC_AnimalTameable getAsTameableAnimal() throws NotRequestedEntityTypeException{
		if(ent instanceof MC_AnimalTameable){
			MC_AnimalTameable tameable = (MC_AnimalTameable)ent;
			return tameable;
		}else throw new NotRequestedEntityTypeException(ent);
	}
	
	/**
	 * Converts the entity to a ageable entity. 
	 * HINT: MC_Animal is a subinterface of MC_EntityAgeable. This will give you all the methods an MC_Animal class will.
	 * @return An MC_Enderman object representing the entity
	 * @throws NotRequestedEntityTypeException If the entity is not a wolf
	 */
	public MC_EntityAgeable getAsAgeableEntity() throws NotRequestedEntityTypeException{
		if(ent instanceof MC_EntityAgeable){
			MC_EntityAgeable ageable = (MC_EntityAgeable)ent;
			return ageable;
		}else throw new NotRequestedEntityTypeException(ent);
	}
	
	public MC_Animal getAsAnimal() throws NotRequestedEntityTypeException{
		if(ent instanceof MC_Animal){
			MC_Animal animal = (MC_Animal)ent;
			return animal;
		}else throw new NotRequestedEntityTypeException(ent);
	}
	
}
