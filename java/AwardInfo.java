package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AwardInfo extends Message {
  public static final Long DEFAULT_AWARD_ACT_ID;
  
  public static final Long DEFAULT_AWARD_ID;
  
  public static final String DEFAULT_AWARD_IMGSRC = "";
  
  public static final String DEFAULT_AWARD_NAME = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long award_act_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long award_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String award_imgsrc;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String award_name;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_AWARD_ID = long_;
    DEFAULT_AWARD_ACT_ID = long_;
  }
  
  public AwardInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.award_id;
      if (long_ == null) {
        this.award_id = DEFAULT_AWARD_ID;
      } else {
        this.award_id = long_;
      } 
      long_ = paramBuilder.award_act_id;
      if (long_ == null) {
        this.award_act_id = DEFAULT_AWARD_ACT_ID;
      } else {
        this.award_act_id = long_;
      } 
      String str1 = paramBuilder.award_name;
      if (str1 == null) {
        this.award_name = "";
      } else {
        this.award_name = str1;
      } 
      str = paramBuilder.award_imgsrc;
      if (str == null) {
        this.award_imgsrc = "";
      } else {
        this.award_imgsrc = str;
      } 
    } else {
      this.award_id = ((Builder)str).award_id;
      this.award_act_id = ((Builder)str).award_act_id;
      this.award_name = ((Builder)str).award_name;
      this.award_imgsrc = ((Builder)str).award_imgsrc;
    } 
  }
  
  public AwardInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AwardInfo> {
    public Long award_act_id;
    
    public Long award_id;
    
    public String award_imgsrc;
    
    public String award_name;
    
    public Builder() {}
    
    public Builder(AwardInfo param1AwardInfo) {
      super(param1AwardInfo);
      if (param1AwardInfo == null)
        return; 
      this.award_id = param1AwardInfo.award_id;
      this.award_act_id = param1AwardInfo.award_act_id;
      this.award_name = param1AwardInfo.award_name;
      this.award_imgsrc = param1AwardInfo.award_imgsrc;
    }
    
    public AwardInfo build(boolean param1Boolean) {
      return new AwardInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
