package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Baijiahao extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_FORWARD_URL = "";
  
  public static final String DEFAULT_ORI_UGC_NID = "";
  
  public static final String DEFAULT_ORI_UGC_TID = "";
  
  public static final Integer DEFAULT_ORI_UGC_TYPE = Integer.valueOf(0);
  
  public static final String DEFAULT_ORI_UGC_VID = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String forward_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String ori_ugc_nid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String ori_ugc_tid;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer ori_ugc_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String ori_ugc_vid;
  
  public Baijiahao(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.ori_ugc_nid;
      if (str2 == null) {
        this.ori_ugc_nid = "";
      } else {
        this.ori_ugc_nid = str2;
      } 
      str2 = paramBuilder.ori_ugc_tid;
      if (str2 == null) {
        this.ori_ugc_tid = "";
      } else {
        this.ori_ugc_tid = str2;
      } 
      Integer integer = paramBuilder.ori_ugc_type;
      if (integer == null) {
        this.ori_ugc_type = DEFAULT_ORI_UGC_TYPE;
      } else {
        this.ori_ugc_type = integer;
      } 
      String str1 = paramBuilder.ori_ugc_vid;
      if (str1 == null) {
        this.ori_ugc_vid = "";
      } else {
        this.ori_ugc_vid = str1;
      } 
      str = paramBuilder.forward_url;
      if (str == null) {
        this.forward_url = "";
      } else {
        this.forward_url = str;
      } 
    } else {
      this.ori_ugc_nid = ((Builder)str).ori_ugc_nid;
      this.ori_ugc_tid = ((Builder)str).ori_ugc_tid;
      this.ori_ugc_type = ((Builder)str).ori_ugc_type;
      this.ori_ugc_vid = ((Builder)str).ori_ugc_vid;
      this.forward_url = ((Builder)str).forward_url;
    } 
  }
  
  public Baijiahao(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(987515783, "Ltbclient/Baijiahao;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(987515783, "Ltbclient/Baijiahao;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<Baijiahao> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String forward_url;
    
    public String ori_ugc_nid;
    
    public String ori_ugc_tid;
    
    public Integer ori_ugc_type;
    
    public String ori_ugc_vid;
    
    public Builder() {}
    
    public Builder(Baijiahao param1Baijiahao) {
      super(param1Baijiahao);
      if (param1Baijiahao == null)
        return; 
      this.ori_ugc_nid = param1Baijiahao.ori_ugc_nid;
      this.ori_ugc_tid = param1Baijiahao.ori_ugc_tid;
      this.ori_ugc_type = param1Baijiahao.ori_ugc_type;
      this.ori_ugc_vid = param1Baijiahao.ori_ugc_vid;
      this.forward_url = param1Baijiahao.forward_url;
    }
    
    public Baijiahao build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Baijiahao)interceptResult.objValue; 
      } 
      return new Baijiahao(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
