package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThemeBackgroundInUser extends Message {
  public static final String DEFAULT_DYNAMIC = "";
  
  public static final String DEFAULT_EXCLUSIVE_NO = "";
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final String DEFAULT_PACKAGE_NAME = "";
  
  public static final Long DEFAULT_PROPS_ID = Long.valueOf(0L);
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String dynamic;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String exclusive_no;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String package_name;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long props_id;
  
  public ThemeBackgroundInUser(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.props_id;
      if (long_ == null) {
        this.props_id = DEFAULT_PROPS_ID;
      } else {
        this.props_id = long_;
      } 
      String str1 = paramBuilder.exclusive_no;
      if (str1 == null) {
        this.exclusive_no = "";
      } else {
        this.exclusive_no = str1;
      } 
      str1 = paramBuilder.jump_url;
      if (str1 == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str1;
      } 
      str1 = paramBuilder.dynamic;
      if (str1 == null) {
        this.dynamic = "";
      } else {
        this.dynamic = str1;
      } 
      str = paramBuilder.package_name;
      if (str == null) {
        this.package_name = "";
      } else {
        this.package_name = str;
      } 
    } else {
      this.props_id = ((Builder)str).props_id;
      this.exclusive_no = ((Builder)str).exclusive_no;
      this.jump_url = ((Builder)str).jump_url;
      this.dynamic = ((Builder)str).dynamic;
      this.package_name = ((Builder)str).package_name;
    } 
  }
  
  public ThemeBackgroundInUser(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThemeBackgroundInUser> {
    public String dynamic;
    
    public String exclusive_no;
    
    public String jump_url;
    
    public String package_name;
    
    public Long props_id;
    
    public Builder() {}
    
    public Builder(ThemeBackgroundInUser param1ThemeBackgroundInUser) {
      super(param1ThemeBackgroundInUser);
      if (param1ThemeBackgroundInUser == null)
        return; 
      this.props_id = param1ThemeBackgroundInUser.props_id;
      this.exclusive_no = param1ThemeBackgroundInUser.exclusive_no;
      this.jump_url = param1ThemeBackgroundInUser.jump_url;
      this.dynamic = param1ThemeBackgroundInUser.dynamic;
      this.package_name = param1ThemeBackgroundInUser.package_name;
    }
    
    public ThemeBackgroundInUser build(boolean param1Boolean) {
      return new ThemeBackgroundInUser(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
