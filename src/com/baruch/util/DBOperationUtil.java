package com.baruch.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

public final class DBOperationUtil {
	private static Log logger = LogFactory.getLog(DBOperationUtil.class);

	public static void closeSession(Session session) {
		if (null == session) {
			return;
		}

		try {
			session.close();
		} catch (Exception e) {
			logger.error("Closing session failed.", e);
		}
	}
}
