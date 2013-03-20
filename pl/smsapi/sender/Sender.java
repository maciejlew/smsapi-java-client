package pl.smsapi.sender;

import java.util.ArrayList;
import pl.smsapi.message.Message;
import pl.smsapi.message.Result;

public abstract class Sender {

	private String protocol = "https";
	private String hostForHttps = "ssl.smsapi.pl";
	private String hostForHttp = "api.smsapi.pl";
	protected String path;
	protected Message message;
	protected ArrayList<Result> results;

	//----abstract method--------------
	public abstract boolean send();

	//---end--abstract method---------
	public final String getProtocol() {
		return protocol;
	}

	public final ArrayList<Result> getResults() {
		return results;
	}

	public final String getHost() {
		return protocol.equals("http") == true ? hostForHttp : hostForHttps;
	}

	public final void setHostForHttp(String hostUrl) {
		this.hostForHttp = hostUrl;
	}

	public final void setHostForHttps(String hostUrl) {
		this.hostForHttps = hostUrl;
	}

	public final Message getMessage() {
		return message;
	}

	public final void setMessage(Message message) {
		this.message = message;
	}

	public void setMethod(Object method) {
	}

	;
	
	public final void setProtocol(String protocol) {
		if (protocol.equals("http") || protocol.equals("https")) {
			this.protocol = protocol;
		}
	}
}
