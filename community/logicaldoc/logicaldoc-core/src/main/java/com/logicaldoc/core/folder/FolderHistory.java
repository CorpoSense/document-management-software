package com.logicaldoc.core.folder;

import com.logicaldoc.core.History;

/**
 * History entry due to an event on a folder.
 * 
 * @author Marco Meschieri - LogicalDOC
 * @since 6.4
 */
public class FolderHistory extends History {

	@Override
	public Object clone() {
		FolderHistory history = new FolderHistory();
		history.setDate(getDate());
		history.setDocId(getDocId());
		history.setFolderId(getFolderId());
		history.setUser(getUser());
		history.setEvent(getEvent());
		history.setComment(getComment());
		history.setReason(getReason());
		history.setVersion(getVersion());
		history.setPath(getPath());
		history.setPathOld(getPathOld());
		history.setNotified(getNotified());
		history.setSessionId(getSessionId());
		history.setIsNew(getIsNew());
		history.setFilename(getFilename());
		history.setFilenameOld(getFilenameOld());
		history.setUserId(getUserId());
		history.setUsername(getUsername());
		history.setUserLogin(getUserLogin());
		history.setNotifyEvent(isNotifyEvent());
		history.setIp(getIp());

		return history;
	}
}