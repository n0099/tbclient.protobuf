package GetGameDetail;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_GAME_ID = "";
  
  @ProtoField(tag = 2)
  public final CommonReq common;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String game_id;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.game_id;
      if (str == null) {
        this.game_id = "";
      } else {
        this.game_id = str;
      } 
      this.common = paramBuilder.common;
    } else {
      this.game_id = paramBuilder.game_id;
      this.common = paramBuilder.common;
    } 
  }
}
