package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GodInfoItem extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final String DEFAULT_GOD_INTRO = "";
  
  public static final Long DEFAULT_UID = Long.valueOf(0L);
  
  public static final String DEFAULT_USER_INTRO = "";
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String god_intro;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long uid;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String user_intro;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String user_name;
  
  public GodInfoItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.uid;
      if (long_ == null) {
        this.uid = DEFAULT_UID;
      } else {
        this.uid = long_;
      } 
      String str1 = paramBuilder.avatar;
      if (str1 == null) {
        this.avatar = "";
      } else {
        this.avatar = str1;
      } 
      str1 = paramBuilder.user_name;
      if (str1 == null) {
        this.user_name = "";
      } else {
        this.user_name = str1;
      } 
      str1 = paramBuilder.user_intro;
      if (str1 == null) {
        this.user_intro = "";
      } else {
        this.user_intro = str1;
      } 
      str = paramBuilder.god_intro;
      if (str == null) {
        this.god_intro = "";
      } else {
        this.god_intro = str;
      } 
    } else {
      this.uid = ((Builder)str).uid;
      this.avatar = ((Builder)str).avatar;
      this.user_name = ((Builder)str).user_name;
      this.user_intro = ((Builder)str).user_intro;
      this.god_intro = ((Builder)str).god_intro;
    } 
  }
  
  public GodInfoItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GodInfoItem> {
    public String avatar;
    
    public String god_intro;
    
    public Long uid;
    
    public String user_intro;
    
    public String user_name;
    
    public Builder() {}
    
    public Builder(GodInfoItem param1GodInfoItem) {
      super(param1GodInfoItem);
      if (param1GodInfoItem == null)
        return; 
      this.uid = param1GodInfoItem.uid;
      this.avatar = param1GodInfoItem.avatar;
      this.user_name = param1GodInfoItem.user_name;
      this.user_intro = param1GodInfoItem.user_intro;
      this.god_intro = param1GodInfoItem.god_intro;
    }
    
    public GodInfoItem build(boolean param1Boolean) {
      return new GodInfoItem(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
