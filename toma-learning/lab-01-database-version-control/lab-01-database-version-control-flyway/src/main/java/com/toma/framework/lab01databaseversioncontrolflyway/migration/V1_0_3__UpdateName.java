package com.toma.framework.lab01databaseversioncontrolflyway.migration;

import org.flywaydb.core.api.MigrationVersion;
import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

/**
 * V1.0初始化
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/17
 */
public class V1_0_3__UpdateName extends BaseJavaMigration {


    @Override
    public void migrate(Context context) throws Exception {
        JdbcTemplate template =new JdbcTemplate(context.getConfiguration().getDataSource());
        template.query("SELECT id,name ,age,email status, info FROM `flyway`.`person`", new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                do {
                    String name = resultSet.getString("name");
                    if (Objects.equals(name,"Jack-28")){
                        int id = resultSet.getInt("id");
                        template.update("UPDATE `flyway`.`person` set name = ? where id =?","JAVA_flyway",id);
                    }
                }while (resultSet.next());
            }
        });
    }


    @Override
    public Integer getChecksum() {
        return super.getChecksum();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public MigrationVersion getVersion() {
        return super.getVersion();
    }
}
