package com.hm.pojo;

import com.hm.pojo.Candidate;
import com.hm.pojo.Company;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2024-01-03T17:10:19")
@StaticMetamodel(Comment.class)
public class Comment_ { 

    public static volatile SingularAttribute<Comment, String> assessment;
    public static volatile SingularAttribute<Comment, Company> companyID;
    public static volatile SingularAttribute<Comment, Date> createdDate;
    public static volatile SingularAttribute<Comment, Integer> rating;
    public static volatile SingularAttribute<Comment, Integer> id;
    public static volatile SingularAttribute<Comment, Candidate> candidateID;

}