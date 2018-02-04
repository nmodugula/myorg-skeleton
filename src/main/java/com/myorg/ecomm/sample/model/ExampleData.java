/**
 * 
 */
package com.myorg.ecomm.sample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hjp299
 *
 */
@Data
@Entity
@NoArgsConstructor
public class ExampleData {
	@Id
	@GeneratedValue
	private String id;

}
