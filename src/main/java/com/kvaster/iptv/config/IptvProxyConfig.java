package com.kvaster.iptv.config;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IptvProxyConfig {
    private String host = "127.0.0.1";
    private int port = 8080;
    private String baseUrl;
    private String tokenSalt;
    private List<IptvServerConfig> servers;
    private boolean allowAnonymous = true;
    private Set<String> users = new HashSet<>();
    private int timeoutSec = 15;

    protected IptvProxyConfig() {
        // for deserialization
    }

    public IptvProxyConfig(
            String host, int port, String baseUrl, String tokenSalt, List<IptvServerConfig> servers,
            boolean allowAnonymous, Set<String> users, int timeoutSec
    ) {
        this.host = host;
        this.port = port;
        this.baseUrl = baseUrl;
        this.tokenSalt = tokenSalt;
        this.servers = new ArrayList<>(servers);
        this.allowAnonymous = allowAnonymous;
        this.users = new HashSet<>(users);
        this.timeoutSec = timeoutSec;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getTokenSalt() {
        return tokenSalt;
    }

    public List<IptvServerConfig> getServers() {
        return servers;
    }

    public boolean getAllowAnonymous() {
        return allowAnonymous;
    }

    public Set<String> getUsers() {
        return users;
    }

    public int getTimeoutSec() {
        return timeoutSec;
    }
}
