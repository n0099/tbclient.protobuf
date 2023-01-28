package tbclient.QueryCollectUpdateNum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DataRes extends Message {
  public static final Integer DEFAULT_COLLECT_UPDATE_NUM = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer collect_update_num;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      integer = paramBuilder.collect_update_num;
      if (integer == null) {
        this.collect_update_num = DEFAULT_COLLECT_UPDATE_NUM;
      } else {
        this.collect_update_num = integer;
      } 
    } else {
      this.collect_update_num = ((Builder)integer).collect_update_num;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public Integer collect_update_num;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.collect_update_num = param1DataRes.collect_update_num;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
