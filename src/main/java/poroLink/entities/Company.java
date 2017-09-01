package poroLink.entities;

//coucou
import java.util.List;

public class Company extends AppUser {

    private String company_name;
    private String address;
    private String description;
    private String links;
    private String siret;
    private List<Post> posts;
	/**
     * Default constructor
     */
    public Company(int id,String company_name) {
    	this.role_appuser=2;
    	this.company_name=company_name;
    }
    
    
	public Company() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the company_name
	 */
	public String getCompany_name() {
		return company_name;
	}
	/**
	 * @param company_name the company_name to set
	 */
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	/**
	 * @return the adress
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param adress the adress to set
	 */
	public void setAddress(String adress) {
		this.address = adress;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the links
	 */
	public String getLinks() {
		return links;
	}
	/**
	 * @param links the links to set
	 */
	public void setLinks(String links) {
		this.links = links;
	}
	/**
	 * @return the siret
	 */
	public String getSiret() {
		return siret;
	}
	/**
	 * @param siret the siret to set
	 */
	public void setSiret(String siret) {
		this.siret = siret;
	}
	/**
	 * @return the posts
	 */
	public List<Post> getPosts() {
		return posts;
	}
	/**
	 * @param posts the posts to set
	 */
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

    



}
