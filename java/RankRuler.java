import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.RankRuler;

public final class RankRuler extends Message {
  public static final String DEFAULT_BOTTOM_LINK = "";
  
  public static final String DEFAULT_TOP_LINK = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String bottom_link;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String top_link;
  
  public RankRuler(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.top_link;
      if (str1 == null) {
        this.top_link = "";
      } else {
        this.top_link = str1;
      } 
      str = paramBuilder.bottom_link;
      if (str == null) {
        this.bottom_link = "";
      } else {
        this.bottom_link = str;
      } 
    } else {
      this.top_link = ((Builder)str).top_link;
      this.bottom_link = ((Builder)str).bottom_link;
    } 
  }
}
