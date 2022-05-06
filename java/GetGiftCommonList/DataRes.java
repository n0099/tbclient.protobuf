package GetGiftCommonList;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GetGiftCommonList.GiftInfo;

public final class DataRes extends Message {
  @ProtoField(tag = 1)
  public final GiftInfo gift_info;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.gift_info = paramBuilder.gift_info;
    } else {
      this.gift_info = paramBuilder.gift_info;
    } 
  }
}
