package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CategoryInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_CATEGORY_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_CATEGORY_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer category_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String category_name;
  
  public CategoryInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.category_id;
      if (integer == null) {
        this.category_id = DEFAULT_CATEGORY_ID;
      } else {
        this.category_id = integer;
      } 
      str = paramBuilder.category_name;
      if (str == null) {
        this.category_name = "";
      } else {
        this.category_name = str;
      } 
    } else {
      this.category_id = ((Builder)str).category_id;
      this.category_name = ((Builder)str).category_name;
    } 
  }
  
  public CategoryInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-157538747, "Ltbclient/CategoryInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-157538747, "Ltbclient/CategoryInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<CategoryInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer category_id;
    
    public String category_name;
    
    public Builder() {}
    
    public Builder(CategoryInfo param1CategoryInfo) {
      super(param1CategoryInfo);
      if (param1CategoryInfo == null)
        return; 
      this.category_id = param1CategoryInfo.category_id;
      this.category_name = param1CategoryInfo.category_name;
    }
    
    public CategoryInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (CategoryInfo)interceptResult.objValue; 
      } 
      return new CategoryInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
