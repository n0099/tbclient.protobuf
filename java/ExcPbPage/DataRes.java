package tbclient.ExcPbPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Post;
import tbclient.User;

public final class DataRes extends Message {
  public static Interceptable $ic;
  
  public static final List<Post> DEFAULT_POST_LIST = Collections.emptyList();
  
  public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<Post> post_list;
  
  @ProtoField(tag = 1)
  public final ExcellentPbThreadInfo thread_info;
  
  @ProtoField(tag = 4)
  public final UserInfo user_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<User> user_list;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.thread_info = paramBuilder.thread_info;
      List<Post> list1 = paramBuilder.post_list;
      if (list1 == null) {
        this.post_list = DEFAULT_POST_LIST;
      } else {
        this.post_list = Message.immutableCopyOf(list1);
      } 
      List<User> list = paramBuilder.user_list;
      if (list == null) {
        this.user_list = DEFAULT_USER_LIST;
      } else {
        this.user_list = Message.immutableCopyOf(list);
      } 
      this.user_info = paramBuilder.user_info;
    } else {
      this.thread_info = paramBuilder.thread_info;
      this.post_list = Message.immutableCopyOf(paramBuilder.post_list);
      this.user_list = Message.immutableCopyOf(paramBuilder.user_list);
      this.user_info = paramBuilder.user_info;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(853657453, "Ltbclient/ExcPbPage/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(853657453, "Ltbclient/ExcPbPage/DataRes;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<Post> post_list;
    
    public ExcellentPbThreadInfo thread_info;
    
    public UserInfo user_info;
    
    public List<User> user_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.thread_info = param1DataRes.thread_info;
      this.post_list = Message.copyOf(param1DataRes.post_list);
      this.user_list = Message.copyOf(param1DataRes.user_list);
      this.user_info = param1DataRes.user_info;
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
