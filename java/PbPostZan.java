package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PbPostZan extends Message {
  public static final Integer DEFAULT_HAS_ZAN;
  
  public static final Long DEFAULT_ZAN_NUM = Long.valueOf(0L);
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer has_zan;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long zan_num;
  
  static {
    DEFAULT_HAS_ZAN = Integer.valueOf(0);
  }
  
  public PbPostZan(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.zan_num;
      if (long_ == null) {
        this.zan_num = DEFAULT_ZAN_NUM;
      } else {
        this.zan_num = long_;
      } 
      integer = paramBuilder.has_zan;
      if (integer == null) {
        this.has_zan = DEFAULT_HAS_ZAN;
      } else {
        this.has_zan = integer;
      } 
    } else {
      this.zan_num = ((Builder)integer).zan_num;
      this.has_zan = ((Builder)integer).has_zan;
    } 
  }
  
  public PbPostZan(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PbPostZan> {
    public Integer has_zan;
    
    public Long zan_num;
    
    public Builder() {}
    
    public Builder(PbPostZan param1PbPostZan) {
      super(param1PbPostZan);
      if (param1PbPostZan == null)
        return; 
      this.zan_num = param1PbPostZan.zan_num;
      this.has_zan = param1PbPostZan.has_zan;
    }
    
    public PbPostZan build(boolean param1Boolean) {
      return new PbPostZan(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
