package TalkBall;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.TalkBall.InsertFloor;
import tbclient.ThreadInfo;

public final class CardInfo extends Message {
  @ProtoField(tag = 2)
  public final InsertFloor insert_floor;
  
  @ProtoField(tag = 1)
  public final ThreadInfo thread_info;
  
  public CardInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.thread_info = paramBuilder.thread_info;
      this.insert_floor = paramBuilder.insert_floor;
    } else {
      this.thread_info = paramBuilder.thread_info;
      this.insert_floor = paramBuilder.insert_floor;
    } 
  }
}
