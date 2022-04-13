import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.VipShowInfo;

public final class VipShowInfo extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_LINK = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_VIP_ICON = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String vip_icon;
  
  public VipShowInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.vip_icon;
      if (str1 == null) {
        this.vip_icon = "";
      } else {
        this.vip_icon = str1;
      } 
      str1 = paramBuilder.content;
      if (str1 == null) {
        this.content = "";
      } else {
        this.content = str1;
      } 
      str1 = paramBuilder.link;
      if (str1 == null) {
        this.link = "";
      } else {
        this.link = str1;
      } 
      str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
    } else {
      this.vip_icon = ((Builder)str).vip_icon;
      this.content = ((Builder)str).content;
      this.link = ((Builder)str).link;
      this.title = ((Builder)str).title;
    } 
  }
}
