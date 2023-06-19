package io.com.user.api.usermanagement.dto;

import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
/**
 * The UserOutDto class represents the output DTO for retrieving user details.
 * It contains various attributes that describe the user's information.
 * @author abhis
 */
public class UserOutDto {

	/**
	 * The unique identifier of the user.
	 */
	private Long userId;
	
	/**
	 * The username of the user.
	 */
	private String userName;

	/**
	 * The email address of the user.
	 */
	private String email;

	/**
	 * The date and time when the user was created.
	 */
	private Instant createdDt;

	/**
	 * The address line 1 of the user's address.
	 */
	private String addressLine1;

	/**
	 * The city of the user's address.
	 */
	private String city;

	/**
	 * The state of the user's address.
	 */
	private String state;

	/**
	 * The country of the user's address.
	 */
	private String country;

	/**
	 * Indicates whether the user is a business user or not.
	 */
	private boolean isBusiness;

	/**
	 * The name of the business (applicable only if the user is a business user).
	 */
	private String bizName;
}
