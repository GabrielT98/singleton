import org.example.DatabaseConfiguration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    public void deveRetornarUser() {
        DatabaseConfiguration.getInstance().setUser("admin");
        assertEquals("admin", DatabaseConfiguration.getInstance().getUser());
    }

    @Test
    public void deveRetornarHost() {
        DatabaseConfiguration.getInstance().setHost("localhost");
        assertEquals("localhost", DatabaseConfiguration.getInstance().getHost());
    }
    @Test
    public void deveRetornarPassword() {
        DatabaseConfiguration.getInstance().setPassword("43221");
        assertEquals("43221", DatabaseConfiguration.getInstance().getPassword());
    }

    @Test
    public void deveRetornarPort() {
        DatabaseConfiguration.getInstance().setPort("3306");
        assertEquals("3306", DatabaseConfiguration.getInstance().getPort());
    }
    @Test
    public void deveRetornarDatabaseName() {
        DatabaseConfiguration.getInstance().setDatabaseName("mysql");
        assertEquals("mysql", DatabaseConfiguration.getInstance().getDatabaseName());
    }

}