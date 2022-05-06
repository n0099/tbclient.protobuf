package VoiceRoomListPage;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.VoiceRoomListPage.DataReq;

public final class VoiceRoomListPageReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public VoiceRoomListPageReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
}
