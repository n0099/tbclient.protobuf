import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.RecommendTip;

public final class RecommendTip extends Message {
  public static final String DEFAULT_IS_FOLLOW = "";
  
  public static final String DEFAULT_REASON = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String is_follow;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String reason;
  
  public RecommendTip(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.reason;
      if (str1 == null) {
        this.reason = "";
      } else {
        this.reason = str1;
      } 
      str = paramBuilder.is_follow;
      if (str == null) {
        this.is_follow = "";
      } else {
        this.is_follow = str;
      } 
    } else {
      this.reason = ((Builder)str).reason;
      this.is_follow = ((Builder)str).is_follow;
    } 
  }
}
