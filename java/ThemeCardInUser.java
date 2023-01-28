package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThemeCardInUser extends Message {
  public static final String DEFAULT_COORDINATE = "";
  
  public static final String DEFAULT_DYNAMIC_URL = "";
  
  public static final String DEFAULT_EXCLUSIVE_NO = "";
  
  public static final String DEFAULT_IMG_ANDROID = "";
  
  public static final String DEFAULT_IMG_IOS = "";
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final Integer DEFAULT_LEVEL;
  
  public static final Long DEFAULT_PROPS_ID = Long.valueOf(0L);
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String coordinate;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String dynamic_url;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String exclusive_no;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String img_android;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String img_ios;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer level;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long props_id;
  
  static {
    DEFAULT_LEVEL = Integer.valueOf(0);
  }
  
  public ThemeCardInUser(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.props_id;
      if (long_ == null) {
        this.props_id = DEFAULT_PROPS_ID;
      } else {
        this.props_id = long_;
      } 
      String str2 = paramBuilder.img_ios;
      if (str2 == null) {
        this.img_ios = "";
      } else {
        this.img_ios = str2;
      } 
      str2 = paramBuilder.coordinate;
      if (str2 == null) {
        this.coordinate = "";
      } else {
        this.coordinate = str2;
      } 
      str2 = paramBuilder.img_android;
      if (str2 == null) {
        this.img_android = "";
      } else {
        this.img_android = str2;
      } 
      Integer integer = paramBuilder.level;
      if (integer == null) {
        this.level = DEFAULT_LEVEL;
      } else {
        this.level = integer;
      } 
      String str1 = paramBuilder.dynamic_url;
      if (str1 == null) {
        this.dynamic_url = "";
      } else {
        this.dynamic_url = str1;
      } 
      str1 = paramBuilder.exclusive_no;
      if (str1 == null) {
        this.exclusive_no = "";
      } else {
        this.exclusive_no = str1;
      } 
      str = paramBuilder.jump_url;
      if (str == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str;
      } 
    } else {
      this.props_id = ((Builder)str).props_id;
      this.img_ios = ((Builder)str).img_ios;
      this.coordinate = ((Builder)str).coordinate;
      this.img_android = ((Builder)str).img_android;
      this.level = ((Builder)str).level;
      this.dynamic_url = ((Builder)str).dynamic_url;
      this.exclusive_no = ((Builder)str).exclusive_no;
      this.jump_url = ((Builder)str).jump_url;
    } 
  }
  
  public ThemeCardInUser(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThemeCardInUser> {
    public String coordinate;
    
    public String dynamic_url;
    
    public String exclusive_no;
    
    public String img_android;
    
    public String img_ios;
    
    public String jump_url;
    
    public Integer level;
    
    public Long props_id;
    
    public Builder() {}
    
    public Builder(ThemeCardInUser param1ThemeCardInUser) {
      super(param1ThemeCardInUser);
      if (param1ThemeCardInUser == null)
        return; 
      this.props_id = param1ThemeCardInUser.props_id;
      this.img_ios = param1ThemeCardInUser.img_ios;
      this.coordinate = param1ThemeCardInUser.coordinate;
      this.img_android = param1ThemeCardInUser.img_android;
      this.level = param1ThemeCardInUser.level;
      this.dynamic_url = param1ThemeCardInUser.dynamic_url;
      this.exclusive_no = param1ThemeCardInUser.exclusive_no;
      this.jump_url = param1ThemeCardInUser.jump_url;
    }
    
    public ThemeCardInUser build(boolean param1Boolean) {
      return new ThemeCardInUser(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
