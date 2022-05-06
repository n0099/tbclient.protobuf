import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ActBtn;
import tbclient.FrsVideo;

public final class FrsVideo extends Message {
  @ProtoField(tag = 1)
  public final ActBtn video_act;
  
  public FrsVideo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.video_act = paramBuilder.video_act;
    } else {
      this.video_act = paramBuilder.video_act;
    } 
  }
}
