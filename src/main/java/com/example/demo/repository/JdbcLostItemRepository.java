package com.example.demo.repository;

import com.example.demo.model.LostItem;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public class JdbcLostItemRepository implements LostItemRepository {

    private final JdbcTemplate jdbcTemplate;

    public JdbcLostItemRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private static class LostItemMapper implements RowMapper<LostItem> {
        @Override
        public LostItem mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new LostItem(
                    rs.getLong("id"),
                    rs.getString("name"),
                    rs.getDate("date_found").toLocalDate()
            );
        }
    }

    @Override
    public List<LostItem> findAll() {
        String sql = "SELECT * FROM lost_items ORDER BY id";
        return jdbcTemplate.query(sql, new LostItemMapper());
    }

    @Override
    public Optional<LostItem> findById(Long id) {
        String sql = "SELECT * FROM lost_items WHERE id = ?";
        List<LostItem> list = jdbcTemplate.query(sql, new LostItemMapper(), id);
        return list.stream().findFirst();
    }

    @Override
    public void create(LostItem item) {
        String sql = "INSERT INTO lost_items(name, date_found) VALUES (?, ?)";
        jdbcTemplate.update(sql, item.getName(), item.getDateFound());
    }

    @Override
    public void update(Long id, LostItem item) {
        String sql = "UPDATE lost_items SET name=?, date_found=? WHERE id=?";
        jdbcTemplate.update(sql, item.getName(), item.getDateFound(), id);
    }

    @Override
    public void delete(Long id) {
        String sql = "DELETE FROM lost_items WHERE id=?";
        jdbcTemplate.update(sql, id);
    }
}
