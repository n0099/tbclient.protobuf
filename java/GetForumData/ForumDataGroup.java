package tbclient.GetForumData;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ForumDataGroup extends Message {
  public static Interceptable $ic;
  
  public static final Double DEFAULT_TOTAL = Double.valueOf(0.0D);
  
  public static final List<ForumDataValue> DEFAULT_VALUES = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.DOUBLE)
  public final Double total;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ForumDataValue> values;
  
  public ForumDataGroup(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ForumDataValue> list;
    if (paramBoolean == true) {
      Double double_ = paramBuilder.total;
      if (double_ == null) {
        this.total = DEFAULT_TOTAL;
      } else {
        this.total = double_;
      } 
      list = paramBuilder.values;
      if (list == null) {
        this.values = DEFAULT_VALUES;
      } else {
        this.values = Message.immutableCopyOf(list);
      } 
    } else {
      this.total = ((Builder)list).total;
      this.values = Message.immutableCopyOf(((Builder)list).values);
    } 
  }
  
  public ForumDataGroup(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1850624855, "Ltbclient/GetForumData/ForumDataGroup;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1850624855, "Ltbclient/GetForumData/ForumDataGroup;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ForumDataGroup> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Double total;
    
    public List<ForumDataValue> values;
    
    public Builder() {}
    
    public Builder(ForumDataGroup param1ForumDataGroup) {
      super(param1ForumDataGroup);
      if (param1ForumDataGroup == null)
        return; 
      this.total = param1ForumDataGroup.total;
      this.values = Message.copyOf(param1ForumDataGroup.values);
    }
    
    public ForumDataGroup build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ForumDataGroup)interceptResult.objValue; 
      } 
      return new ForumDataGroup(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
