import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.LinkInfo;

public final class LinkInfo extends Message {
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_LINK = "";
  
  public static final String DEFAULT_TYPE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String type;
  
  public LinkInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.desc;
      if (str1 == null) {
        this.desc = "";
      } else {
        this.desc = str1;
      } 
      str1 = paramBuilder.link;
      if (str1 == null) {
        this.link = "";
      } else {
        this.link = str1;
      } 
      str = paramBuilder.type;
      if (str == null) {
        this.type = "";
      } else {
        this.type = str;
      } 
    } else {
      this.desc = ((Builder)str).desc;
      this.link = ((Builder)str).link;
      this.type = ((Builder)str).type;
    } 
  }
}
