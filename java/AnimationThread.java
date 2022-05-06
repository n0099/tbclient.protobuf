import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AnimationThread;

public final class AnimationThread extends Message {
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final String DEFAULT_VIDEO_PIC = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String video_pic;
  
  public AnimationThread(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.video_pic;
      if (str1 == null) {
        this.video_pic = "";
      } else {
        this.video_pic = str1;
      } 
      str = paramBuilder.jump_url;
      if (str == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str;
      } 
    } else {
      this.video_pic = ((Builder)str).video_pic;
      this.jump_url = ((Builder)str).jump_url;
    } 
  }
}
