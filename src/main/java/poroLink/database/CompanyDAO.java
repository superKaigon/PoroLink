package poroLink.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import poroLink.entities.Company;
import poroLink.entities.base.BaseEntity;

public class CompanyDAO extends BaseDAO{
	
	public static final String TABLE = "Company";
	public static final String ID = "company_id";
	public static final String ADDRESS = "address";
	public static final String NAME = "company_name";
	public static final String DESCRIPTION = "description";
	public static final String LINKS = "links";
	public static final String POSTS = "posts";
	public static final String SIRET = "siret=";


	public CompanyDAO() {
		super(TABLE, ID);
		// TODO Auto-generated constructor stub
	}

	
	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#parse(java.sql.ResultSet)
	 */
	@Override
	public BaseEntity parseResultSetToObject(ResultSet rs) {
		Company company = new Company();
		
		try {
			company.setId(rs.getDouble(ID));
			company.setCompany_name(rs.getString(NAME));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			company = null;
		}
		
		return company;
	}
	
	@Override
	public String parseInsert(BaseEntity item) {
		String result = "null,";
		Company company = (Company) item;

		result += "'" + company.getCompany_name() + "'";
		

		return result;
	}

	@Override
	public String parseUpdate(BaseEntity item) {
		String result = "";
		Company company = (Company) item;

		result += NAME + " = '" + company.getCompany_name() + "'";
		

		return result;
	}

}
