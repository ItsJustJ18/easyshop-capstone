package org.yearup.data.mysql;

import org.springframework.stereotype.Component;
import org.yearup.data.CategoryDao;
import org.yearup.models.Category;

import javax.sql.DataSource;
import java.sql.*;
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
        Category category = null;
        try (Connection connection = getConnection()) {
            PreparedStatement statement = connection.prepareStatement("""
                    SELECT * FROM categories WHERE category_id = ?;
                    """);

            statement.setInt(1, categoryId);
            ResultSet resultSet = statement.executeQuery();


            if (resultSet.next()) {

                category = mapRow(resultSet);
            } else {
                System.out.println("Nothing found. ");
            }

        } catch (SQLException e) {
            throw new RuntimeException("Not able to retrieve the category ID", e);
        }
        return category;
    }

    @Override
    public Category create(Category category) {
        // create a new category
        try (Connection connection = getConnection()) {
            PreparedStatement statement = connection.prepareStatement("""
                    INSERT INTO categories VALUES (null, ?, ?)
                    """, Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, category.getName());
            statement.setString(2, category.getDescription());
            statement.execute();

            ResultSet gen_key = statement.getGeneratedKeys();

            if (gen_key.next()) {
                int id = gen_key.getInt(1);
                return new Category(id, category.getName(), category.getDescription());
            }


        } catch (SQLException e) {
            throw new RuntimeException("Could not create new information.", e);
        }
        return null;
    }

    @Override
    public void update(int categoryId, Category category) {
        // update category
        try (Connection connection = getConnection()) {

            PreparedStatement statement = connection.prepareStatement("""
                    UPDATE categories
                    SET category_id = ?, name = ?, description = ?
                    WHERE category_id = ?
                    """);

            statement.setInt(1, category.getCategoryId());
            statement.setString(2, category.getName());
            statement.setString(3, category.getDescription());
            statement.setInt(4, categoryId);

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(); throw new RuntimeException(e);
        }
    }


    @Override
    public void delete(int categoryId) {
        // delete category
        try (Connection connection = getConnection()) {

            PreparedStatement statement = connection.prepareStatement("""
                    DELETE FROM categories WHERE category_id = ?
                    """);

            statement.setInt(1, categoryId);
            statement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
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
