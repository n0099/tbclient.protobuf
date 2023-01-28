package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class BawuRoleDes extends Message {
  public static final List<BawuRoleInfoPub> DEFAULT_ROLE_INFO = Collections.emptyList();
  
  public static final String DEFAULT_ROLE_NAME = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<BawuRoleInfoPub> role_info;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String role_name;
  
  public BawuRoleDes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<BawuRoleInfoPub> list;
    if (paramBoolean == true) {
      String str = paramBuilder.role_name;
      if (str == null) {
        this.role_name = "";
      } else {
        this.role_name = str;
      } 
      list = paramBuilder.role_info;
      if (list == null) {
        this.role_info = DEFAULT_ROLE_INFO;
      } else {
        this.role_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.role_name = ((Builder)list).role_name;
      this.role_info = Message.immutableCopyOf(((Builder)list).role_info);
    } 
  }
  
  public BawuRoleDes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<BawuRoleDes> {
    public List<BawuRoleInfoPub> role_info;
    
    public String role_name;
    
    public Builder() {}
    
    public Builder(BawuRoleDes param1BawuRoleDes) {
      super(param1BawuRoleDes);
      if (param1BawuRoleDes == null)
        return; 
      this.role_name = param1BawuRoleDes.role_name;
      this.role_info = Message.copyOf(param1BawuRoleDes.role_info);
    }
    
    public BawuRoleDes build(boolean param1Boolean) {
      return new BawuRoleDes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
