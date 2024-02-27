package com.hm.pojo;

import com.hm.pojo.Candidate;
import com.hm.pojo.CandidateJob;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2024-01-03T17:10:19")
@StaticMetamodel(CurriculumVitae.class)
public class CurriculumVitae_ { 

    public static volatile SingularAttribute<CurriculumVitae, Integer> isDeleted;
    public static volatile SetAttribute<CurriculumVitae, CandidateJob> candidateJobSet;
    public static volatile SingularAttribute<CurriculumVitae, String> skill;
    public static volatile SingularAttribute<CurriculumVitae, String> experienceDetail;
    public static volatile SingularAttribute<CurriculumVitae, String> foreignLanguage;
    public static volatile SingularAttribute<CurriculumVitae, Integer> id;
    public static volatile SingularAttribute<CurriculumVitae, Candidate> candidateID;
    public static volatile SingularAttribute<CurriculumVitae, String> careerGoals;
    public static volatile SingularAttribute<CurriculumVitae, String> degreeDetail;
    public static volatile SingularAttribute<CurriculumVitae, String> cvLink;

}