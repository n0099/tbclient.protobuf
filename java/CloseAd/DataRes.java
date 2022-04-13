package CloseAd;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.VipCloseAd;

public final class DataRes extends Message {
  @ProtoField(tag = 1)
  public final VipCloseAd vip_close_ad;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.vip_close_ad = paramBuilder.vip_close_ad;
    } else {
      this.vip_close_ad = paramBuilder.vip_close_ad;
    } 
  }
}
