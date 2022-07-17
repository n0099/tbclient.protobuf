package tbclient.CheckPost;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class ReqData extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_FORUMNAME = "";
  
  public static final String DEFAULT_ORI_UGC_NID = "";
  
  public static final String DEFAULT_ORI_UGC_TID = "";
  
  public static final Integer DEFAULT_ORI_UGC_TYPE;
  
  public static final String DEFAULT_ORI_UGC_VID = "";
  
  public static final Long DEFAULT_PID;
  
  public static final Integer DEFAULT_POSTTYPE;
  
  public static final Long DEFAULT_TID;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String forumName;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String ori_ugc_nid;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String ori_ugc_tid;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer ori_ugc_type;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String ori_ugc_vid;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long pid;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer postType;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT64)
  public final Long tid;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(810490564, "Ltbclient/CheckPost/ReqData;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(810490564, "Ltbclient/CheckPost/ReqData;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_PID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_POSTTYPE = integer;
    DEFAULT_TID = long_;
    DEFAULT_ORI_UGC_TYPE = integer;
  }
  
  public ReqData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.pid;
      if (long_2 == null) {
        this.pid = DEFAULT_PID;
      } else {
        this.pid = long_2;
      } 
      Integer integer2 = paramBuilder.postType;
      if (integer2 == null) {
        this.postType = DEFAULT_POSTTYPE;
      } else {
        this.postType = integer2;
      } 
      String str2 = paramBuilder.forumName;
      if (str2 == null) {
        this.forumName = "";
      } else {
        this.forumName = str2;
      } 
      this.common = paramBuilder.common;
      Long long_1 = paramBuilder.tid;
      if (long_1 == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_1;
      } 
      Integer integer1 = paramBuilder.ori_ugc_type;
      if (integer1 == null) {
        this.ori_ugc_type = DEFAULT_ORI_UGC_TYPE;
      } else {
        this.ori_ugc_type = integer1;
      } 
      String str1 = paramBuilder.ori_ugc_nid;
      if (str1 == null) {
        this.ori_ugc_nid = "";
      } else {
        this.ori_ugc_nid = str1;
      } 
      str1 = paramBuilder.ori_ugc_vid;
      if (str1 == null) {
        this.ori_ugc_vid = "";
      } else {
        this.ori_ugc_vid = str1;
      } 
      str = paramBuilder.ori_ugc_tid;
      if (str == null) {
        this.ori_ugc_tid = "";
      } else {
        this.ori_ugc_tid = str;
      } 
    } else {
      this.pid = ((Builder)str).pid;
      this.postType = ((Builder)str).postType;
      this.forumName = ((Builder)str).forumName;
      this.common = ((Builder)str).common;
      this.tid = ((Builder)str).tid;
      this.ori_ugc_type = ((Builder)str).ori_ugc_type;
      this.ori_ugc_nid = ((Builder)str).ori_ugc_nid;
      this.ori_ugc_vid = ((Builder)str).ori_ugc_vid;
      this.ori_ugc_tid = ((Builder)str).ori_ugc_tid;
    } 
  }
  
  public ReqData(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ReqData> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public CommonReq common;
    
    public String forumName;
    
    public String ori_ugc_nid;
    
    public String ori_ugc_tid;
    
    public Integer ori_ugc_type;
    
    public String ori_ugc_vid;
    
    public Long pid;
    
    public Integer postType;
    
    public Long tid;
    
    public Builder() {}
    
    public Builder(ReqData param1ReqData) {
      super(param1ReqData);
      if (param1ReqData == null)
        return; 
      this.pid = param1ReqData.pid;
      this.postType = param1ReqData.postType;
      this.forumName = param1ReqData.forumName;
      this.common = param1ReqData.common;
      this.tid = param1ReqData.tid;
      this.ori_ugc_type = param1ReqData.ori_ugc_type;
      this.ori_ugc_nid = param1ReqData.ori_ugc_nid;
      this.ori_ugc_vid = param1ReqData.ori_ugc_vid;
      this.ori_ugc_tid = param1ReqData.ori_ugc_tid;
    }
    
    public ReqData build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ReqData)interceptResult.objValue; 
      } 
      return new ReqData(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
