package HikariConfig;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

public class DataSourceConfig {

    private static HikariDataSource dataSource;

    static {
        // Create HikariCP configuration
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/database"); // Set your database URL
        config.setUsername("root"); // Set your database username
        config.setPassword("P@ssw0rd^%$#@!"); // Set your database password
        config.setMaximumPoolSize(15); // Set maximum connections in the pool
        config.setConnectionTimeout(30000); // Set timeout for obtaining connections
        config.setIdleTimeout(600000); // Set idle timeout for connections in milliseconds
        config.setMaxLifetime(1800000); // Set maximum lifetime of a connection in milliseconds

        // Create data source
        dataSource = new HikariDataSource(config);
    }

    // Provide access to the DataSource
    public static DataSource getDataSource() {
        return dataSource;
    }
}

