package tbclient.QueryCollectUpdateNum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Integer DEFAULT_COLLECT_MARK = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer collect_mark;
  
  @ProtoField(tag = 2)
  public final CommonReq common;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Integer integer = paramBuilder.collect_mark;
      if (integer == null) {
        this.collect_mark = DEFAULT_COLLECT_MARK;
      } else {
        this.collect_mark = integer;
      } 
      this.common = paramBuilder.common;
    } else {
      this.collect_mark = paramBuilder.collect_mark;
      this.common = paramBuilder.common;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public Integer collect_mark;
    
    public CommonReq common;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.collect_mark = param1DataReq.collect_mark;
      this.common = param1DataReq.common;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
