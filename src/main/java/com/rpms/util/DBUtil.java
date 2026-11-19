
package com.rpms.util;

import java.sql.Connection;
import com.rpms.config.DatabaseConfig;

public class DBUtil {

    public static Connection getConnection() {
        return DatabaseConfig.getConnection();
    }
}
