package com.abc.h2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "job")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Job {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String jobName;
	private String jobDescription;
	private String jobLocation;
	private String jobType;
}
