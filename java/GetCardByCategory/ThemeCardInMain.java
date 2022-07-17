package tbclient.GetCardByCategory;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeCardPropMain;

public final class ThemeCardInMain extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_CARD_CATEGORY = "";
  
  public static final List<ThemeCardPropMain> DEFAULT_PROPS = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String card_category;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThemeCardPropMain> props;
  
  public ThemeCardInMain(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ThemeCardPropMain> list;
    if (paramBoolean == true) {
      String str = paramBuilder.card_category;
      if (str == null) {
        this.card_category = "";
      } else {
        this.card_category = str;
      } 
      list = paramBuilder.props;
      if (list == null) {
        this.props = DEFAULT_PROPS;
      } else {
        this.props = Message.immutableCopyOf(list);
      } 
    } else {
      this.card_category = ((Builder)list).card_category;
      this.props = Message.immutableCopyOf(((Builder)list).props);
    } 
  }
  
  public ThemeCardInMain(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2082680898, "Ltbclient/GetCardByCategory/ThemeCardInMain;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2082680898, "Ltbclient/GetCardByCategory/ThemeCardInMain;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ThemeCardInMain> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String card_category;
    
    public List<ThemeCardPropMain> props;
    
    public Builder() {}
    
    public Builder(ThemeCardInMain param1ThemeCardInMain) {
      super(param1ThemeCardInMain);
      if (param1ThemeCardInMain == null)
        return; 
      this.card_category = param1ThemeCardInMain.card_category;
      this.props = Message.copyOf(param1ThemeCardInMain.props);
    }
    
    public ThemeCardInMain build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ThemeCardInMain)interceptResult.objValue; 
      } 
      return new ThemeCardInMain(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
