package tbclient.GetWorksTags;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class Category extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_FIRST_CLASS = "";
  
  public static final List<String> DEFAULT_SECOND_CLASS = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String first_class;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
  public final List<String> second_class;
  
  public Category(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<String> list;
    if (paramBoolean == true) {
      String str = paramBuilder.first_class;
      if (str == null) {
        this.first_class = "";
      } else {
        this.first_class = str;
      } 
      list = paramBuilder.second_class;
      if (list == null) {
        this.second_class = DEFAULT_SECOND_CLASS;
      } else {
        this.second_class = Message.immutableCopyOf(list);
      } 
    } else {
      this.first_class = ((Builder)list).first_class;
      this.second_class = Message.immutableCopyOf(((Builder)list).second_class);
    } 
  }
  
  public Category(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1450633539, "Ltbclient/GetWorksTags/Category;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1450633539, "Ltbclient/GetWorksTags/Category;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<Category> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String first_class;
    
    public List<String> second_class;
    
    public Builder() {}
    
    public Builder(Category param1Category) {
      super(param1Category);
      if (param1Category == null)
        return; 
      this.first_class = param1Category.first_class;
      this.second_class = Message.copyOf(param1Category.second_class);
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
