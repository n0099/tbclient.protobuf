package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GodDetailInfo extends Message {
  public static final String DEFAULT_DETAIL_INTRO = "";
  
  public static final Long DEFAULT_GOD_ID;
  
  public static final String DEFAULT_INTRO = "";
  
  public static final Long DEFAULT_USER_ID;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String detail_intro;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long god_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String intro;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long user_id;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_GOD_ID = long_;
    DEFAULT_USER_ID = long_;
  }
  
  public GodDetailInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.god_id;
      if (long_ == null) {
        this.god_id = DEFAULT_GOD_ID;
      } else {
        this.god_id = long_;
      } 
      long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      String str1 = paramBuilder.intro;
      if (str1 == null) {
        this.intro = "";
      } else {
        this.intro = str1;
      } 
      str = paramBuilder.detail_intro;
      if (str == null) {
        this.detail_intro = "";
      } else {
        this.detail_intro = str;
      } 
    } else {
      this.god_id = ((Builder)str).god_id;
      this.user_id = ((Builder)str).user_id;
      this.intro = ((Builder)str).intro;
      this.detail_intro = ((Builder)str).detail_intro;
    } 
  }
  
  public GodDetailInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GodDetailInfo> {
    public String detail_intro;
    
    public Long god_id;
    
    public String intro;
    
    public Long user_id;
    
    public Builder() {}
    
    public Builder(GodDetailInfo param1GodDetailInfo) {
      super(param1GodDetailInfo);
      if (param1GodDetailInfo == null)
        return; 
      this.god_id = param1GodDetailInfo.god_id;
      this.user_id = param1GodDetailInfo.user_id;
      this.intro = param1GodDetailInfo.intro;
      this.detail_intro = param1GodDetailInfo.detail_intro;
    }
    
    public GodDetailInfo build(boolean param1Boolean) {
      return new GodDetailInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
