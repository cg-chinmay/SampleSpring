package jp.co.rakuten.checkout.test;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component("offersDao")
public class OffersDAO {
    
    private NamedParameterJdbcTemplate jdbc;
    
    @Autowired
    public void setDataSource(DataSource jdbc) {
        this.jdbc = new NamedParameterJdbcTemplate(jdbc);
    }


    public List<Offer> getOffers(){
        
        return jdbc.query("Select * from Offers", new RowMapper<Offer>(){
            public Offer mapRow(ResultSet rs,int rowNum) throws SQLException{
                Offer offer = new Offer();
                offer.setId(rs.getInt("id"));
                offer.setName(rs.getNString("name"));
                offer.setEmail(rs.getNString("email"));
                offer.setText(rs.getNString("text"));
                return offer;
            }
        });
    }
    
    public Offer getOffer(int id){
        
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", id);
        
        return jdbc.queryForObject("Select * from Offers where id=:id", params, new RowMapper<Offer>(){
            public Offer mapRow(ResultSet rs,int rowNum) throws SQLException{
                Offer offer = new Offer();
                offer.setId(rs.getInt("id"));
                offer.setName(rs.getNString("name"));
                offer.setEmail(rs.getNString("email"));
                offer.setText(rs.getNString("text"));
                return offer;
            }
        });
    }

}
