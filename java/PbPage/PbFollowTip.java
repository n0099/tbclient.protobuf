package PbPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PbFollowTip extends Message {
  public static final Integer DEFAULT_IS_TOAST_TIP = Integer.valueOf(0);
  
  public static final String DEFAULT_TIP_TEXT = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer is_toast_tip;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String tip_text;
  
  public PbFollowTip(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.is_toast_tip;
      if (integer == null) {
        this.is_toast_tip = DEFAULT_IS_TOAST_TIP;
      } else {
        this.is_toast_tip = integer;
      } 
      str = paramBuilder.tip_text;
      if (str == null) {
        this.tip_text = "";
      } else {
        this.tip_text = str;
      } 
    } else {
      this.is_toast_tip = ((Builder)str).is_toast_tip;
      this.tip_text = ((Builder)str).tip_text;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(535550087, "Ltbclient/PbPage/PbFollowTip;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(535550087, "Ltbclient/PbPage/PbFollowTip;");
          return;
        } 
      } 
    } 
  }
}
