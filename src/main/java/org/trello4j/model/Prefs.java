package org.trello4j.model;

/**
 * @author Franco Vannasaeng on 6/7/15 5:22 PM
 */
public class Prefs {
	
	private PermissionType voting;
	private PermissionType permissionLevel;
	private PermissionType invitations;
	private PermissionType comments;
	
	public PermissionType getVoting() {
		return voting;
	}
	
	public void setVoting(PermissionType voting) {
		this.voting = voting;
	}
	
	public PermissionType getPermissionLevel() {
		return permissionLevel;
	}
	
	public void setPermissionLevel(PermissionType permissionLevel) {
		this.permissionLevel = permissionLevel;
	}
	
	public PermissionType getInvitations() {
		return invitations;
	}
	
	public void setInvitations(PermissionType invitations) {
		this.invitations = invitations;
	}
	
	public PermissionType getComments() {
		return comments;
	}
	
	public void setComments(PermissionType comments) {
		this.comments = comments;
	}
	
}
