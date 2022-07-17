package tbclient.GetBookStore;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Category extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_CATEGORY_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_CATEGORY_TEXT = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer category_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String category_text;
  
  public Category(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.category_id;
      if (integer == null) {
        this.category_id = DEFAULT_CATEGORY_ID;
      } else {
        this.category_id = integer;
      } 
      str = paramBuilder.category_text;
      if (str == null) {
        this.category_text = "";
      } else {
        this.category_text = str;
      } 
    } else {
      this.category_id = ((Builder)str).category_id;
      this.category_text = ((Builder)str).category_text;
    } 
  }
  
  public Category(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(338170682, "Ltbclient/GetBookStore/Category;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(338170682, "Ltbclient/GetBookStore/Category;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<Category> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer category_id;
    
    public String category_text;
    
    public Builder() {}
    
    public Builder(Category param1Category) {
      super(param1Category);
      if (param1Category == null)
        return; 
      this.category_id = param1Category.category_id;
      this.category_text = param1Category.category_text;
    }
    
    public Category build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Category)interceptResult.objValue; 
      } 
      return new Category(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
