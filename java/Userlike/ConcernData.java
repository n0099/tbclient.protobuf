package tbclient.Userlike;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
import tbclient.User;

public final class ConcernData extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_RECOM_TYPE;
  
  public static final List<User> DEFAULT_RECOM_USER_LIST;
  
  public static final Integer DEFAULT_SOURCE;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2)
  public final PostData post_data;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer recom_type;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<User> recom_user_list;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer source;
  
  @ProtoField(tag = 1)
  public final ThreadInfo thread_list;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1005888404, "Ltbclient/Userlike/ConcernData;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1005888404, "Ltbclient/Userlike/ConcernData;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_RECOM_TYPE = integer;
    DEFAULT_SOURCE = integer;
    DEFAULT_RECOM_USER_LIST = Collections.emptyList();
  }
  
  public ConcernData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<User> list;
    if (paramBoolean == true) {
      this.thread_list = paramBuilder.thread_list;
      this.post_data = paramBuilder.post_data;
      Integer integer = paramBuilder.recom_type;
      if (integer == null) {
        this.recom_type = DEFAULT_RECOM_TYPE;
      } else {
        this.recom_type = integer;
      } 
      integer = paramBuilder.source;
      if (integer == null) {
        this.source = DEFAULT_SOURCE;
      } else {
        this.source = integer;
      } 
      list = paramBuilder.recom_user_list;
      if (list == null) {
        this.recom_user_list = DEFAULT_RECOM_USER_LIST;
      } else {
        this.recom_user_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.thread_list = ((Builder)list).thread_list;
      this.post_data = ((Builder)list).post_data;
      this.recom_type = ((Builder)list).recom_type;
      this.source = ((Builder)list).source;
      this.recom_user_list = Message.immutableCopyOf(((Builder)list).recom_user_list);
    } 
  }
  
  public ConcernData(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ConcernData> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public PostData post_data;
    
    public Integer recom_type;
    
    public List<User> recom_user_list;
    
    public Integer source;
    
    public ThreadInfo thread_list;
    
    public Builder() {}
    
    public Builder(ConcernData param1ConcernData) {
      super(param1ConcernData);
      if (param1ConcernData == null)
        return; 
      this.thread_list = param1ConcernData.thread_list;
      this.post_data = param1ConcernData.post_data;
      this.recom_type = param1ConcernData.recom_type;
      this.source = param1ConcernData.source;
      this.recom_user_list = Message.copyOf(param1ConcernData.recom_user_list);
    }
    
    public ConcernData build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ConcernData)interceptResult.objValue; 
      } 
      return new ConcernData(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
