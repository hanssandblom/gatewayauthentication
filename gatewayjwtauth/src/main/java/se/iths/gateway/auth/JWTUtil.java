package se.iths.gateway.auth;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;

@Component
public class JWTUtil {
    public Jws<Claims> getAllClaimsFromToken(String authToken) {
        //Change secret to signing key from auth service.
        return  Jwts.parser()
                .setSigningKey("vmPgBsN5Mp2voOKgv3cnQmgPbAVdCj2NzEeO42d7wV2IdVBu8Fs7XBkp3DipNG0xSqu7o310nDxRavIyBeTOdg".getBytes(StandardCharsets.UTF_8))
                .parseClaimsJws(authToken);
    }
}
