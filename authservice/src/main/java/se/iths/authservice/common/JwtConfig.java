package se.iths.authservice.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtConfig {
    @Value("${security.jwt.uri:/auth/**}")
    private String Uri;

    //@Value("${security.jwt.header:Authorization}")
    @Value("${security.jwt.header:eyJhbGciOiJIUzUxMiJ9}")
    private String header;

    //@Value("${security.jwt.prefix:Bearer }")
    @Value("${security.jwt.prefix:eyJzdWIiOiJoYW5zIiwiaWF0IjoxNjE0NDU0NzkwLCJleHAiOjE2MTQ1NDExOTAsImF1dGhvcml0aWVzIjpbIlJPTEVfVVNFUiJdfQ}")
    private String prefix;

    @Value("${security.jwt.expiration:#{24*60*60}}")
    private int expiration;

    //JwtSecretKey
    //@Value("${security.jwt.secret:secret}")
    @Value("${security.jwt.secret:vmPgBsN5Mp2voOKgv3cnQmgPbAVdCj2NzEeO42d7wV2IdVBu8Fs7XBkp3DipNG0xSqu7o310nDxRavIyBeTOdg}")
    private String secret;

    public String getUri() {
        return Uri;
    }

    public String getHeader() {
        return header;
    }

    public String getPrefix() {
        return prefix;
    }

    public int getExpiration() {
        return expiration;
    }

    public String getSecret() {
        return secret;
    }
}