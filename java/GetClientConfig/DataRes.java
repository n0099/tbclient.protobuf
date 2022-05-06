package GetClientConfig;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GetClientConfig.CLocalDialog;
import tbclient.GetClientConfig.CPayType;

public final class DataRes extends Message {
  @ProtoField(tag = 2)
  public final CLocalDialog local_dialog;
  
  @ProtoField(tag = 1)
  public final CPayType payType;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.payType = paramBuilder.payType;
      this.local_dialog = paramBuilder.local_dialog;
    } else {
      this.payType = paramBuilder.payType;
      this.local_dialog = paramBuilder.local_dialog;
    } 
  }
}
