package org.trello4j;

import org.trello4j.model.Action;
import org.trello4j.model.Board;
import org.trello4j.model.Card;
import org.trello4j.model.Checklist;
import org.trello4j.model.Member;
import org.trello4j.model.Organization;
import org.trello4j.model.Prefs;

import java.util.List;

/**
 * 
 * @author joel
 */
public interface BoardService {

	Board getBoard(String boardId);

	List<Action> getActionsByBoard(String boardId, String... filter);

	Organization getOrganizationByBoard(String boardId, String... filter);

	List<Member> getMembersInvitedByBoard(String boardId, String... filter);

	List<Member> getMembersByBoard(String boardId, String... filter);

	List<org.trello4j.model.List> getListByBoard(String boardId,
			String... filter);

	List<Checklist> getChecklistByBoard(String boardId);

	List<Card> getCardsByBoard(String boardId, String... filter);

	Prefs getPrefsByBoard(String boardId);

}