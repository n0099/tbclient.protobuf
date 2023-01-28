package tbclient.GetClientConfig;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DataRes extends Message {
  @ProtoField(tag = 2)
  public final CLocalDialog local_dialog;
  
  @ProtoField(tag = 1)
  public final CPayType payType;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.payType = paramBuilder.payType;
      this.local_dialog = paramBuilder.local_dialog;
    } else {
      this.payType = paramBuilder.payType;
      this.local_dialog = paramBuilder.local_dialog;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public CLocalDialog local_dialog;
    
    public CPayType payType;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.payType = param1DataRes.payType;
      this.local_dialog = param1DataRes.local_dialog;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
