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

public final class ForumDataItem extends Message {
  public static Interceptable $ic;
  
  public static final List<ForumDataGroup> DEFAULT_GROUP;
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ForumDataGroup> group;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer type;
  
  static {
    DEFAULT_GROUP = Collections.emptyList();
  }
  
  public ForumDataItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ForumDataGroup> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      list = paramBuilder.group;
      if (list == null) {
        this.group = DEFAULT_GROUP;
      } else {
        this.group = Message.immutableCopyOf(list);
      } 
    } else {
      this.type = ((Builder)list).type;
      this.group = Message.immutableCopyOf(((Builder)list).group);
    } 
  }
  
  public ForumDataItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2139804269, "Ltbclient/GetForumData/ForumDataItem;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2139804269, "Ltbclient/GetForumData/ForumDataItem;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ForumDataItem> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<ForumDataGroup> group;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(ForumDataItem param1ForumDataItem) {
      super(param1ForumDataItem);
      if (param1ForumDataItem == null)
        return; 
      this.type = param1ForumDataItem.type;
      this.group = Message.copyOf(param1ForumDataItem.group);
    }
    
    public ForumDataItem build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ForumDataItem)interceptResult.objValue; 
      } 
      return new ForumDataItem(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
