package tbclient.GetDealerList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DealerInfo extends Message {
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Long DEFAULT_SCORE;
  
  public static final Long DEFAULT_USER_ID;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long score;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long user_id;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_USER_ID = long_;
    DEFAULT_SCORE = long_;
  }
  
  public DealerInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_1 = paramBuilder.user_id;
      if (long_1 == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_1;
      } 
      String str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      str = paramBuilder.portrait;
      if (str == null) {
        this.portrait = "";
      } else {
        this.portrait = str;
      } 
      long_ = paramBuilder.score;
      if (long_ == null) {
        this.score = DEFAULT_SCORE;
      } else {
        this.score = long_;
      } 
    } else {
      this.user_id = ((Builder)long_).user_id;
      this.name = ((Builder)long_).name;
      this.portrait = ((Builder)long_).portrait;
      this.score = ((Builder)long_).score;
    } 
  }
  
  public DealerInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DealerInfo> {
    public String name;
    
    public String portrait;
    
    public Long score;
    
    public Long user_id;
    
    public Builder() {}
    
    public Builder(DealerInfo param1DealerInfo) {
      super(param1DealerInfo);
      if (param1DealerInfo == null)
        return; 
      this.user_id = param1DealerInfo.user_id;
      this.name = param1DealerInfo.name;
      this.portrait = param1DealerInfo.portrait;
      this.score = param1DealerInfo.score;
    }
    
    public DealerInfo build(boolean param1Boolean) {
      return new DealerInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
