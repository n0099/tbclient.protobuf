import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.StarRankIcon;

public final class StarRankIcon extends Message {
  public static final String DEFAULT_ICON_LINK = "";
  
  public static final String DEFAULT_ICON_PIC_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon_link;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon_pic_url;
  
  public StarRankIcon(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.icon_pic_url;
      if (str1 == null) {
        this.icon_pic_url = "";
      } else {
        this.icon_pic_url = str1;
      } 
      str = paramBuilder.icon_link;
      if (str == null) {
        this.icon_link = "";
      } else {
        this.icon_link = str;
      } 
    } else {
      this.icon_pic_url = ((Builder)str).icon_pic_url;
      this.icon_link = ((Builder)str).icon_link;
    } 
  }
}
