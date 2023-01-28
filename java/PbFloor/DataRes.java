package tbclient.PbFloor;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Anti;
import tbclient.Page;
import tbclient.Post;
import tbclient.SimpleForum;
import tbclient.SubPostList;
import tbclient.ThreadInfo;

public final class DataRes extends Message {
  public static final Integer DEFAULT_IS_BLACK_WHITE;
  
  public static final Integer DEFAULT_SERVER_TIME;
  
  public static final List<SubPostList> DEFAULT_SUBPOST_LIST = Collections.emptyList();
  
  @ProtoField(tag = 2)
  public final Anti anti;
  
  @ProtoField(tag = 8)
  public final SimpleForum display_forum;
  
  @ProtoField(tag = 6)
  public final SimpleForum forum;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer is_black_white;
  
  @ProtoField(tag = 1)
  public final Page page;
  
  @ProtoField(tag = 3)
  public final Post post;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer server_time;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<SubPostList> subpost_list;
  
  @ProtoField(tag = 5)
  public final ThreadInfo thread;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_SERVER_TIME = integer;
    DEFAULT_IS_BLACK_WHITE = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.page = paramBuilder.page;
      this.anti = paramBuilder.anti;
      this.post = paramBuilder.post;
      List<SubPostList> list = paramBuilder.subpost_list;
      if (list == null) {
        this.subpost_list = DEFAULT_SUBPOST_LIST;
      } else {
        this.subpost_list = Message.immutableCopyOf(list);
      } 
      this.thread = paramBuilder.thread;
      this.forum = paramBuilder.forum;
      Integer integer1 = paramBuilder.server_time;
      if (integer1 == null) {
        this.server_time = DEFAULT_SERVER_TIME;
      } else {
        this.server_time = integer1;
      } 
      this.display_forum = paramBuilder.display_forum;
      integer = paramBuilder.is_black_white;
      if (integer == null) {
        this.is_black_white = DEFAULT_IS_BLACK_WHITE;
      } else {
        this.is_black_white = integer;
      } 
    } else {
      this.page = ((Builder)integer).page;
      this.anti = ((Builder)integer).anti;
      this.post = ((Builder)integer).post;
      this.subpost_list = Message.immutableCopyOf(((Builder)integer).subpost_list);
      this.thread = ((Builder)integer).thread;
      this.forum = ((Builder)integer).forum;
      this.server_time = ((Builder)integer).server_time;
      this.display_forum = ((Builder)integer).display_forum;
      this.is_black_white = ((Builder)integer).is_black_white;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public Anti anti;
    
    public SimpleForum display_forum;
    
    public SimpleForum forum;
    
    public Integer is_black_white;
    
    public Page page;
    
    public Post post;
    
    public Integer server_time;
    
    public List<SubPostList> subpost_list;
    
    public ThreadInfo thread;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.page = param1DataRes.page;
      this.anti = param1DataRes.anti;
      this.post = param1DataRes.post;
      this.subpost_list = Message.copyOf(param1DataRes.subpost_list);
      this.thread = param1DataRes.thread;
      this.forum = param1DataRes.forum;
      this.server_time = param1DataRes.server_time;
      this.display_forum = param1DataRes.display_forum;
      this.is_black_white = param1DataRes.is_black_white;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
