import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.TbmallMonthIcon;

public final class TbmallMonthIcon extends Message {
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_MON = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String mon;
  
  public TbmallMonthIcon(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.mon;
      if (str1 == null) {
        this.mon = "";
      } else {
        this.mon = str1;
      } 
      str = paramBuilder.icon;
      if (str == null) {
        this.icon = "";
      } else {
        this.icon = str;
      } 
    } else {
      this.mon = ((Builder)str).mon;
      this.icon = ((Builder)str).icon;
    } 
  }
}
