package tbclient.GetAddressList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class deleteList extends Message {
  public static Interceptable $ic;
  
  public static final List<friendList> DEFAULT_FRIEND_LIST = Collections.emptyList();
  
  public static final String DEFAULT_KEY = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<friendList> friend_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String key;
  
  public deleteList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<friendList> list;
    if (paramBoolean == true) {
      String str = paramBuilder.key;
      if (str == null) {
        this.key = "";
      } else {
        this.key = str;
      } 
      list = paramBuilder.friend_list;
      if (list == null) {
        this.friend_list = DEFAULT_FRIEND_LIST;
      } else {
        this.friend_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.key = ((Builder)list).key;
      this.friend_list = Message.immutableCopyOf(((Builder)list).friend_list);
    } 
  }
  
  public deleteList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1580210377, "Ltbclient/GetAddressList/deleteList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1580210377, "Ltbclient/GetAddressList/deleteList;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<deleteList> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<friendList> friend_list;
    
    public String key;
    
    public Builder() {}
    
    public Builder(deleteList param1deleteList) {
      super(param1deleteList);
      if (param1deleteList == null)
        return; 
      this.key = param1deleteList.key;
      this.friend_list = Message.copyOf(param1deleteList.friend_list);
    }
    
    public deleteList build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (deleteList)interceptResult.objValue; 
      } 
      return new deleteList(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
