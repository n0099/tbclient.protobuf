package GetGiftMyList;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GetGiftMyList.Gift;
import tbclient.GetGiftMyList.Sender;

public final class GiftList extends Message {
  @ProtoField(tag = 2)
  public final Gift gift;
  
  @ProtoField(tag = 1)
  public final Sender sender;
  
  public GiftList(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.sender = paramBuilder.sender;
      this.gift = paramBuilder.gift;
    } else {
      this.sender = paramBuilder.sender;
      this.gift = paramBuilder.gift;
    } 
  }
}
