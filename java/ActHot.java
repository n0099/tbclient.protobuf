package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ActHot extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_AUTHOR_NAME = "";
  
  public static final String DEFAULT_BSIZE = "";
  
  public static final String DEFAULT_IMG_DES = "";
  
  public static final String DEFAULT_IMG_SRC = "";
  
  public static final Integer DEFAULT_IMG_TYPE = Integer.valueOf(0);
  
  public static final String DEFAULT_LINK = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String author_name;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String bsize;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String img_des;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String img_src;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer img_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String link;
  
  public ActHot(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.bsize;
      if (str == null) {
        this.bsize = "";
      } else {
        this.bsize = str;
      } 
      str = paramBuilder.img_src;
      if (str == null) {
        this.img_src = "";
      } else {
        this.img_src = str;
      } 
      str = paramBuilder.link;
      if (str == null) {
        this.link = "";
      } else {
        this.link = str;
      } 
      str = paramBuilder.author_name;
      if (str == null) {
        this.author_name = "";
      } else {
        this.author_name = str;
      } 
      str = paramBuilder.img_des;
      if (str == null) {
        this.img_des = "";
      } else {
        this.img_des = str;
      } 
      integer = paramBuilder.img_type;
      if (integer == null) {
        this.img_type = DEFAULT_IMG_TYPE;
      } else {
        this.img_type = integer;
      } 
    } else {
      this.bsize = ((Builder)integer).bsize;
      this.img_src = ((Builder)integer).img_src;
      this.link = ((Builder)integer).link;
      this.author_name = ((Builder)integer).author_name;
      this.img_des = ((Builder)integer).img_des;
      this.img_type = ((Builder)integer).img_type;
    } 
  }
  
  public ActHot(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1015401194, "Ltbclient/ActHot;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1015401194, "Ltbclient/ActHot;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ActHot> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String author_name;
    
    public String bsize;
    
    public String img_des;
    
    public String img_src;
    
    public Integer img_type;
    
    public String link;
    
    public Builder() {}
    
    public Builder(ActHot param1ActHot) {
      super(param1ActHot);
      if (param1ActHot == null)
        return; 
      this.bsize = param1ActHot.bsize;
      this.img_src = param1ActHot.img_src;
      this.link = param1ActHot.link;
      this.author_name = param1ActHot.author_name;
      this.img_des = param1ActHot.img_des;
      this.img_type = param1ActHot.img_type;
    }
    
    public ActHot build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ActHot)interceptResult.objValue; 
      } 
      return new ActHot(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
