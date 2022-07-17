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

public final class PbTopAgreePost extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_FORUM_TOP_LIST = "";
  
  public static final List<Long> DEFAULT_POST_ID_LIST;
  
  public static final List<Post> DEFAULT_POST_LIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String forum_top_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.INT64)
  public final List<Long> post_id_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<Post> post_list;
  
  static {
    DEFAULT_POST_ID_LIST = Collections.emptyList();
  }
  
  public PbTopAgreePost(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      List<Post> list1 = paramBuilder.post_list;
      if (list1 == null) {
        this.post_list = DEFAULT_POST_LIST;
      } else {
        this.post_list = Message.immutableCopyOf(list1);
      } 
      List<Long> list = paramBuilder.post_id_list;
      if (list == null) {
        this.post_id_list = DEFAULT_POST_ID_LIST;
      } else {
        this.post_id_list = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.forum_top_list;
      if (str == null) {
        this.forum_top_list = "";
      } else {
        this.forum_top_list = str;
      } 
    } else {
      this.post_list = Message.immutableCopyOf(((Builder)str).post_list);
      this.post_id_list = Message.immutableCopyOf(((Builder)str).post_id_list);
      this.forum_top_list = ((Builder)str).forum_top_list;
    } 
  }
  
  public PbTopAgreePost(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-2011550584, "Ltbclient/PbTopAgreePost;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-2011550584, "Ltbclient/PbTopAgreePost;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<PbTopAgreePost> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String forum_top_list;
    
    public List<Long> post_id_list;
    
    public List<Post> post_list;
    
    public Builder() {}
    
    public Builder(PbTopAgreePost param1PbTopAgreePost) {
      super(param1PbTopAgreePost);
      if (param1PbTopAgreePost == null)
        return; 
      this.post_list = Message.copyOf(param1PbTopAgreePost.post_list);
      this.post_id_list = Message.copyOf(param1PbTopAgreePost.post_id_list);
      this.forum_top_list = param1PbTopAgreePost.forum_top_list;
    }
    
    public PbTopAgreePost build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (PbTopAgreePost)interceptResult.objValue; 
      } 
      return new PbTopAgreePost(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
