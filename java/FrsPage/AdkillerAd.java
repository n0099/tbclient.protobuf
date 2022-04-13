package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.App;

public final class AdkillerAd extends Message {
  public static final Integer DEFAULT_CAN_CLOSE = Integer.valueOf(0);
  
  public static final String DEFAULT_GAME_URL = "";
  
  public static final String DEFAULT_TAG = "";
  
  @ProtoField(tag = 3)
  public final App app;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer can_close;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String game_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String tag;
  
  public AdkillerAd(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.tag;
      if (str == null) {
        this.tag = "";
      } else {
        this.tag = str;
      } 
      str = paramBuilder.game_url;
      if (str == null) {
        this.game_url = "";
      } else {
        this.game_url = str;
      } 
      this.app = paramBuilder.app;
      integer = paramBuilder.can_close;
      if (integer == null) {
        this.can_close = DEFAULT_CAN_CLOSE;
      } else {
        this.can_close = integer;
      } 
    } else {
      this.tag = ((Builder)integer).tag;
      this.game_url = ((Builder)integer).game_url;
      this.app = ((Builder)integer).app;
      this.can_close = ((Builder)integer).can_close;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1201387943, "Ltbclient/FrsPage/AdkillerAd;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1201387943, "Ltbclient/FrsPage/AdkillerAd;");
          return;
        } 
      } 
    } 
  }
}
