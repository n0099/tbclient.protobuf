package tbclient.GetDislikeList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ForumList;

public final class DataRes extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_CUR_PAGE;
  
  public static final List<ForumList> DEFAULT_FORUM_LIST = Collections.emptyList();
  
  public static final Integer DEFAULT_HAS_MORE;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer cur_page;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ForumList> forum_list;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer has_more;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_HAS_MORE = integer;
    DEFAULT_CUR_PAGE = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<ForumList> list = paramBuilder.forum_list;
      if (list == null) {
        this.forum_list = DEFAULT_FORUM_LIST;
      } else {
        this.forum_list = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.has_more;
      if (integer1 == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer1;
      } 
      integer = paramBuilder.cur_page;
      if (integer == null) {
        this.cur_page = DEFAULT_CUR_PAGE;
      } else {
        this.cur_page = integer;
      } 
    } else {
      this.forum_list = Message.immutableCopyOf(((Builder)integer).forum_list);
      this.has_more = ((Builder)integer).has_more;
      this.cur_page = ((Builder)integer).cur_page;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(277296125, "Ltbclient/GetDislikeList/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(277296125, "Ltbclient/GetDislikeList/DataRes;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer cur_page;
    
    public List<ForumList> forum_list;
    
    public Integer has_more;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.forum_list = Message.copyOf(param1DataRes.forum_list);
      this.has_more = param1DataRes.has_more;
      this.cur_page = param1DataRes.cur_page;
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
