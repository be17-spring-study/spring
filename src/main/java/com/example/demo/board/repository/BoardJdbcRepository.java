package com.example.demo.board.repository;

import com.example.demo.board.BoardDto;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardJdbcRepository implements BoardRepository {

    private final JdbcTemplate jdbcTemplate;

    public BoardJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(BoardDto.Create board) {
        System.out.println(board.toString());
        String sql = "INSERT INTO board(name, contents) values(?, ?);";
        jdbcTemplate.update(sql, board.getName(), board.getContents());
    }

    @Override
    public BoardDto.Board findById(Long id) {
        String sql = "SELECT * FROM board WHERE id = ?;";
        return jdbcTemplate.queryForObject(sql, boardRowMapper(), id);
    }

    private RowMapper<BoardDto.Board> boardRowMapper() {
        return ( (rs, rowNum) -> {
            BoardDto.Board board = new BoardDto.Board();
            board.setId(rs.getLong("id"));
            board.setName(rs.getString("name"));
            board.setContents(rs.getString("contents"));

            return board;
        });
    }

    @Override
    public List<BoardDto.Board> findAll() {
        String sql = "SELECT * FROM board;";

//        return jdbcTemplate.query(sql, boardRowMapper());
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(BoardDto.Board.class));
    }
}
