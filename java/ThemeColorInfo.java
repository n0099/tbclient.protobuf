import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThemeColorInfo;
import tbclient.ThemeElement;

public final class ThemeColorInfo extends Message {
  @ProtoField(tag = 3)
  public final ThemeElement dark;
  
  @ProtoField(tag = 1)
  public final ThemeElement day;
  
  @ProtoField(tag = 2)
  public final ThemeElement night;
  
  public ThemeColorInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.day = paramBuilder.day;
      this.night = paramBuilder.night;
      this.dark = paramBuilder.dark;
    } else {
      this.day = paramBuilder.day;
      this.night = paramBuilder.night;
      this.dark = paramBuilder.dark;
    } 
  }
}
