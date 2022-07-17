package tbclient.GetSkinByCategory;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeSkinPropMain;

public final class ThemeSkinInMain extends Message {
  public static Interceptable $ic;
  
  public static final List<ThemeSkinPropMain> DEFAULT_PROPS = Collections.emptyList();
  
  public static final String DEFAULT_SKIN_CATEGORY = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThemeSkinPropMain> props;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String skin_category;
  
  public ThemeSkinInMain(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ThemeSkinPropMain> list;
    if (paramBoolean == true) {
      String str = paramBuilder.skin_category;
      if (str == null) {
        this.skin_category = "";
      } else {
        this.skin_category = str;
      } 
      list = paramBuilder.props;
      if (list == null) {
        this.props = DEFAULT_PROPS;
      } else {
        this.props = Message.immutableCopyOf(list);
      } 
    } else {
      this.skin_category = ((Builder)list).skin_category;
      this.props = Message.immutableCopyOf(((Builder)list).props);
    } 
  }
  
  public ThemeSkinInMain(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2002197160, "Ltbclient/GetSkinByCategory/ThemeSkinInMain;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2002197160, "Ltbclient/GetSkinByCategory/ThemeSkinInMain;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ThemeSkinInMain> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<ThemeSkinPropMain> props;
    
    public String skin_category;
    
    public Builder() {}
    
    public Builder(ThemeSkinInMain param1ThemeSkinInMain) {
      super(param1ThemeSkinInMain);
      if (param1ThemeSkinInMain == null)
        return; 
      this.skin_category = param1ThemeSkinInMain.skin_category;
      this.props = Message.copyOf(param1ThemeSkinInMain.props);
    }
    
    public ThemeSkinInMain build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ThemeSkinInMain)interceptResult.objValue; 
      } 
      return new ThemeSkinInMain(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
