package org.trello4j.gson;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import org.trello4j.model.PermissionType;

import java.lang.reflect.Type;


/**
 * We need extra handling of permission types "public, organization, members" since "public" is a reserved word in java.
 * 
 * @author joel
 */
public class PermissionTypeDeserializer implements JsonDeserializer<PermissionType> {
	
	public PermissionType deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		
		final String upperCaseJson = json.getAsString().toUpperCase();
		
//		PermissionType[] permissionTypes = PermissionType.values();
//		for (PermissionType permissionType : permissionTypes) {
//			if (permissionType.name().equals(upperCaseJson))
//				return permissionType;
//		}

		return PermissionType.valueOf(upperCaseJson);
	}
	
}
