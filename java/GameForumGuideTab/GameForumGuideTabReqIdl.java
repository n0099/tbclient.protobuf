package GameForumGuideTab;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GameForumGuideTab.DataReq;

public final class GameForumGuideTabReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GameForumGuideTabReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
}
