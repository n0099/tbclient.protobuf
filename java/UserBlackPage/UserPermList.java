package tbclient.UserBlackPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.PermissionList;

public final class UserPermList extends Message {
  public static final String DEFAULT_NAME_SHOW = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Long DEFAULT_UID = Long.valueOf(0L);
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String name_show;
  
  @ProtoField(tag = 2)
  public final PermissionList perm_list;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long uid;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String user_name;
  
  public UserPermList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.uid;
      if (long_ == null) {
        this.uid = DEFAULT_UID;
      } else {
        this.uid = long_;
      } 
      this.perm_list = paramBuilder.perm_list;
      String str1 = paramBuilder.user_name;
      if (str1 == null) {
        this.user_name = "";
      } else {
        this.user_name = str1;
      } 
      str1 = paramBuilder.name_show;
      if (str1 == null) {
        this.name_show = "";
      } else {
        this.name_show = str1;
      } 
      str = paramBuilder.portrait;
      if (str == null) {
        this.portrait = "";
      } else {
        this.portrait = str;
      } 
    } else {
      this.uid = ((Builder)str).uid;
      this.perm_list = ((Builder)str).perm_list;
      this.user_name = ((Builder)str).user_name;
      this.name_show = ((Builder)str).name_show;
      this.portrait = ((Builder)str).portrait;
    } 
  }
  
  public UserPermList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserPermList> {
    public String name_show;
    
    public PermissionList perm_list;
    
    public String portrait;
    
    public Long uid;
    
    public String user_name;
    
    public Builder() {}
    
    public Builder(UserPermList param1UserPermList) {
      super(param1UserPermList);
      if (param1UserPermList == null)
        return; 
      this.uid = param1UserPermList.uid;
      this.perm_list = param1UserPermList.perm_list;
      this.user_name = param1UserPermList.user_name;
      this.name_show = param1UserPermList.name_show;
      this.portrait = param1UserPermList.portrait;
    }
    
    public UserPermList build(boolean param1Boolean) {
      return new UserPermList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
