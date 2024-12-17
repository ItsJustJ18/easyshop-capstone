package org.yearup.data.mysql;

import org.springframework.stereotype.Component;
import org.yearup.data.CategoryDao;
import org.yearup.models.Category;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class MySqlCategoryDao extends MySqlDaoBase implements CategoryDao {
    public MySqlCategoryDao(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public List<Category> getAllCategories() {
        // get all categories
        List<Category> categoriesList = new ArrayList<>();

        try (Connection connection = getConnection()) {
            PreparedStatement statement = connection.prepareStatement("""
                    SELECT * FROM categories
                    """);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Category category = mapRow(resultSet);
                categoriesList.add(category);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Was unable to retrieve the categories.", e);
        }
        return categoriesList;
    }

    @Override
    public Category getById(int categoryId) {
        // get category by id

        try (Connection connection = getConnection()) {
            PreparedStatement statement = connection.prepareStatement("""
                    SELECT * FROM categories WHERE id = ?
                    """);

            ResultSet resultSet = statement.executeQuery();
            statement.setInt(1, categoryId);

            while (resultSet.next()) {

                if (resultSet.next()) {

                    return mapRow(resultSet);
                } else {
                    return null;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Not able to retrieve the category ID", e);
        }
        return null;
    }

    @Override
    public Category create(Category category) {
        // create a new category
        return null;
    }

    @Override
    public void update(int categoryId, Category category) {
        // update category
    }

    @Override
    public void delete(int categoryId) {
        // delete category
    }

    private Category mapRow(ResultSet row) throws SQLException {
        int categoryId = row.getInt("category_id");
        String name = row.getString("name");
        String description = row.getString("description");

        Category category = new Category() {{
            setCategoryId(categoryId);
            setName(name);
            setDescription(description);
        }};

        return category;
    }

}
