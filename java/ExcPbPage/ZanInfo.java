package tbclient.ExcPbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ZanInfo extends Message {
  public static final Boolean DEFAULT_IS_ZAN;
  
  public static final Long DEFAULT_ZANSUM = Long.valueOf(0L);
  
  @ProtoField(tag = 2, type = Message.Datatype.BOOL)
  public final Boolean is_zan;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long zansum;
  
  static {
    DEFAULT_IS_ZAN = Boolean.FALSE;
  }
  
  public ZanInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Boolean bool;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.zansum;
      if (long_ == null) {
        this.zansum = DEFAULT_ZANSUM;
      } else {
        this.zansum = long_;
      } 
      bool = paramBuilder.is_zan;
      if (bool == null) {
        this.is_zan = DEFAULT_IS_ZAN;
      } else {
        this.is_zan = bool;
      } 
    } else {
      this.zansum = ((Builder)bool).zansum;
      this.is_zan = ((Builder)bool).is_zan;
    } 
  }
  
  public ZanInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ZanInfo> {
    public Boolean is_zan;
    
    public Long zansum;
    
    public Builder() {}
    
    public Builder(ZanInfo param1ZanInfo) {
      super(param1ZanInfo);
      if (param1ZanInfo == null)
        return; 
      this.zansum = param1ZanInfo.zansum;
      this.is_zan = param1ZanInfo.is_zan;
    }
    
    public ZanInfo build(boolean param1Boolean) {
      return new ZanInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
