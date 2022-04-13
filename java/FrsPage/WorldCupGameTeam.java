package FrsPage;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class WorldCupGameTeam extends Message {
  public static final String DEFAULT_LOGO_URL = "";
  
  public static final String DEFAULT_NAME = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String logo_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  public WorldCupGameTeam(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str = paramBuilder.logo_url;
      if (str == null) {
        this.logo_url = "";
      } else {
        this.logo_url = str;
      } 
    } else {
      this.name = ((Builder)str).name;
      this.logo_url = ((Builder)str).logo_url;
    } 
  }
}
