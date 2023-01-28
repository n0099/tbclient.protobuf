package tbclient.ForumGuide;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Integer DEFAULT_CALL_FROM;
  
  public static final Integer DEFAULT_SORT_TYPE;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer call_from;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer sort_type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_SORT_TYPE = integer;
    DEFAULT_CALL_FROM = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Integer integer1 = paramBuilder.sort_type;
      if (integer1 == null) {
        this.sort_type = DEFAULT_SORT_TYPE;
      } else {
        this.sort_type = integer1;
      } 
      integer = paramBuilder.call_from;
      if (integer == null) {
        this.call_from = DEFAULT_CALL_FROM;
      } else {
        this.call_from = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.sort_type = ((Builder)integer).sort_type;
      this.call_from = ((Builder)integer).call_from;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public Integer call_from;
    
    public CommonReq common;
    
    public Integer sort_type;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.sort_type = param1DataReq.sort_type;
      this.call_from = param1DataReq.call_from;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
