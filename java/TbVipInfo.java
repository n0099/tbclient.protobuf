import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.TbVipInfo;

public final class TbVipInfo extends Message {
  public static final String DEFAULT_INTRO = "";
  
  public static final String DEFAULT_V_DETAIL = "";
  
  public static final String DEFAULT_V_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String intro;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String v_detail;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String v_url;
  
  public TbVipInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.intro;
      if (str1 == null) {
        this.intro = "";
      } else {
        this.intro = str1;
      } 
      str1 = paramBuilder.v_url;
      if (str1 == null) {
        this.v_url = "";
      } else {
        this.v_url = str1;
      } 
      str = paramBuilder.v_detail;
      if (str == null) {
        this.v_detail = "";
      } else {
        this.v_detail = str;
      } 
    } else {
      this.intro = ((Builder)str).intro;
      this.v_url = ((Builder)str).v_url;
      this.v_detail = ((Builder)str).v_detail;
    } 
  }
}
