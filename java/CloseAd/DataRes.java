package tbclient.CloseAd;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.VipCloseAd;

public final class DataRes extends Message {
  @ProtoField(tag = 1)
  public final VipCloseAd vip_close_ad;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.vip_close_ad = paramBuilder.vip_close_ad;
    } else {
      this.vip_close_ad = paramBuilder.vip_close_ad;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public VipCloseAd vip_close_ad;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.vip_close_ad = param1DataRes.vip_close_ad;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
