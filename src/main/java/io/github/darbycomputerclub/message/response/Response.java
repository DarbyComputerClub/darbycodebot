package io.github.darbycomputerclub.message.response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ullink.slack.simpleslackapi.SlackSession;
import com.ullink.slack.simpleslackapi.events.SlackMessagePosted;

/**
 * Basis for responses.
 */
public class Response {
	/**
	 * Logger.
	 */
	private static Logger logger = LoggerFactory.getLogger(Response.class);
	
	/**
	 * This class should not be created as an object.
	 */
	protected Response() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Performs no action.
	 * @param session 
	 * @param event 
	 */
	public static void processEvent(final SlackMessagePosted event, 
			final SlackSession session) {
		logger.warn("Interesting... "
			+ "An un implemented command was just called...");
		session.sendMessage(event.getChannel(), 
				"Command not implemented.", null);
	}
}
