/**
 * 
 */
package net.frontlinesms.messaging.sms.internet;

/**
 * Exception thrown when there was a problem initialising an {@link SmsInternetService}.
 * 
 * @author Alex
 */
@SuppressWarnings("serial")
class SmsInternetServiceInitialisationException extends Exception {
	public SmsInternetServiceInitialisationException(Throwable cause) {
		super(cause);
	}
}
