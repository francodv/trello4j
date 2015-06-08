package org.trello4j.model;

/**
 * @author Franco Vannasaeng
 *         on 6/7/15 5:15 PM
 */
public enum PermissionType {
	PUBLIC(0),
	ORGANIZATION(1),
	MEMBERS(2),
	ORG(3),
	PRIVATE(4),
	DISABLED(5);

	private final int id;

	PermissionType(int i) {
		this.id = i;
	}

	public int getId() {
		return id;
	}



}
