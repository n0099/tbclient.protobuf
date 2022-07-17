package tbclient.GetBubbleByCategory;

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

public final class ThemeBubbleInMain extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_BUBBLE_CATEGORY = "";
  
  public static final List<ThemeBgProp> DEFAULT_PROPS = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String bubble_category;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThemeBgProp> props;
  
  public ThemeBubbleInMain(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ThemeBgProp> list;
    if (paramBoolean == true) {
      String str = paramBuilder.bubble_category;
      if (str == null) {
        this.bubble_category = "";
      } else {
        this.bubble_category = str;
      } 
      list = paramBuilder.props;
      if (list == null) {
        this.props = DEFAULT_PROPS;
      } else {
        this.props = Message.immutableCopyOf(list);
      } 
    } else {
      this.bubble_category = ((Builder)list).bubble_category;
      this.props = Message.immutableCopyOf(((Builder)list).props);
    } 
  }
  
  public ThemeBubbleInMain(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2110944522, "Ltbclient/GetBubbleByCategory/ThemeBubbleInMain;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2110944522, "Ltbclient/GetBubbleByCategory/ThemeBubbleInMain;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ThemeBubbleInMain> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String bubble_category;
    
    public List<ThemeBgProp> props;
    
    public Builder() {}
    
    public Builder(ThemeBubbleInMain param1ThemeBubbleInMain) {
      super(param1ThemeBubbleInMain);
      if (param1ThemeBubbleInMain == null)
        return; 
      this.bubble_category = param1ThemeBubbleInMain.bubble_category;
      this.props = Message.copyOf(param1ThemeBubbleInMain.props);
    }
    
    public ThemeBubbleInMain build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ThemeBubbleInMain)interceptResult.objValue; 
      } 
      return new ThemeBubbleInMain(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
