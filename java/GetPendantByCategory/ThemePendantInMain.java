package tbclient.GetPendantByCategory;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeBgProp;

public final class ThemePendantInMain extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_PENDANT_CATEGORY = "";
  
  public static final List<ThemeBgProp> DEFAULT_PROPS = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String pendant_category;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThemeBgProp> props;
  
  public ThemePendantInMain(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ThemeBgProp> list;
    if (paramBoolean == true) {
      String str = paramBuilder.pendant_category;
      if (str == null) {
        this.pendant_category = "";
      } else {
        this.pendant_category = str;
      } 
      list = paramBuilder.props;
      if (list == null) {
        this.props = DEFAULT_PROPS;
      } else {
        this.props = Message.immutableCopyOf(list);
      } 
    } else {
      this.pendant_category = ((Builder)list).pendant_category;
      this.props = Message.immutableCopyOf(((Builder)list).props);
    } 
  }
  
  public ThemePendantInMain(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(67999648, "Ltbclient/GetPendantByCategory/ThemePendantInMain;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(67999648, "Ltbclient/GetPendantByCategory/ThemePendantInMain;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ThemePendantInMain> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String pendant_category;
    
    public List<ThemeBgProp> props;
    
    public Builder() {}
    
    public Builder(ThemePendantInMain param1ThemePendantInMain) {
      super(param1ThemePendantInMain);
      if (param1ThemePendantInMain == null)
        return; 
      this.pendant_category = param1ThemePendantInMain.pendant_category;
      this.props = Message.copyOf(param1ThemePendantInMain.props);
    }
    
    public ThemePendantInMain build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ThemePendantInMain)interceptResult.objValue; 
      } 
      return new ThemePendantInMain(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
