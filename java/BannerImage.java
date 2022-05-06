import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.BannerImage;

public final class BannerImage extends Message {
  public static final String DEFAULT_AHEAD_URL = "";
  
  public static final String DEFAULT_IMG_URL = "";
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String ahead_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String title;
  
  public BannerImage(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.img_url;
      if (str1 == null) {
        this.img_url = "";
      } else {
        this.img_url = str1;
      } 
      str1 = paramBuilder.ahead_url;
      if (str1 == null) {
        this.ahead_url = "";
      } else {
        this.ahead_url = str1;
      } 
      str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
    } else {
      this.img_url = ((Builder)str).img_url;
      this.ahead_url = ((Builder)str).ahead_url;
      this.title = ((Builder)str).title;
    } 
  }
}
