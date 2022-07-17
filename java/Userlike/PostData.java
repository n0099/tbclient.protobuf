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
import tbclient.PbContent;
import tbclient.User;

public final class PostData extends Message {
  public static Interceptable $ic;
  
  public static final List<PbContent> DEFAULT_CONTENT;
  
  public static final Long DEFAULT_ID;
  
  public static final String DEFAULT_POST_TITLE = "";
  
  public static final Long DEFAULT_TIME;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4)
  public final User author;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<PbContent> content;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String post_title;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT64)
  public final Long time;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1705475218, "Ltbclient/Userlike/PostData;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1705475218, "Ltbclient/Userlike/PostData;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_ID = long_;
    DEFAULT_CONTENT = Collections.emptyList();
    DEFAULT_TIME = long_;
  }
  
  public PostData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_1 = paramBuilder.id;
      if (long_1 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_1;
      } 
      List<PbContent> list = paramBuilder.content;
      if (list == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list);
      } 
      String str = paramBuilder.post_title;
      if (str == null) {
        this.post_title = "";
      } else {
        this.post_title = str;
      } 
      this.author = paramBuilder.author;
      long_ = paramBuilder.time;
      if (long_ == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = long_;
      } 
    } else {
      this.id = ((Builder)long_).id;
      this.content = Message.immutableCopyOf(((Builder)long_).content);
      this.post_title = ((Builder)long_).post_title;
      this.author = ((Builder)long_).author;
      this.time = ((Builder)long_).time;
    } 
  }
  
  public PostData(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PostData> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public User author;
    
    public List<PbContent> content;
    
    public Long id;
    
    public String post_title;
    
    public Long time;
    
    public Builder() {}
    
    public Builder(PostData param1PostData) {
      super(param1PostData);
      if (param1PostData == null)
        return; 
      this.id = param1PostData.id;
      this.content = Message.copyOf(param1PostData.content);
      this.post_title = param1PostData.post_title;
      this.author = param1PostData.author;
      this.time = param1PostData.time;
    }
    
    public PostData build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (PostData)interceptResult.objValue; 
      } 
      return new PostData(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
