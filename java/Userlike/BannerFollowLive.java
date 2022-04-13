package Userlike;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AlaLiveInfo;

public final class BannerFollowLive extends Message {
  public static final List<AlaLiveInfo> DEFAULT_ALA_LIVE_LIST = Collections.emptyList();
  
  public static final Integer DEFAULT_SWITCH = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer _switch;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<AlaLiveInfo> ala_live_list;
  
  public BannerFollowLive(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List list = paramBuilder.ala_live_list;
      if (list == null) {
        this.ala_live_list = DEFAULT_ALA_LIVE_LIST;
      } else {
        this.ala_live_list = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder._switch;
      if (integer == null) {
        this._switch = DEFAULT_SWITCH;
      } else {
        this._switch = integer;
      } 
    } else {
      this.ala_live_list = Message.immutableCopyOf(((Builder)integer).ala_live_list);
      this._switch = ((Builder)integer)._switch;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-2134502865, "Ltbclient/Userlike/BannerFollowLive;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-2134502865, "Ltbclient/Userlike/BannerFollowLive;");
          return;
        } 
      } 
    } 
  }
}
