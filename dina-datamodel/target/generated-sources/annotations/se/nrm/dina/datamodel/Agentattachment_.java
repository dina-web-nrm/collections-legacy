package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attachment;

@Generated(value="EclipseLink-2.7.0.v20160122-rNA", date="2016-01-23T14:02:07")
@StaticMetamodel(Agentattachment.class)
public class Agentattachment_ extends BaseEntity_ {

    public static volatile SingularAttribute<Agentattachment, Agent> agentID;
    public static volatile SingularAttribute<Agentattachment, Integer> agentAttachmentID;
    public static volatile SingularAttribute<Agentattachment, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Agentattachment, Agent> createdByAgentID;
    public static volatile SingularAttribute<Agentattachment, Attachment> attachmentID;
    public static volatile SingularAttribute<Agentattachment, String> remarks;
    public static volatile SingularAttribute<Agentattachment, Integer> ordinal;

}