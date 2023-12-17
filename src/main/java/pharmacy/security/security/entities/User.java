package pharmacy.security.security.entities;

import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Set;

import io.jsonwebtoken.Claims;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Claims {

    private Integer id_user;
    private String email;
    private String state;

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public boolean containsKey(Object key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'containsKey'");
    }

    @Override
    public boolean containsValue(Object value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'containsValue'");
    }

    @Override
    public Object get(Object key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public Object put(String key, Object value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'put'");
    }

    @Override
    public Object remove(Object key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void putAll(Map<? extends String, ? extends Object> m) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'putAll'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public Set<String> keySet() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keySet'");
    }

    @Override
    public Collection<Object> values() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'values'");
    }

    @Override
    public Set<Entry<String, Object>> entrySet() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'entrySet'");
    }

    @Override
    public String getIssuer() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIssuer'");
    }

    @Override
    public Claims setIssuer(String iss) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setIssuer'");
    }

    @Override
    public String getSubject() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSubject'");
    }

    @Override
    public Claims setSubject(String sub) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setSubject'");
    }

    @Override
    public String getAudience() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAudience'");
    }

    @Override
    public Claims setAudience(String aud) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAudience'");
    }

    @Override
    public Date getExpiration() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getExpiration'");
    }

    @Override
    public Claims setExpiration(Date exp) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setExpiration'");
    }

    @Override
    public Date getNotBefore() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNotBefore'");
    }

    @Override
    public Claims setNotBefore(Date nbf) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNotBefore'");
    }

    @Override
    public Date getIssuedAt() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIssuedAt'");
    }

    @Override
    public Claims setIssuedAt(Date iat) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setIssuedAt'");
    }

    @Override
    public String getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }

    @Override
    public Claims setId(String jti) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }

    @Override
    public <T> T get(String claimName, Class<T> requiredType) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }
    
}
