package tbclient.GetForumClassList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ForumSquareDirs extends Message {
  public static Interceptable $ic;
  
  public static final List<ChildDir> DEFAULT_FORUM_LIST;
  
  public static final Long DEFAULT_ID;
  
  public static final String DEFAULT_LINK = "";
  
  public static final String DEFAULT_PIC = "";
  
  public static final Long DEFAULT_TIME;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TORDER;
  
  public static final Integer DEFAULT_TYPE;
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<ChildDir> forum_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long id;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String pic;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT64)
  public final Long time;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer torder;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer type;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(985195909, "Ltbclient/GetForumClassList/ForumSquareDirs;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(985195909, "Ltbclient/GetForumClassList/ForumSquareDirs;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_TORDER = integer;
    DEFAULT_TYPE = integer;
    DEFAULT_FORUM_LIST = Collections.emptyList();
    DEFAULT_TIME = long_;
  }
  
  public ForumSquareDirs(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_1 = paramBuilder.id;
      if (long_1 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_1;
      } 
      String str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      Integer integer = paramBuilder.torder;
      if (integer == null) {
        this.torder = DEFAULT_TORDER;
      } else {
        this.torder = integer;
      } 
      integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      String str1 = paramBuilder.link;
      if (str1 == null) {
        this.link = "";
      } else {
        this.link = str1;
      } 
      str1 = paramBuilder.pic;
      if (str1 == null) {
        this.pic = "";
      } else {
        this.pic = str1;
      } 
      List<ChildDir> list = paramBuilder.forum_list;
      if (list == null) {
        this.forum_list = DEFAULT_FORUM_LIST;
      } else {
        this.forum_list = Message.immutableCopyOf(list);
      } 
      long_ = paramBuilder.time;
      if (long_ == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = long_;
      } 
    } else {
      this.id = ((Builder)long_).id;
      this.title = ((Builder)long_).title;
      this.torder = ((Builder)long_).torder;
      this.type = ((Builder)long_).type;
      this.link = ((Builder)long_).link;
      this.pic = ((Builder)long_).pic;
      this.forum_list = Message.immutableCopyOf(((Builder)long_).forum_list);
      this.time = ((Builder)long_).time;
    } 
  }
  
  public ForumSquareDirs(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumSquareDirs> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<ChildDir> forum_list;
    
    public Long id;
    
    public String link;
    
    public String pic;
    
    public Long time;
    
    public String title;
    
    public Integer torder;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(ForumSquareDirs param1ForumSquareDirs) {
      super(param1ForumSquareDirs);
      if (param1ForumSquareDirs == null)
        return; 
      this.id = param1ForumSquareDirs.id;
      this.title = param1ForumSquareDirs.title;
      this.torder = param1ForumSquareDirs.torder;
      this.type = param1ForumSquareDirs.type;
      this.link = param1ForumSquareDirs.link;
      this.pic = param1ForumSquareDirs.pic;
      this.forum_list = Message.copyOf(param1ForumSquareDirs.forum_list);
      this.time = param1ForumSquareDirs.time;
    }
    
    public ForumSquareDirs build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ForumSquareDirs)interceptResult.objValue; 
      } 
      return new ForumSquareDirs(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
