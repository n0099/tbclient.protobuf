package tbclient.UnreadTip;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class DataRes extends Message {
  public static final Long DEFAULT_HIDE_UNIX;
  
  public static final List<String> DEFAULT_PORTRAIT_LIST;
  
  public static final String DEFAULT_SHOW_TIP = "";
  
  public static final Integer DEFAULT_THREAD_COUNT;
  
  public static final Integer DEFAULT_USER_COUNT;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long hide_unix;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
  public final List<String> portrait_list;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String show_tip;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer thread_count;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer user_count;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_USER_COUNT = integer;
    DEFAULT_PORTRAIT_LIST = Collections.emptyList();
    DEFAULT_HIDE_UNIX = Long.valueOf(0L);
    DEFAULT_THREAD_COUNT = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.user_count;
      if (integer1 == null) {
        this.user_count = DEFAULT_USER_COUNT;
      } else {
        this.user_count = integer1;
      } 
      List<String> list = paramBuilder.portrait_list;
      if (list == null) {
        this.portrait_list = DEFAULT_PORTRAIT_LIST;
      } else {
        this.portrait_list = Message.immutableCopyOf(list);
      } 
      Long long_ = paramBuilder.hide_unix;
      if (long_ == null) {
        this.hide_unix = DEFAULT_HIDE_UNIX;
      } else {
        this.hide_unix = long_;
      } 
      String str = paramBuilder.show_tip;
      if (str == null) {
        this.show_tip = "";
      } else {
        this.show_tip = str;
      } 
      integer = paramBuilder.thread_count;
      if (integer == null) {
        this.thread_count = DEFAULT_THREAD_COUNT;
      } else {
        this.thread_count = integer;
      } 
    } else {
      this.user_count = ((Builder)integer).user_count;
      this.portrait_list = Message.immutableCopyOf(((Builder)integer).portrait_list);
      this.hide_unix = ((Builder)integer).hide_unix;
      this.show_tip = ((Builder)integer).show_tip;
      this.thread_count = ((Builder)integer).thread_count;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public Long hide_unix;
    
    public List<String> portrait_list;
    
    public String show_tip;
    
    public Integer thread_count;
    
    public Integer user_count;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.user_count = param1DataRes.user_count;
      this.portrait_list = Message.copyOf(param1DataRes.portrait_list);
      this.hide_unix = param1DataRes.hide_unix;
      this.show_tip = param1DataRes.show_tip;
      this.thread_count = param1DataRes.thread_count;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
