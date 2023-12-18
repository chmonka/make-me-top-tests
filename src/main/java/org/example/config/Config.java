package org.example.config;
@Config.Sources("file:src/main/resources/configTest.properties")
public interface Config extends org.aeonbits.owner.Config {
    @Key("baseURI")
    String baseURI();

    @Key("url")
    String url();

    @Key("user")
    String user();

    @Key("password")
    String password();
}
