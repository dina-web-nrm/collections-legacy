package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20160210-rNA", date="2016-02-11T12:23:20")
@StaticMetamodel(BaseEntity.class)
public abstract class BaseEntity_ { 

    public static volatile SingularAttribute<BaseEntity, Date> timestampModified;
    public static volatile SingularAttribute<BaseEntity, Date> timestampCreated;
    public static volatile SingularAttribute<BaseEntity, Integer> version;

}