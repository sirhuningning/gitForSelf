package com.hu.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统用户关联查询数据实体
 */
public class sysRoleDao implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer cid;
	private String username;
	private Integer departmenid;
	private String email;
	private Integer colid;
	private Integer parentid;
	private String operate;
	private String columnname;
	private String anothercolname;
	private Integer columnslevel;
	private String url;
	private String classcssname; 
	private String roletype;
	private String departmentcode;
	private Integer status;
	private String lastloginip;
	private Date lastlogintime;
	private String rolename;
	private String realname;
	private String team;//团队
	private String department;
	private String roledescribe;
	private String roleid;
	private String rank;
	private String alias;
	private Integer calltype;
	private String userphone;
	
	public Integer getCid(){
		return cid;
	}

	public void setCid(Integer cid){
		this.cid = cid;
	}

	public String getRoleid(){
		return roleid;
	}

	public void setRoleid(String roleid){
		this.roleid = roleid;
	}

	public String getRoledescribe(){
		return roledescribe;
	}

	public void setRoledescribe(String roledescribe){
		this.roledescribe = roledescribe;
	}

	public String getUsername(){
		return username;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getTeam(){
		return team;
	}

	public void setTeam(String team){
		this.team = team;
	}

	public String getDepartment(){
		return department;
	}

	public void setDepartment(String department){
		this.department = department;
	}

	public Integer getStatus(){
		return status;
	}

	public void setStatus(Integer status){
		this.status = status;
	}

	public String getLastloginip(){
		return lastloginip;
	}

	public void setLastloginip(String lastloginip){
		this.lastloginip = lastloginip;
	}

	public Date getLastlogintime(){
		return lastlogintime;
	}

	public void setLastlogintime(Date lastlogintime){
		this.lastlogintime = lastlogintime;
	}

	public String getRolename(){
		return rolename;
	}

	public void setRolename(String rolename){
		this.rolename = rolename;
	}

	public String getRealname(){
		return realname;
	}

	public void setRealname(String realname){
		this.realname = realname;
	}

	public String getDepartmentcode(){
		return departmentcode;
	}

	public void setDepartmentcode(String departmentcode){
		this.departmentcode = departmentcode;
	}

	public String getRoletype(){
		return roletype;
	}

	public void setRoletype(String roletype){
		this.roletype = roletype;
	}

	public String getClasscssname(){
		return classcssname;
	}

	public void setClasscssname(String classcssname){
		this.classcssname = classcssname;
	}

	public Integer getId(){
		return id;
	}

	public void setId(Integer id){
		this.id = id;
	}

	public Integer getDepartmenid(){
		return departmenid;
	}

	public void setDepartmenid(Integer departmenid){
		this.departmenid = departmenid;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public Integer getColid(){
		return colid;
	}

	public void setColid(Integer colid){
		this.colid = colid;
	}

	public Integer getParentid(){
		return parentid;
	}

	public void setParentid(Integer parentid){
		this.parentid = parentid;
	}

	public String getOperate(){
		return operate;
	}

	public void setOperate(String operate){
		this.operate = operate;
	}

	public String getColumnname(){
		return columnname;
	}
	
	public void setColumnname(String columnname){
		this.columnname = columnname;
	}
	
	public String getAnothercolname(){
		return anothercolname;
	}
	
	public void setAnothercolname(String anothercolname){
		this.anothercolname = anothercolname;
	}

	public Integer getColumnslevel(){
		return columnslevel;
	}

	public void setColumnslevel(Integer columnslevel){
		this.columnslevel = columnslevel;
	}

	public String getUrl(){
		return url;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getRank(){
		return rank;
	}

	public void setRank(String rank){
		this.rank = rank;
	}

	public String getAlias(){
		return alias;
	}

	public void setAlias(String alias){
		this.alias = alias;
	}

	public Integer getCalltype() {
		return calltype;
	}

	public void setCalltype(Integer calltype) {
		this.calltype = calltype;
	}

	public String getUserphone() {
		return userphone;
	}

	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
}