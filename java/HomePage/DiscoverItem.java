package tbclient.HomePage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DiscoverItem extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_DESCRIBE = "";
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final Integer DEFAULT_IS_NEW;
  
  public static final Integer DEFAULT_IS_RED_POINT;
  
  public static final String DEFAULT_LINK_URL = "";
  
  public static final String DEFAULT_STATISTICS = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String describe;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer is_new;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer is_red_point;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String link_url;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String statistics;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-10191320, "Ltbclient/HomePage/DiscoverItem;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-10191320, "Ltbclient/HomePage/DiscoverItem;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_NEW = integer;
    DEFAULT_IS_RED_POINT = integer;
  }
  
  public DiscoverItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str2 = paramBuilder.icon_url;
      if (str2 == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str2;
      } 
      str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      str2 = paramBuilder.link_url;
      if (str2 == null) {
        this.link_url = "";
      } else {
        this.link_url = str2;
      } 
      Integer integer1 = paramBuilder.is_new;
      if (integer1 == null) {
        this.is_new = DEFAULT_IS_NEW;
      } else {
        this.is_new = integer1;
      } 
      String str1 = paramBuilder.describe;
      if (str1 == null) {
        this.describe = "";
      } else {
        this.describe = str1;
      } 
      str1 = paramBuilder.statistics;
      if (str1 == null) {
        this.statistics = "";
      } else {
        this.statistics = str1;
      } 
      integer = paramBuilder.is_red_point;
      if (integer == null) {
        this.is_red_point = DEFAULT_IS_RED_POINT;
      } else {
        this.is_red_point = integer;
      } 
    } else {
      this.icon_url = ((Builder)integer).icon_url;
      this.title = ((Builder)integer).title;
      this.link_url = ((Builder)integer).link_url;
      this.is_new = ((Builder)integer).is_new;
      this.describe = ((Builder)integer).describe;
      this.statistics = ((Builder)integer).statistics;
      this.is_red_point = ((Builder)integer).is_red_point;
    } 
  }
  
  public DiscoverItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DiscoverItem> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String describe;
    
    public String icon_url;
    
    public Integer is_new;
    
    public Integer is_red_point;
    
    public String link_url;
    
    public String statistics;
    
    public String title;
    
    public Builder() {}
    
    public Builder(DiscoverItem param1DiscoverItem) {
      super(param1DiscoverItem);
      if (param1DiscoverItem == null)
        return; 
      this.icon_url = param1DiscoverItem.icon_url;
      this.title = param1DiscoverItem.title;
      this.link_url = param1DiscoverItem.link_url;
      this.is_new = param1DiscoverItem.is_new;
      this.describe = param1DiscoverItem.describe;
      this.statistics = param1DiscoverItem.statistics;
      this.is_red_point = param1DiscoverItem.is_red_point;
    }
    
    public DiscoverItem build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DiscoverItem)interceptResult.objValue; 
      } 
      return new DiscoverItem(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
