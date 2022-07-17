package tbclient.GetVerticalForumList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ClassForumInfo;
import tbclient.Page;

public final class DataRes extends Message {
  public static Interceptable $ic;
  
  public static final List<ClassForumInfo> DEFAULT_CLASS_FORUMINFO = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ClassForumInfo> class_foruminfo;
  
  @ProtoField(tag = 2)
  public final Page page;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<ClassForumInfo> list = paramBuilder.class_foruminfo;
      if (list == null) {
        this.class_foruminfo = DEFAULT_CLASS_FORUMINFO;
      } else {
        this.class_foruminfo = Message.immutableCopyOf(list);
      } 
      this.page = paramBuilder.page;
    } else {
      this.class_foruminfo = Message.immutableCopyOf(paramBuilder.class_foruminfo);
      this.page = paramBuilder.page;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1229076841, "Ltbclient/GetVerticalForumList/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1229076841, "Ltbclient/GetVerticalForumList/DataRes;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<ClassForumInfo> class_foruminfo;
    
    public Page page;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.class_foruminfo = Message.copyOf(param1DataRes.class_foruminfo);
      this.page = param1DataRes.page;
    }
    
    public DataRes build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DataRes)interceptResult.objValue; 
      } 
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
