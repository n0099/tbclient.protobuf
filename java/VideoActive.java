package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class VideoActive extends Message {
  public static final String DEFAULT_ACTIVE_NAME = "";
  
  public static final String DEFAULT_ACTIVE_URL = "";
  
  public static final String DEFAULT_BANNER_URL = "";
  
  public static final String DEFAULT_DESCRIPTION = "";
  
  public static final Integer DEFAULT_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_NATIVE_URL = "";
  
  public static final String DEFAULT_REMARK = "";
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String active_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String active_url;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String banner_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String description;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String native_url;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String remark;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8)
  public final List<ThreadInfo> thread_list;
  
  public VideoActive(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ThreadInfo> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.id;
      if (integer == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer;
      } 
      String str = paramBuilder.active_name;
      if (str == null) {
        this.active_name = "";
      } else {
        this.active_name = str;
      } 
      str = paramBuilder.active_url;
      if (str == null) {
        this.active_url = "";
      } else {
        this.active_url = str;
      } 
      str = paramBuilder.native_url;
      if (str == null) {
        this.native_url = "";
      } else {
        this.native_url = str;
      } 
      str = paramBuilder.description;
      if (str == null) {
        this.description = "";
      } else {
        this.description = str;
      } 
      str = paramBuilder.banner_url;
      if (str == null) {
        this.banner_url = "";
      } else {
        this.banner_url = str;
      } 
      str = paramBuilder.remark;
      if (str == null) {
        this.remark = "";
      } else {
        this.remark = str;
      } 
      list = paramBuilder.thread_list;
      if (list == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.id = ((Builder)list).id;
      this.active_name = ((Builder)list).active_name;
      this.active_url = ((Builder)list).active_url;
      this.native_url = ((Builder)list).native_url;
      this.description = ((Builder)list).description;
      this.banner_url = ((Builder)list).banner_url;
      this.remark = ((Builder)list).remark;
      this.thread_list = Message.immutableCopyOf(((Builder)list).thread_list);
    } 
  }
  
  public VideoActive(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<VideoActive> {
    public String active_name;
    
    public String active_url;
    
    public String banner_url;
    
    public String description;
    
    public Integer id;
    
    public String native_url;
    
    public String remark;
    
    public List<ThreadInfo> thread_list;
    
    public Builder() {}
    
    public Builder(VideoActive param1VideoActive) {
      super(param1VideoActive);
      if (param1VideoActive == null)
        return; 
      this.id = param1VideoActive.id;
      this.active_name = param1VideoActive.active_name;
      this.active_url = param1VideoActive.active_url;
      this.native_url = param1VideoActive.native_url;
      this.description = param1VideoActive.description;
      this.banner_url = param1VideoActive.banner_url;
      this.remark = param1VideoActive.remark;
      this.thread_list = Message.copyOf(param1VideoActive.thread_list);
    }
    
    public VideoActive build(boolean param1Boolean) {
      return new VideoActive(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
