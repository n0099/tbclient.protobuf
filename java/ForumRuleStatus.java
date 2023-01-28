package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumRuleStatus extends Message {
  public static final Integer DEFAULT_AUDIT_STATUS;
  
  public static final Integer DEFAULT_HAS_FORUM_RULE;
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer audit_status;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer has_forum_rule;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_AUDIT_STATUS = integer;
    DEFAULT_HAS_FORUM_RULE = integer;
  }
  
  public ForumRuleStatus(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      Integer integer1 = paramBuilder.audit_status;
      if (integer1 == null) {
        this.audit_status = DEFAULT_AUDIT_STATUS;
      } else {
        this.audit_status = integer1;
      } 
      integer = paramBuilder.has_forum_rule;
      if (integer == null) {
        this.has_forum_rule = DEFAULT_HAS_FORUM_RULE;
      } else {
        this.has_forum_rule = integer;
      } 
    } else {
      this.title = ((Builder)integer).title;
      this.audit_status = ((Builder)integer).audit_status;
      this.has_forum_rule = ((Builder)integer).has_forum_rule;
    } 
  }
  
  public ForumRuleStatus(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumRuleStatus> {
    public Integer audit_status;
    
    public Integer has_forum_rule;
    
    public String title;
    
    public Builder() {}
    
    public Builder(ForumRuleStatus param1ForumRuleStatus) {
      super(param1ForumRuleStatus);
      if (param1ForumRuleStatus == null)
        return; 
      this.title = param1ForumRuleStatus.title;
      this.audit_status = param1ForumRuleStatus.audit_status;
      this.has_forum_rule = param1ForumRuleStatus.has_forum_rule;
    }
    
    public ForumRuleStatus build(boolean param1Boolean) {
      return new ForumRuleStatus(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
