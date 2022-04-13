import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.FeatureCardGameSubNode;

public final class FeatureCardGameSubNode extends Message {
  public static final String DEFAULT_IMAGE = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String image;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String url;
  
  public FeatureCardGameSubNode(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.image;
      if (str1 == null) {
        this.image = "";
      } else {
        this.image = str1;
      } 
      str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.image = ((Builder)str).image;
      this.title = ((Builder)str).title;
      this.name = ((Builder)str).name;
      this.url = ((Builder)str).url;
    } 
  }
}
