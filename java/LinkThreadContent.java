package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class LinkThreadContent extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_LINK_ABSTRACT = "";
  
  public static final String DEFAULT_LINK_HEAD_BIG_PIC = "";
  
  public static final String DEFAULT_LINK_HEAD_PIC = "";
  
  public static final String DEFAULT_LINK_HEAD_SMALL_PIC = "";
  
  public static final String DEFAULT_LINK_TITLE = "";
  
  public static final Integer DEFAULT_LINK_TYPE = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String link_abstract;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String link_head_big_pic;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String link_head_pic;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String link_head_small_pic;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String link_title;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer link_type;
  
  public LinkThreadContent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.link_type;
      if (integer == null) {
        this.link_type = DEFAULT_LINK_TYPE;
      } else {
        this.link_type = integer;
      } 
      String str1 = paramBuilder.link_title;
      if (str1 == null) {
        this.link_title = "";
      } else {
        this.link_title = str1;
      } 
      str1 = paramBuilder.link_abstract;
      if (str1 == null) {
        this.link_abstract = "";
      } else {
        this.link_abstract = str1;
      } 
      str1 = paramBuilder.link_head_pic;
      if (str1 == null) {
        this.link_head_pic = "";
      } else {
        this.link_head_pic = str1;
      } 
      str1 = paramBuilder.link_head_small_pic;
      if (str1 == null) {
        this.link_head_small_pic = "";
      } else {
        this.link_head_small_pic = str1;
      } 
      str = paramBuilder.link_head_big_pic;
      if (str == null) {
        this.link_head_big_pic = "";
      } else {
        this.link_head_big_pic = str;
      } 
    } else {
      this.link_type = ((Builder)str).link_type;
      this.link_title = ((Builder)str).link_title;
      this.link_abstract = ((Builder)str).link_abstract;
      this.link_head_pic = ((Builder)str).link_head_pic;
      this.link_head_small_pic = ((Builder)str).link_head_small_pic;
      this.link_head_big_pic = ((Builder)str).link_head_big_pic;
    } 
  }
  
  public LinkThreadContent(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1273981936, "Ltbclient/LinkThreadContent;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1273981936, "Ltbclient/LinkThreadContent;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<LinkThreadContent> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String link_abstract;
    
    public String link_head_big_pic;
    
    public String link_head_pic;
    
    public String link_head_small_pic;
    
    public String link_title;
    
    public Integer link_type;
    
    public Builder() {}
    
    public Builder(LinkThreadContent param1LinkThreadContent) {
      super(param1LinkThreadContent);
      if (param1LinkThreadContent == null)
        return; 
      this.link_type = param1LinkThreadContent.link_type;
      this.link_title = param1LinkThreadContent.link_title;
      this.link_abstract = param1LinkThreadContent.link_abstract;
      this.link_head_pic = param1LinkThreadContent.link_head_pic;
      this.link_head_small_pic = param1LinkThreadContent.link_head_small_pic;
      this.link_head_big_pic = param1LinkThreadContent.link_head_big_pic;
    }
    
    public LinkThreadContent build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (LinkThreadContent)interceptResult.objValue; 
      } 
      return new LinkThreadContent(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
