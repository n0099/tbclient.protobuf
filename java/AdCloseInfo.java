import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ActionControl;
import tbclient.AdCloseInfo;

public final class AdCloseInfo extends Message {
  public static final String DEFAULT_CONFIRM_TITLE = "";
  
  public static final List<String> DEFAULT_REASONS;
  
  public static final Integer DEFAULT_SUPPORT_CLOSE = Integer.valueOf(0);
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 5)
  public final ActionControl action_control;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String confirm_title;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.STRING)
  public final List<String> reasons;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer support_close;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    DEFAULT_REASONS = Collections.emptyList();
  }
  
  public AdCloseInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Integer integer = paramBuilder.support_close;
      if (integer == null) {
        this.support_close = DEFAULT_SUPPORT_CLOSE;
      } else {
        this.support_close = integer;
      } 
      String str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      List list = paramBuilder.reasons;
      if (list == null) {
        this.reasons = DEFAULT_REASONS;
      } else {
        this.reasons = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.confirm_title;
      if (str1 == null) {
        this.confirm_title = "";
      } else {
        this.confirm_title = str1;
      } 
      this.action_control = paramBuilder.action_control;
    } else {
      this.support_close = paramBuilder.support_close;
      this.title = paramBuilder.title;
      this.reasons = Message.immutableCopyOf(paramBuilder.reasons);
      this.confirm_title = paramBuilder.confirm_title;
      this.action_control = paramBuilder.action_control;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1298349918, "Ltbclient/AdCloseInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1298349918, "Ltbclient/AdCloseInfo;");
          return;
        } 
      } 
    } 
  }
}
