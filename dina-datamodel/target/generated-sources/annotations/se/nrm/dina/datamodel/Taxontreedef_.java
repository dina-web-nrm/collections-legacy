package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Taxon;
import se.nrm.dina.datamodel.Taxontreedefitem;

@Generated(value="EclipseLink-2.7.0.v20160122-rNA", date="2016-01-23T14:02:07")
@StaticMetamodel(Taxontreedef.class)
public class Taxontreedef_ extends BaseEntity_ {

    public static volatile SingularAttribute<Taxontreedef, Integer> taxonTreeDefID;
    public static volatile ListAttribute<Taxontreedef, Taxon> taxonList;
    public static volatile SingularAttribute<Taxontreedef, Integer> fullNameDirection;
    public static volatile SingularAttribute<Taxontreedef, String> name;
    public static volatile SingularAttribute<Taxontreedef, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Taxontreedef, Agent> createdByAgentID;
    public static volatile ListAttribute<Taxontreedef, Discipline> disciplineList;
    public static volatile ListAttribute<Taxontreedef, Taxontreedefitem> taxontreedefitemList;
    public static volatile SingularAttribute<Taxontreedef, String> remarks;

}