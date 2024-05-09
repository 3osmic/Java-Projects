package contactCRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ContactDAO {
	// helper method to convert a ResultSet object returned from JDBC call to a Contact object.
	private Contact createContactPerson(ResultSet rs) {
		Contact p = new Contact();
		try {
			p.setId(rs.getInt("id"));
			p.setName(rs.getString("name"));
			p.setAddress(rs.getString("address"));
			p.setCellPhone(rs.getString("cellphone"));
			p.setEmail(rs.getString("email"));
		} catch (SQLException ex) {
		}
		return p;
	}

	public List<Contact> findAll() {
		String sql = "Select * from contact order by id";
		List<Contact> list = new ArrayList<>();
		try {
			Connection connection = DbConnection.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Contact p = createContactPerson(rs);
				list.add(p);
			}
			rs.close();
			connection.close();
		} catch (SQLException ex) {
		}
		return list;
	}

	public Contact find(int id) {
		try {
			Contact contact = null;
			PreparedStatement ps = DbConnection.getConnection().prepareStatement("SELECT * from Contact WHERE id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				contact = createContactPerson(rs);
			}
			return contact;
		} catch (Exception e) {
			return null;
		}
	}

	public boolean delete(Contact contact) {
		// To be implemented by students
		try {
			Connection connection = DbConnection.getConnection();
			String delete_user = "DELETE FROM contact WHERE id = ?";
			
			try (PreparedStatement statement = connection.prepareStatement(delete_user)) {
				statement.setInt(1, contact.getId());
				int deletedRows = statement.executeUpdate();
				return deletedRows > 0;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean create(Contact contact) {
		// To be implemented by students
		try {
			Connection connection = DbConnection.getConnection();
			String create_user = "INSERT INTO contact (name, address, cellphone, email) VALUES (?, ?, ?, ?)";
			
			try (PreparedStatement statement = connection.prepareStatement(create_user)) {
				statement.setString(1, contact.getName());
                statement.setString(2, contact.getAddress());
                statement.setString(3, contact.getCellPhone());
                statement.setString(4, contact.getEmail());
                
                int insertedRows = statement.executeUpdate();
                return insertedRows > 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean edit(Contact contact) {
		// To be implemented by students
		try {
			Connection connection = DbConnection.getConnection();
			String update_user = "UPDATE contact SET name = ?, address = ?, cellphone = ?, email = ? WHERE id = ?";
			
			try (PreparedStatement statement = connection.prepareStatement(update_user)) {
				statement.setString(1, contact.getName());
                statement.setString(2, contact.getAddress());
                statement.setString(3, contact.getCellPhone());
                statement.setString(4, contact.getEmail());
                statement.setInt(5, contact.getId());

                int updatedRows = statement.executeUpdate();
                return updatedRows > 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}