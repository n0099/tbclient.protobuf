package tbclient.GetForumSquare;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Page;
import tbclient.RecommendForumInfo;

public final class DataRes extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_CLASS_NAME = "";
  
  public static final List<RecommendForumInfo> DEFAULT_FORUM_INFO;
  
  public static final List<String> DEFAULT_PAGE_STRUCTURE = Collections.emptyList();
  
  public static final List<String> DEFAULT_SECOND_CLASS_LIST;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String class_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<RecommendForumInfo> forum_info;
  
  @ProtoField(tag = 3)
  public final Page page;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
  public final List<String> page_structure;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
  public final List<String> second_class_list;
  
  static {
    DEFAULT_FORUM_INFO = Collections.emptyList();
    DEFAULT_SECOND_CLASS_LIST = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<String> list;
    if (paramBoolean == true) {
      List<String> list2 = paramBuilder.page_structure;
      if (list2 == null) {
        this.page_structure = DEFAULT_PAGE_STRUCTURE;
      } else {
        this.page_structure = Message.immutableCopyOf(list2);
      } 
      List<RecommendForumInfo> list1 = paramBuilder.forum_info;
      if (list1 == null) {
        this.forum_info = DEFAULT_FORUM_INFO;
      } else {
        this.forum_info = Message.immutableCopyOf(list1);
      } 
      this.page = paramBuilder.page;
      String str = paramBuilder.class_name;
      if (str == null) {
        this.class_name = "";
      } else {
        this.class_name = str;
      } 
      list = paramBuilder.second_class_list;
      if (list == null) {
        this.second_class_list = DEFAULT_SECOND_CLASS_LIST;
      } else {
        this.second_class_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.page_structure = Message.immutableCopyOf(((Builder)list).page_structure);
      this.forum_info = Message.immutableCopyOf(((Builder)list).forum_info);
      this.page = ((Builder)list).page;
      this.class_name = ((Builder)list).class_name;
      this.second_class_list = Message.immutableCopyOf(((Builder)list).second_class_list);
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-2088265694, "Ltbclient/GetForumSquare/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-2088265694, "Ltbclient/GetForumSquare/DataRes;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String class_name;
    
    public List<RecommendForumInfo> forum_info;
    
    public Page page;
    
    public List<String> page_structure;
    
    public List<String> second_class_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.page_structure = Message.copyOf(param1DataRes.page_structure);
      this.forum_info = Message.copyOf(param1DataRes.forum_info);
      this.page = param1DataRes.page;
      this.class_name = param1DataRes.class_name;
      this.second_class_list = Message.copyOf(param1DataRes.second_class_list);
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
