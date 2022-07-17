package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class RecommendInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final List<SchoolRecomUserInfo> DEFAULT_USER_LIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<SchoolRecomUserInfo> user_list;
  
  public RecommendInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<SchoolRecomUserInfo> list;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      list = paramBuilder.user_list;
      if (list == null) {
        this.user_list = DEFAULT_USER_LIST;
      } else {
        this.user_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.title = ((Builder)list).title;
      this.user_list = Message.immutableCopyOf(((Builder)list).user_list);
    } 
  }
  
  public RecommendInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1375698267, "Ltbclient/RecommendInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1375698267, "Ltbclient/RecommendInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<RecommendInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String title;
    
    public List<SchoolRecomUserInfo> user_list;
    
    public Builder() {}
    
    public Builder(RecommendInfo param1RecommendInfo) {
      super(param1RecommendInfo);
      if (param1RecommendInfo == null)
        return; 
      this.title = param1RecommendInfo.title;
      this.user_list = Message.copyOf(param1RecommendInfo.user_list);
    }
    
    public RecommendInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (RecommendInfo)interceptResult.objValue; 
      } 
      return new RecommendInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
