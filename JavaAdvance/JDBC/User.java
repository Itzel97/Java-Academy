package com.softtek.com.java.academy.jbdc;



public class User {

		private String userName;
		private String password;
		private String name;
		private UserRole user_role_id;
		private String active;
		
		
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public UserRole getUser_role_id() {
			return user_role_id;
		}
		public void setUser_role_id(UserRole user_role_id) {
			this.user_role_id = user_role_id;
		}
		public String getActive() {
			return active;
		}
		public void setActive(String active) {
			this.active = active;
		}	 
		
		
		
}
