package org.trello4j.model;


public class Board extends TrelloObject {

	private String name;
	private String desc;
	private boolean closed;
	private boolean invited = false;
	private String idOrganization;
	private String url;
	private Prefs prefs;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getIdOrganization() {
		return idOrganization;
	}

	public void setIdOrganization(String idOrganization) {
		this.idOrganization = idOrganization;
	}

	public boolean isClosed() {
		return closed;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Prefs getPrefs() {
		return prefs;
	}

	public void setPrefs(Prefs prefs) {
		this.prefs = prefs;
	}

	public boolean isInvited() {
		return invited;
	}

	public void setInvited(boolean invited) {
		this.invited = invited;
	}


}
