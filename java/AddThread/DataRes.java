package tbclient.AddThread;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Advertisement;
import tbclient.Anti;
import tbclient.ContriInfo;
import tbclient.IconStampInfo;
import tbclient.PostAntiInfo;
import tbclient.ReplyExp;
import tbclient.TbInteraction;
import tbclient.ThreadEasterEgg;
import tbclient.VcodeInfo;
import tbclient.ZhiBoInfoTW;

public final class DataRes extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_COLOR_MSG = "";
  
  public static final String DEFAULT_EXT_MSG = "";
  
  public static final String DEFAULT_MSG = "";
  
  public static final String DEFAULT_OPGROUP = "";
  
  public static final String DEFAULT_PID = "";
  
  public static final String DEFAULT_PRE_MSG = "";
  
  public static final String DEFAULT_TID = "";
  
  public static final String DEFAULT_VIDEO_ID = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 12)
  public final Advertisement advertisement;
  
  @ProtoField(tag = 17)
  public final VcodeInfo anti;
  
  @ProtoField(tag = 15)
  public final Anti anti_stat;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String color_msg;
  
  @ProtoField(tag = 10)
  public final ContriInfo contri_info;
  
  @ProtoField(tag = 9)
  public final ReplyExp exp;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String ext_msg;
  
  @ProtoField(tag = 13)
  public final IconStampInfo icon_stamp_info;
  
  @ProtoField(tag = 14)
  public final PostAntiInfo info;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String msg;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String opgroup;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String pid;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String pre_msg;
  
  @ProtoField(tag = 11)
  public final ThreadEasterEgg star_info;
  
  @ProtoField(tag = 16)
  public final TbInteraction tb_hudong;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String tid;
  
  @ProtoField(tag = 8)
  public final ZhiBoInfoTW twzhibo_info;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String video_id;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.opgroup;
      if (str1 == null) {
        this.opgroup = "";
      } else {
        this.opgroup = str1;
      } 
      str1 = paramBuilder.tid;
      if (str1 == null) {
        this.tid = "";
      } else {
        this.tid = str1;
      } 
      str1 = paramBuilder.pid;
      if (str1 == null) {
        this.pid = "";
      } else {
        this.pid = str1;
      } 
      str1 = paramBuilder.video_id;
      if (str1 == null) {
        this.video_id = "";
      } else {
        this.video_id = str1;
      } 
      str1 = paramBuilder.msg;
      if (str1 == null) {
        this.msg = "";
      } else {
        this.msg = str1;
      } 
      str1 = paramBuilder.pre_msg;
      if (str1 == null) {
        this.pre_msg = "";
      } else {
        this.pre_msg = str1;
      } 
      str1 = paramBuilder.color_msg;
      if (str1 == null) {
        this.color_msg = "";
      } else {
        this.color_msg = str1;
      } 
      this.twzhibo_info = paramBuilder.twzhibo_info;
      this.exp = paramBuilder.exp;
      this.contri_info = paramBuilder.contri_info;
      this.star_info = paramBuilder.star_info;
      this.advertisement = paramBuilder.advertisement;
      this.icon_stamp_info = paramBuilder.icon_stamp_info;
      this.info = paramBuilder.info;
      this.anti_stat = paramBuilder.anti_stat;
      this.tb_hudong = paramBuilder.tb_hudong;
      this.anti = paramBuilder.anti;
      str = paramBuilder.ext_msg;
      if (str == null) {
        this.ext_msg = "";
      } else {
        this.ext_msg = str;
      } 
    } else {
      this.opgroup = ((Builder)str).opgroup;
      this.tid = ((Builder)str).tid;
      this.pid = ((Builder)str).pid;
      this.video_id = ((Builder)str).video_id;
      this.msg = ((Builder)str).msg;
      this.pre_msg = ((Builder)str).pre_msg;
      this.color_msg = ((Builder)str).color_msg;
      this.twzhibo_info = ((Builder)str).twzhibo_info;
      this.exp = ((Builder)str).exp;
      this.contri_info = ((Builder)str).contri_info;
      this.star_info = ((Builder)str).star_info;
      this.advertisement = ((Builder)str).advertisement;
      this.icon_stamp_info = ((Builder)str).icon_stamp_info;
      this.info = ((Builder)str).info;
      this.anti_stat = ((Builder)str).anti_stat;
      this.tb_hudong = ((Builder)str).tb_hudong;
      this.anti = ((Builder)str).anti;
      this.ext_msg = ((Builder)str).ext_msg;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Advertisement advertisement;
    
    public VcodeInfo anti;
    
    public Anti anti_stat;
    
    public String color_msg;
    
    public ContriInfo contri_info;
    
    public ReplyExp exp;
    
    public String ext_msg;
    
    public IconStampInfo icon_stamp_info;
    
    public PostAntiInfo info;
    
    public String msg;
    
    public String opgroup;
    
    public String pid;
    
    public String pre_msg;
    
    public ThreadEasterEgg star_info;
    
    public TbInteraction tb_hudong;
    
    public String tid;
    
    public ZhiBoInfoTW twzhibo_info;
    
    public String video_id;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.opgroup = param1DataRes.opgroup;
      this.tid = param1DataRes.tid;
      this.pid = param1DataRes.pid;
      this.video_id = param1DataRes.video_id;
      this.msg = param1DataRes.msg;
      this.pre_msg = param1DataRes.pre_msg;
      this.color_msg = param1DataRes.color_msg;
      this.twzhibo_info = param1DataRes.twzhibo_info;
      this.exp = param1DataRes.exp;
      this.contri_info = param1DataRes.contri_info;
      this.star_info = param1DataRes.star_info;
      this.advertisement = param1DataRes.advertisement;
      this.icon_stamp_info = param1DataRes.icon_stamp_info;
      this.info = param1DataRes.info;
      this.anti_stat = param1DataRes.anti_stat;
      this.tb_hudong = param1DataRes.tb_hudong;
      this.anti = param1DataRes.anti;
      this.ext_msg = param1DataRes.ext_msg;
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
