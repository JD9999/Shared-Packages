package Exceptions;

import PluginReference.MC_Entity;

public class NotRequestedEntityTypeException extends Exception{

	/**
	 * The reason for the exception
	 */
	String reason;
	private static final long serialVersionUID = 513L;
	
	/**
	 * The entity constructor
	 * Creates a NotRequestedEntityTypeException object, identifying the entity in the reason
	 * @param ent The entity that is not the requested type
	 */
	public NotRequestedEntityTypeException(MC_Entity ent) {
		this("Entity " + ent.getName() + " is not the requested type!");
	}

	/**
	 * The reason constructor
	 * Creates a NotRequestedEntityTypeException object, from the reason provided.
	 * @param string The reason for the exception
	 */
	public NotRequestedEntityTypeException(String string) {
		reason = string;
	}

	/**
	 * Gets the reason for the exception
	 * @return the reason for the exception
	 */
	public String getMessage(){
		return reason;
	}

}
