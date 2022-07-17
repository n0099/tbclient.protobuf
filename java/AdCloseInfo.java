package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class AdCloseInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_CONFIRM_TITLE = "";
  
  public static final List<String> DEFAULT_REASONS;
  
  public static final Integer DEFAULT_SUPPORT_CLOSE = Integer.valueOf(0);
  
  public static final String DEFAULT_TITLE = "";
  
  public transient FieldHolder $fh;
  
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
    super(paramBuilder);
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
      List<String> list = paramBuilder.reasons;
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
  
  public AdCloseInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
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
  
  public static final class Builder extends Message.Builder<AdCloseInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public ActionControl action_control;
    
    public String confirm_title;
    
    public List<String> reasons;
    
    public Integer support_close;
    
    public String title;
    
    public Builder() {}
    
    public Builder(AdCloseInfo param1AdCloseInfo) {
      super(param1AdCloseInfo);
      if (param1AdCloseInfo == null)
        return; 
      this.support_close = param1AdCloseInfo.support_close;
      this.title = param1AdCloseInfo.title;
      this.reasons = Message.copyOf(param1AdCloseInfo.reasons);
      this.confirm_title = param1AdCloseInfo.confirm_title;
      this.action_control = param1AdCloseInfo.action_control;
    }
    
    public AdCloseInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (AdCloseInfo)interceptResult.objValue; 
      } 
      return new AdCloseInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
