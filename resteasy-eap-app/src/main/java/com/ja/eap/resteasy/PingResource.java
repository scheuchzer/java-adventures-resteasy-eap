package com.ja.eap.resteasy;

import com.ja.eap.resteasy.api.Ping;

public class PingResource implements Ping {

	@Override
	public String ping() {
		return "pong";
	}

}
